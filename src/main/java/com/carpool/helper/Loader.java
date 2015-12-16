package com.carpool.helper;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
@RequestMapping("/carPoolApp")
public class Loader {

	@RequestMapping("/Greeting")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/user")
	public ModelAndView welcomeUser(
			@RequestParam(value = "name", required = false, defaultValue = "User") String name) {
		// model.addAttribute("name", name);
		ModelMap model = new ModelMap();
		System.out.println("Name inside Loader.java is " + name);
		model.addAttribute("users", name);
		return new ModelAndView("Loader", model);
	}
	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(Loader.class, args);
	 * 
	 * }
	 */

}
