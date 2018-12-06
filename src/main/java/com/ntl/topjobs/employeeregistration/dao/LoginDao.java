/**
 * 
 */
package com.ntl.topjobs.employeeregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.employeeregistration.model.EmployerLoginDetails;


/**
 * @author Training
 *
 */
@Repository
public interface LoginDao extends JpaRepository<EmployerLoginDetails, String> {

}
