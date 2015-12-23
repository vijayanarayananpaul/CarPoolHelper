package com.carpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.carpool.beans.LoginBean;
import com.carpool.service.LoginService;

@Controller
@RequestMapping("/carPoolApp")
public class LoginController {
@Autowired
private LoginService loginService;

	@RequestMapping(value = "/applogin", method = RequestMethod.GET)
	public ModelAndView appLoader(Model model) {
		/* ModelMap model = new ModelMap(); */
		model.addAttribute("loginBean", new LoginBean());
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("login");
		mvc.addObject(model);
		return mvc;
	}

	@RequestMapping(value = "/loginApp", method = RequestMethod.POST)
	public ModelAndView loginwithBean(
			@ModelAttribute(value = "loginBean") LoginBean loginBean,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("I got error");
			return new ModelAndView("sample");
		} else {
			// process(userDomain);
			System.out.println("No error occured");
			return new ModelAndView("sample");
		}

	}

}
