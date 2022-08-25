package com.example.demo.EmployeeEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class EmployeeImpl {
	
	  private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

	    static {
	        initEmps();
	    }
	    
	    private static void initEmps() {
	        Employee emp1 = new Employee("01", "Srinivas", 12500);
	        Employee emp2 = new Employee("02", "Padmavathi", 22500);
	        Employee emp3 = new Employee("03", "Soumya", 21000);
	        Employee emp4 = new Employee("04", "Srikanth", 18860);
	        Employee emp5 = new Employee("05", "Jyothi", 12500);
	        Employee emp6 = new Employee("06", "Jaya", 13400);
	        Employee emp7 = new Employee("07", "Narayani", 11000);
	        Employee emp8 = new Employee("08", "Indrani", 15000);
	        Employee emp9 = new Employee("09", "Rama", 12000);
	        Employee emp10 = new Employee("10", "Appy", 12000);
	        
	        
	        empMap.put(emp1.getId(), emp1);
	        System.out.println();
	        empMap.put(emp2.getId(), emp2);
	        System.out.println();
	        empMap.put(emp3.getId(), emp3);
	        empMap.put(emp4.getId(), emp4);
	        empMap.put(emp5.getId(), emp5);
	        empMap.put(emp6.getId(), emp6);
	        empMap.put(emp7.getId(), emp7);
	        empMap.put(emp8.getId(), emp8);
	        empMap.put(emp9.getId(), emp9);
	        empMap.put(emp10.getId(), emp10);
	     
	        
	    }
	        
	        public List<Employee> getAllEmployees() {
	            Collection<Employee> c = empMap.values();
	            List<Employee> list = new ArrayList<Employee>();
	            list.addAll(c);
	            return list;
	        
	    }
}
