package com.carpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("carPoolApp")
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginApplication() {

		ModelMap model = new ModelMap();
		System.out.println("I am being hit");
		model.addAttribute("test", "testvalue");
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("login");
		mvc.addObject(model);
		return mvc;
	}

	/*
	 * @RequestMapping("/login") public String loginApplication(Model model){
	 * 
	 * 
	 * System.out.println("I am being hit"); model.addAttribute("test",
	 * "testvalue"); return "login";
	 * 
	 * }
	 */
}
