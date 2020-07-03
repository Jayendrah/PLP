package com.cg.adminservice.exception;

public class EmployeeAlreadyExsistsException extends Exception {
		
		@Override	
		public String getMessage() {
				return "Employee Already Exists";
		}

}
