package com.off.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.off.Dao.EmployeeDao;
import com.off.Office.Employee;
import com.off.exceptions.NameException;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao ed;
	
   public String postEmployee(List<Employee> l1) {
	   
		return ed.postEmployee(l1);
	
   }
   
   public Employee getEmployee( int a) {
		return ed.getEmployee(a);
	}
   
   public String getEmployeeName(int a) throws NameException {
	   Employee e1 = ed.getEmployee(a);
	   
//	   try {
		   
	   if(e1.getName().equals("ajay")) {
		   return e1.getName();
	   }
	 
		   else {
			   throw new NameException("not found the name Ajay");
		   }
//		}
//	   
//	   catch(NameException ne) {
//		   return ne.toString();
//	   }
	   
	 }
	

}
