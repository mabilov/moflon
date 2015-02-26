package org.moflon.moca.usecase.parser;
import java.io.IOException;
import java.io.Reader;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.moflon.moca.MocaUtil;
import Moca.parser.impl.ParserImpl;
import MocaTree.Node;
import Moca.Problem;

public class UsecaseParserAdapter extends ParserImpl 
{
  String filename;

  @Override
  public boolean canParseFile(String fileName) 
  {
    this.filename = fileName;
    return fileName.endsWith(".usecase");
  }

  @Override
  public Node parse(Reader reader) 
  {
    try 
    {
      UsecaseLexer lexer = new UsecaseLexer(new ANTLRReaderStream(reader));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      UsecaseParser parser = new UsecaseParser(tokens);
      CommonTree result = (CommonTree) parser.main().tree; 
      
	  // Log Lexer Errors
	  for (Problem problem : lexer.problems) {
	    problem.setCodeAdapter(getCodeAdapter());
		problem.setSource(filename);	  
		getCodeAdapter().getProblems().add(problem);
	  }

      // Log Parser Errors
	  for (Problem problem : parser.problems) {
	    problem.setCodeAdapter(getCodeAdapter());
		problem.setSource(filename);	  
		getCodeAdapter().getProblems().add(problem);
	  }
      
      return MocaUtil.commonTreeToMocaTree(result);
    } catch (IOException e) 
    {
      e.printStackTrace();
    } catch (RecognitionException e) 
    {
      e.printStackTrace();
    } 
    return null;
  }
}