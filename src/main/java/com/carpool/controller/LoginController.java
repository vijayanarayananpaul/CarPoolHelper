package com.carpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	/*@RequestMapping("/login")
	public ModelAndView loginApplication(){
		
		ModelMap model=new ModelMap();
		System.out.println("I am being hit");
		model.addAttribute("test", "testvalue");
		return new ModelAndView("sample",model);
		
	}*/
	
	@RequestMapping("/login")
	public String loginApplication(Model model){
		
		
		System.out.println("I am being hit");
		model.addAttribute("test", "testvalue");
		return "Loader";
		
	}
}
