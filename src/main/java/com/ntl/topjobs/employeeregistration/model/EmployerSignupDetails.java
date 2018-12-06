/**
 * 
 */
package com.ntl.topjobs.employeeregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.ntl.topjobs.employeeregistration.service.ServiceClass;

//import com.ntl.topjobs.employeesignuplogin.service.ServiceClass;

/**
 * @author Training
 *
 */
@Entity
public class EmployerSignupDetails {
	@Transient
	ServiceClass serviceClass;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private String gender;
	private String country;
	@Id
	private String empId;
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	public EmployerSignupDetails() {
		super();
		serviceClass=new ServiceClass();
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId() {
		ServiceClass serviceClassId=new ServiceClass();
		empId=serviceClassId.generateEmpId(firstName);
	}
	
	
}
