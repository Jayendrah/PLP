package com.cg.adminservice.service;

import java.util.List;

import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeAlreadyExsistsException;
import com.cg.adminservice.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	public List<Employee> getAllEmployee();
	
	public Employee addEmployee(Employee employee) throws EmployeeAlreadyExsistsException;
	
	public List<Employee> getAllEmployeesByDeptName(String deptName) throws EmployeeNotFoundException;
	
	public String deleteAllEmployeesByEmpGrade(String empGrade) throws EmployeeNotFoundException;

	public String updatempFirstNameByEmpId(Integer empId,String empFirstName) throws EmployeeNotFoundException;
	
	public String updatempLastNameByEmpId(Integer empId,String empFirstName) throws EmployeeNotFoundException;
	
	public String updatempGradeByEmpId(Integer empId,String empGrade) throws EmployeeNotFoundException;
	
	public String updatedesignationByEmpId(Integer empId,String designation) throws EmployeeNotFoundException;
	
	public String updateMaritalStatusByEmpId(Integer empId,String maritalStatus) throws EmployeeNotFoundException;
	
	public String updatesalaryByEmpId(Integer empId,String salary) throws EmployeeNotFoundException;
	
	
}