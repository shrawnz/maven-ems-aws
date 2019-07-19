package com.wynk.maven.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wynk.maven.models.LoginBean;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("login", "loginAttr", new LoginBean());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String save(@ModelAttribute("loginAttr") @Valid LoginBean loginBean, 
			BindingResult result, ModelMap model, HttpSession httpSession) {
	
		if(result.hasErrors()) {
			return "login";
		}
		if(LoginService.authenticateUser(loginBean)) {
			httpSession.setAttribute("username", loginBean.getUsername());
			return "home";
		}
		
		model.addAttribute("message","Invalid credentials");
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession httpSession) {
		System.out.println("LOGGED OUT");
		System.out.println(httpSession.getAttribute("username"));
		httpSession.invalidate();
		return "login";
	}
//	@RequestMapping("/")
	
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

//	}
}
