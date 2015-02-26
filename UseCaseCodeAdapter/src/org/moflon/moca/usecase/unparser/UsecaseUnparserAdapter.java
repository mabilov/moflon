package org.moflon.moca.usecase.unparser;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import Moca.unparser.impl.TemplateUnparserImpl;

public class UsecaseUnparserAdapter extends TemplateUnparserImpl 
{
  
  @Override
  public boolean canUnparseFile(String fileName) 
  {
    return fileName.endsWith(".usecase");
  }

  @Override
  protected String callMainRule(CommonTreeNodeStream tree, StringTemplateGroup templates) throws RecognitionException 
  {
    UsecaseTreeGrammar usecaseTreeGrammar = new UsecaseTreeGrammar(tree);
    usecaseTreeGrammar.setTemplateLib(templates);  
    StringTemplate st = usecaseTreeGrammar.main().st;
    if (st==null) {
      return "";
    }
    else {
      return st.toString();
    }  
  }

  @Override
  protected StringTemplateGroup getStringTemplateGroup() throws FileNotFoundException 
  {
    //TODO provide StringTemplateGroup ...
    // ... from folder "usecase" containing .st files
    // return new StringTemplateGroup("usecase", "templates/usecase");
    // ... from group file Usecase.stg
    // return new StringTemplateGroup(new FileReader(new File("./templates/Usecase.stg")));
    throw new UnsupportedOperationException("Creation of StringTemplateGroup not implemented yet ...");
  }

  @Override
  protected String[] getTokenNames() 
  {
    return UsecaseTreeGrammar.tokenNames;
  }
}