package com.amol.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amol.LoginService;

@Controller
public class Addcontroller {
	
	@Autowired	
	LoginService user;
	 
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
	@RequestMapping("/Login")
	public ModelAndView goToLogin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		return mav;
	}
	@RequestMapping("/Exit")
	public ModelAndView goToExit() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Exit");
		return mav;
	}
	
	@RequestMapping(value= "/DoLogin", method=RequestMethod.POST)
	public String DoLogin(@RequestParam String name, @RequestParam String pass, ModelMap model) {
		
		if(!user.validate(name, pass))
		{
			model.put("msg", "Username or password is wrong Please enter right one...");
			return "Login";
		}
		model.put("name", name);
		return "Profile";
		}

//	@RequestMapping(value= "/DoLogin", method=RequestMethod.POST)
//	public String DoLogin(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//		
//		if(user.validate(name, pass))
//		{
//			model.put("name", name);
//			model.put("msg", "Successfully logged in...");
//			return "Profile";
//		}
//		else
//		{
//			model.put("msg", "Username or password is wrong Please enter right one...");
//			return "Login";
//		}
//	}
	@RequestMapping(value="/DoLogin",method=RequestMethod.GET)
	public ModelAndView DoLogin(@RequestParam String name, @RequestParam String pass) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.addObject("pass", pass);
		mav.setViewName("Profile");
		return mav;
	}
	
}
//@RequestMapping(value="/DoLogin",method=RequestMethod.POST)
//public ModelAndView DoLogin(@RequestParam String name, @RequestParam String pass) {
//	ModelAndView mav = new ModelAndView();
//	mav.addObject("name", name);
//	mav.addObject("pass", pass);
//	mav.setViewName("Profile");
//	return mav;
//}
//
//@RequestMapping(value = "/DoLogin", method=RequestMethod.POST)
//public ModelAndView DoLogin(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//	ModelAndView mav = new ModelAndView();
//	model.put("uname", name);
//	model.put("pass", pass);
//	mav.addObject(model);
//	mav.setViewName("Profile");
//	
//	return mav;
//}