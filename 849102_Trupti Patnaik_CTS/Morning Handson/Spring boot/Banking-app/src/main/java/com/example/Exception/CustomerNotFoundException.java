package com.example.Exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {
		super("Customer Not found");
	}
	
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
	

}
