package com.wynk.maven.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wynk.maven.models.EmployeeBean;
import com.wynk.maven.models.LoginBean;
import com.wynk.maven.services.EmployeeServices;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		
		System.out.println("HELOOOOOOOOOOOOOOOOOO");
		List<EmployeeBean> employees = employeeServices.listEmployees();
		
		model.addAttribute("employees", employees);
		
		return "employee";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ModelAndView employee() {
		
		return new ModelAndView("employeeForm", "empAttr", new EmployeeBean());
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("empAttr") @Valid EmployeeBean empBean, 
			BindingResult result, ModelMap model) {
		
		if(result.hasErrors()) {
			return "employeeForm";
		}
		
		employeeServices.addEmployee(empBean);
		List<EmployeeBean> employees = employeeServices.listEmployees();
		model.addAttribute("employees", employees);
		return "employee";
	}
	
	@RequestMapping(value = "/editEmployee/{empId}", method = RequestMethod.GET)
	public String empDetails(@PathVariable("empId") String empId, ModelMap model,
			HttpServletRequest request) {
		EmployeeBean emp = employeeServices.findById(empId);
		model.addAttribute("employee", emp);
		return "employeeView";
	}
	
	//TODO: Update EmployeeBean 
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String saveEmployee(@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("department") String department,
			@RequestParam("email") String email, ModelMap model) {

		EmployeeBean emp = employeeServices.findById(id);
		emp.setName(name);
		emp.setDepartment(department);
		emp.setEmail(email);
		employeeServices.updateEmployee(emp);

		List<EmployeeBean> employees = employeeServices.listEmployees();
		model.addAttribute("employees", employees);
		return "employee";
	}
	
	@RequestMapping(value = "/deleteEmployee/{empId}", method = RequestMethod.POST)
	public String delete(@PathVariable("empId") String empId, ModelMap model) {
		
		EmployeeBean emp = employeeServices.findById(empId);
		employeeServices.deleteEmployee(emp);
		
		List<EmployeeBean> employees = employeeServices.listEmployees();
		model.addAttribute("employees", employees);
		return "employee";
	}
}
