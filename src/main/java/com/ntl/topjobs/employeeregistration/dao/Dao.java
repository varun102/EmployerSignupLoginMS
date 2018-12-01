package com.ntl.topjobs.employeeregistration.dao;

//import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ntl.topjobs.employeeregistration.model.EmployerSignupDetails;


@Repository
public interface Dao extends JpaRepository<EmployerSignupDetails, String> {
//public Optional<EmployerSignupDetails> findByEmailId(String emailId);
	
@Transactional
@Query(value="SELECT count(*) FROM employer_signup_details WHERE email_id=?",nativeQuery=true)
public int findByEmailId(String emailId);
}
