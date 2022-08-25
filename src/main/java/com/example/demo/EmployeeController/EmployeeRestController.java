package com.example.demo.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeEntity.Employee;
import com.example.demo.EmployeeEntity.EmployeeImpl;
@RestController
public class EmployeeRestController {
	
	 @Autowired
	    private EmployeeImpl employeeImpl;

	    @GetMapping("/welcome")
	    
	    public String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }

	    @GetMapping("/EmployeeList")
	    public List<Employee> getEmployees() {
	        List<Employee> list = employeeImpl.getAllEmployees();
	        return list;
	    }

}
