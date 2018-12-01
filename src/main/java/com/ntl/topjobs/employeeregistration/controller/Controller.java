/**
 * 
 */
package com.ntl.topjobs.employeeregistration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.employeeregistration.model.EmployerSignupDetails;
import com.ntl.topjobs.employeeregistration.service.ServiceClass;

/**
 * @author Training
 *
 */
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class Controller {
	@Autowired
	ServiceClass serviceClass;
	
	EmployerSignupDetails beanSignup;

	/**
	 * @param serviceClass
	 */
	public Controller(ServiceClass serviceClass) {
		super();
		this.serviceClass = serviceClass;
	}

	public Controller() {
		super();
		beanSignup = new EmployerSignupDetails();
	}

	@PostMapping("/employer/signup")
	public EmployerSignupDetails signup(@RequestBody EmployerSignupDetails signupBean) {
		return (serviceClass.addEmployee(signupBean));

	}

	@GetMapping("/employer/login/{id}/{password}")
	public boolean login(@PathVariable("id") String id, @PathVariable("password") String password) {
		
		return serviceClass.getUser(id, password);
		
	}
	
	

}
