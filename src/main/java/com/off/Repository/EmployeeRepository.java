package com.off.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.off.Office.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	

}
