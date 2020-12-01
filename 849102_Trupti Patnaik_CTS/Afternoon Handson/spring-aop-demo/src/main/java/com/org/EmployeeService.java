package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
	
	public void getEmployee(int num) {
		System.out.println("getEmployee method in employe service");
	}
	public void getEmployees(int num,Double gem) {
		System.out.println("getEmployees method in service");
		
	}
	public void updateEmployee(int id, String name) {
		System.out.println("updateEmployee method in service");
	}
	
	public void retrieveEmployee(String name) {
		System.out.println("retrieveEmployee method in service");
}
}
