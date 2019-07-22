package com.wynk.maven.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.wynk.maven.models.EmployeeBean;

@Repository
public class EmployeeServiceImpl implements EmployeeServices{

	@Autowired
	private MongoTemplate mongoTemplate;
	public static final String COLLECTION_NAME = "employee";
	
	@Override
	public void addEmployee(EmployeeBean emp) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(emp, COLLECTION_NAME);
	}

	@Override
	public List<EmployeeBean> listEmployees() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(EmployeeBean.class, COLLECTION_NAME);
	}

	@Override
	public void deleteEmployee(EmployeeBean emp) {
		// TODO Auto-generated method stub
		mongoTemplate.remove(emp, COLLECTION_NAME);
	}

	@Override
	public void updateEmployee(EmployeeBean emp) {
		// TODO Auto-generated method stub
		mongoTemplate.save(emp, COLLECTION_NAME);
	}

	@Override
	public EmployeeBean findById(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findById(id, EmployeeBean.class, COLLECTION_NAME);
	}
}
