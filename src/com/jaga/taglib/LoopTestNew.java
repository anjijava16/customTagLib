package com.jaga.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class LoopTestNew extends SimpleTagSupport{
	private Object[] items;
	private String var;
	public void setItems(Object[] items) {
		this.items = items;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("jahha");
		for(Object item:items){
			getJspContext().setAttribute(var, item);
			getJspBody().invoke(null);
		}
		super.doTag();
	}
	
}
