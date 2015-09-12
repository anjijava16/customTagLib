package com.jaga.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport{
	
	private int counter = 0;
	private String[] names = null;
		@Override
		public int doStartTag() throws JspException {
			names = (String[]) pageContext.getAttribute("names");
		    return EVAL_BODY_INCLUDE;
		}
		
		
		@Override
		public int doAfterBody() throws JspException {
			try{
			      pageContext.getOut().print(" " + names[counter] + "<BR>");
			    } catch(Exception e){
			      throw new JspException(e.toString());
			    }
			    counter++;
			    if(counter >= names.length) {
			      return SKIP_BODY;
			    }
			    return EVAL_BODY_AGAIN;
		}
}
