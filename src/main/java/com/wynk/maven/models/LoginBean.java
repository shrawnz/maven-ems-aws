package com.wynk.maven.models;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginBean {

	@NotBlank(message="username cannot be blank")
	@Size(min=3, max=20, message="Min size: 3 and Max Size: 20")
	private String username;
	
	@NotBlank(message="password cannot be blank")
	@Size(min=3, max=20, message="Min size: 3 and Max Size: 20")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
