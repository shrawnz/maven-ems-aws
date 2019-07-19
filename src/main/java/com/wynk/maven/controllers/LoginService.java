package com.wynk.maven.controllers;

import com.wynk.maven.models.LoginBean;

public class LoginService {

	public static boolean authenticateUser(LoginBean loginBean) {
		
		if( loginBean.getUsername().equalsIgnoreCase("admin") && 
				loginBean.getPassword().equals("admin")) {
			return true;
		}
		
		return false;
	}
}
