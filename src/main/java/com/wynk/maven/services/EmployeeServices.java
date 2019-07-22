package com.wynk.maven.services;

import java.util.List;
import com.wynk.maven.models.EmployeeBean;

public interface EmployeeServices {
	public void addEmployee(EmployeeBean emp);
	public List<EmployeeBean> listEmployees();
	public EmployeeBean findById(String id);
	public void deleteEmployee(EmployeeBean emp);
	public void updateEmployee(EmployeeBean emp);
}