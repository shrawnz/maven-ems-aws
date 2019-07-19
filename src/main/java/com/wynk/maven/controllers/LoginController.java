package com.wynk.maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wynk.maven.models.LoginBean;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
//	@RequestMapping("/login")
//	public String welcomeMessage(ModelMap model) {
//		model.addAttribute("message", "Hello Spring MVC Framework");
//		return "welcome";
//	}
//	
//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//		public ModelAndView user() {
//			return new ModelAndView("user", "userAttr", new User());
//	}
//	
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//		public String save(@ModelAttribute("userAttr") User user, ModelMap model) {
//		
//		System.out.println("Edit");
//		model.addAttribute("id", user.getId());
//		model.addAttribute("name", user.getName());
//		return "result";
//
//	}
}
