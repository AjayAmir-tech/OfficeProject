package com.off.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.off.Office.Employee;
import com.off.Service.EmployeeService;
import com.off.exceptions.NameException;


@RestController
@RequestMapping(value="/Onesofts")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping(value="/postEmployee")
	public String postEmployee(@RequestBody List<Employee> l1) {
		
		return es.postEmployee(l1);
	}
	
	@GetMapping("/getOne/{a}")
	public Employee getEmployee(@PathVariable int a) {
		return es.getEmployee(a);
	}
	
	//EXCEPTION HANDLING
	
	@GetMapping("/getEmpName/{a}")
	public String getEmployeeName(@PathVariable int a)throws NameException {
		return es.getEmployeeName(a);
	}
	
	
	
	

}
