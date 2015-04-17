// $ANTLR 3.5.2 C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\unparser\\UsecaseTreeGrammar.g 2015-04-17 16:09:10

package org.moflon.moca.usecase.unparser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class UsecaseTreeGrammar extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "ID", "STRING"
	};
	public static final int EOF=-1;
	public static final int ATTRIBUTE=4;
	public static final int ID=5;
	public static final int STRING=6;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public UsecaseTreeGrammar(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public UsecaseTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("UsecaseTreeGrammarTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return UsecaseTreeGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\unparser\\UsecaseTreeGrammar.g"; }


		public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)	throws RecognitionException  {
			try {
	        		return super.recoverFromMismatchedToken(input, ttype, follow);
	            } catch(java.util.NoSuchElementException e){
	                throw new IllegalArgumentException("Your tree does not comply with your tree grammar!\n"
	                		+ " Problems encountered at: [" + "..." + getTreeNodeStream().LT(-1) + " " 
	                		+ getTreeNodeStream().LT(1) + "..." + "] in tree.");
			}
	    }


	public static class main_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\unparser\\UsecaseTreeGrammar.g:34:1: main :;
	public final UsecaseTreeGrammar.main_return main() throws RecognitionException {
		UsecaseTreeGrammar.main_return retval = new UsecaseTreeGrammar.main_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\unparser\\UsecaseTreeGrammar.g:34:5: ()
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\unparser\\UsecaseTreeGrammar.g:34:6: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"

	// Delegated rules



}
