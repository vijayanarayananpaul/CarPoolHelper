package com.carpool.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.carpool.beans.LoginBean;

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

	@RequestMapping(value="/loginApp", method = RequestMethod.POST )
	public ModelAndView loginwithBean(@Valid LoginBean loginBean, BindingResult bindingResult){
		 if(bindingResult.hasErrors()) {
			 System.out.println("I got error");
             return new ModelAndView("sample");
         } else {
            // process(userDomain);
        	 System.out.println("No error occured");
        	 return new ModelAndView("sample");
         }
		
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
