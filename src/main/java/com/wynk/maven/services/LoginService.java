package com.wynk.maven.services;

import com.wynk.maven.models.LoginBean;

public interface LoginService {
	public boolean authenticateUser(LoginBean loginBean);
}
