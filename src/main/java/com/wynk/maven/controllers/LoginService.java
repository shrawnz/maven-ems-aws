package com.wynk.maven.controllers;

import java.util.Iterator;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.model.Filters;
import com.wynk.maven.models.LoginBean;

public class LoginService {

	public static boolean authenticateUser(LoginBean loginBean) {
		
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();
		
		MongoController mongo = new MongoController("demo", "maven_ems");
		Bson filter = Filters.eq("username", username);
		Iterator<Document> itr = mongo.find(filter);

		if(itr.hasNext() && password.equals(itr.next().getString("password"))) {
			return true;
		}
		
		return false;
	}
}
