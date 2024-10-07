package com.off.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.off.Office.Employee;
import com.off.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository er;
	
    public String postEmployee(List<Employee> l1) {
    	er.saveAll(l1);
		return "Updated SuccessFullly";
	}
    
    public Employee getEmployee( int a) {
		return er.findById(a).get();
		
	}
    
//    public String getEmployeeName(int a) {
//    	return er.findById(a).get().getName();
//    }
	

}
