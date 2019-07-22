package com.wynk.maven.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.wynk.maven.models.LoginBean;

@Repository
public class LoginServiceImpl implements LoginService{

	@Autowired
	private MongoTemplate mongoTemplate;
	public static final String COLLECTION_NAME = "login_details";
	
	@Override
	public boolean authenticateUser(LoginBean loginBean) {
		// TODO Auto-generated method stub
		System.out.println("HAJDHASKDJSAHKHSKHD");
		System.out.println(loginBean.toString());
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(loginBean.getUsername()));
		
		List<LoginBean> res = mongoTemplate.find(query, LoginBean.class, COLLECTION_NAME);
		System.out.println(res.size());
		for(LoginBean b : res) {
			System.out.println(b.toString());
			if(b.getPassword().equals(loginBean.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
