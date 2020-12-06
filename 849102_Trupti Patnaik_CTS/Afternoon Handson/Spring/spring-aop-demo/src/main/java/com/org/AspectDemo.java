package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

	@After("execution(public * com.org.EmployeeService.s*(..))")
	public void log() {
		System.out.println("----- log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void logInt() {
		System.out.println("method having int parameter is executed");
	}
	@After("execution(public * com.org.EmployeeService.*(int,Double))")
	public void logIntAny() {
		System.out.println("method having int and any  parameter is executed");
	}
	@After("execution(public * com.org.EmployeeService.*(int,String))")
	public void logIntString() {
		System.out.println("method having int and String  parameter is executed");
	}
	@After("execution(public * com.org.EmployeeService.*(String))")
	public void logStringReturn() {
		System.out.println("method having only String  return type is executed");
	}
}
