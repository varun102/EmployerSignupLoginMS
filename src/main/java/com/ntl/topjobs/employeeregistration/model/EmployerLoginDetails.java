/**
 * 
 */
package com.ntl.topjobs.employeeregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Training
 *
 */
@Entity
public class EmployerLoginDetails {
@Id
private String empId;
private String emailId;
private String password;
private int loginStatus;
public EmployerLoginDetails() {
	super();
	
}
public int getLoginStatus() {
	return loginStatus;
}
public void setLoginStatus(int loginStatus) {
	this.loginStatus = loginStatus;
}
/**
 * @return the userId
 */
public String getEmpId() {
	return empId;
}
/**
 * @param userId the userId to set
 */
public void setEmpId(String empId) {
	this.empId = empId;
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


}
