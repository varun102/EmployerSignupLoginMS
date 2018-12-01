/**
 * 
 */
package com.ntl.topjobs.employeeregistration.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.employeeregistration.dao.Dao;
import com.ntl.topjobs.employeeregistration.dao.LoginDao;
import com.ntl.topjobs.employeeregistration.model.EmployerLoginDetails;
import com.ntl.topjobs.employeeregistration.model.EmployerSignupDetails;


/**
 * @author Training
 *
 */
@Service
public class ServiceClass {

	@Autowired
	Dao dao;
	@Autowired
	LoginDao loginDao;

	EmployerLoginDetails loginBean;

	/**
	 * @param dao
	 */
	public ServiceClass(Dao dao, LoginDao loginDao) {
		super();
		this.dao = dao;
		this.loginDao = loginDao;
	}

	/**
	 * @param loginDao
	 */
	public ServiceClass(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}

	public ServiceClass() {
		super();

	}

	public String generateEmpId(String firstName) {
		Random randomNo = new Random();
		int x = 1000 + randomNo.nextInt(9000);
		String str = Integer.toString(x);
		char[] a = { firstName.charAt(0), firstName.charAt(1), str.charAt(0), str.charAt(1), str.charAt(2),
				str.charAt(3) };
		return (new String(a));
	}

	public EmployerSignupDetails addEmployee(EmployerSignupDetails signupBean) {

		if (dao.findByEmailId(signupBean.getEmailId()) == 0) {
			loginBean = new EmployerLoginDetails();
			signupBean.setEmpId();
			loginBean.setEmailId(signupBean.getEmailId());
			loginBean.setEmpId(signupBean.getEmpId());
			loginBean.setPassword(signupBean.getPassword());
			loginDao.save(loginBean);
			return dao.save(signupBean);
		} else
			return null;
	}

	public boolean getUser(String id, String password) {

		/*
		 * Optional<EmployerLoginDetails> temporaryLogin; Optional<EmployerLoginDetails>
		 * tempLogin = loginDao.findById(id); if (tempLogin.isPresent()) { if
		 * (tempLogin.get().getPassword().equals(password)) { temporaryLogin =
		 * tempLogin;
		 * 
		 * } else temporaryLogin = null; } else temporaryLogin = null;
		 */

		try {
			EmployerLoginDetails emp = loginDao.findById(id).get();
			if (emp.getPassword().equals(password))
				return true;

		} catch (Exception err) {
			return false;
		}
		return false;
	}

}
