package com.amol.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addcontroller {
	
	@RequestMapping("/Add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		
		int result=i+j;
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Result");
	    modelAndView.addObject("result",result);
	    
	    return modelAndView;
	}
	@RequestMapping("/Index")
	public ModelAndView goToIndex() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Index");
		return mav;
	}
	@RequestMapping("/Profile")
	public ModelAndView goToProfile() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Profile");
		return mav;
	}
	@RequestMapping("/Result")
	public ModelAndView goToResult() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Result");
		return mav;
	}
	@RequestMapping("/AboutUs")
	public ModelAndView goToAboutUs() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("AboutUs");
		return mav;
	}
	@RequestMapping("/ContactUs")
	public ModelAndView goToContactUs() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ContactUs");
		return mav;
	}
	@RequestMapping("/Exit")
	public ModelAndView goToExit() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Exit");
		return mav;
	}
	
	
}
