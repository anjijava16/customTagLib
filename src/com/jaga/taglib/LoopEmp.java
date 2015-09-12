package com.jaga.taglib;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.jaga.controller.Employee;

public class LoopEmp extends SimpleTagSupport{
	
	List<? extends Object> items ;
	
	
	
	String var;

	public void setItems(List<? extends Object> items) {
		this.items = items;
	}

	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		for(Object em : items){
			getJspContext().setAttribute(var, em);
			getJspBody().invoke(null);
		}
		super.doTag();
		
	}
}
