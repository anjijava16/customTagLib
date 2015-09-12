package com.jaga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
	
	@RequestMapping(value="/jaga",method = RequestMethod.GET)
	public String testMap(Model model){
		List<Integer> jj = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			jj.add(i);
		}
		model.addAttribute("test",jj);
		return "testJaga";
	}
	
	@RequestMapping(value="/jaga123",method = RequestMethod.GET)
	public String testMapLoop(Model model,@ModelAttribute("employee")Employee emp1){
		String[] servers =
			{"Tomcat", "Resin", "Jetty", "WebLogic",
			"WebSphere", "JBoss", "Glassfish" };
		
		List<Employee> emp = new ArrayList<Employee>();
		
		for(int i=0;i<10;i++){
			Employee ee = new Employee();
			ee.setId(i+"=id");
			ee.setName(i+"=name");
			emp.add(ee);
		}
		model.addAttribute("servers",servers);
		return "testLoop";
	}
	
	@RequestMapping(value="/jaga13",method = RequestMethod.GET)
	public String testEmpLoop(Model model){
		
		
		List<Employee> emp = new ArrayList<Employee>();
		
		for(int i=0;i<5000;i++){
			Employee ee = new Employee();
			ee.setId(i+"=id");
			ee.setName(i+"=name");
			emp.add(ee);
		}
		model.addAttribute("servers",emp);
		model.addAttribute("employee",new Employee());
		return "empLoop";
	}
}	
