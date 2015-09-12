package com.jaga.taglib;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.jstl.core.LoopTagSupport;

public class LoopTest extends LoopTagSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> jj = new ArrayList<String>();
	int counter = 0;
	
	List<String> var = null;
	
	String var2 = null;
	
	
	
//	public List<String> getVar() {
//		return var;
//	}

	public void setVar2(String var2) {
		this.var2 = var2;
	}

	public void setVar(List<String> var) {
		this.var = var;
	}

	@Override
	protected boolean hasNext() throws JspTagException {
		// TODO Auto-generated method stub
		
		System.out.println(counter +"calling from hasNext()");
		System.out.println(counter<=jj.size());
		return counter<=jj.size();
	}

	@Override
	protected Object next() throws JspTagException {
		// TODO Auto-generated method stub
		//System.out.println(jj.get(counter));
//		for(int i=0;i<jj.size();i++){
//			System.out.println(jj.get(i).toString());
		System.out.println("calling next()");
		++counter;
//		}
		return jj;
	}

	@Override
	protected void prepare() throws JspTagException {
		 jj = (List<String>) pageContext.getAttribute("listTest");
		System.out.println("calling from prepare");
	}
	
	@Override
	public void removeValue(String k) {
		// TODO Auto-generated method stub
		System.out.println("calling remove");
		super.removeValue(k);
	}

}
