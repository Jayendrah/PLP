package com.cg.adminservice.exception;

public class EmployeeNotFoundException extends Exception {
	@Override	
	public String getMessage() {
			return "Employee Not Found";
	}


}
