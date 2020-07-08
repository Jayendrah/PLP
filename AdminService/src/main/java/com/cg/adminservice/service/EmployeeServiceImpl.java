package com.cg.adminservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.adminservice.dao.IEmployeeRepository;
import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeAlreadyExsistsException;
import com.cg.adminservice.exception.EmployeeNotFoundException;
@Transactional
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository repository;
    
	//Return  List of all employee
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> entity = repository.findAll();
		return entity;
	}
    
	//Add the employee
	@Override
	public Employee addEmployee(Employee employee) throws EmployeeAlreadyExsistsException {
		if(repository.existsById(employee.getEmpId()))
			throw new EmployeeAlreadyExsistsException();
		else
			return repository.saveAndFlush(employee);		
	}
	
	//Return List of all employee having same department name
    @Override
	public List<Employee> getAllEmployeesByDeptName(String deptName) throws EmployeeNotFoundException {
		List<Employee> employee = repository.findAllByDeptName(deptName);
		return employee;
	}
	
    // Update the first name of employee employee Id
    @Override
	public String updatempFirstNameByEmpId(Integer empId, String empFirstName) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  if(optional.isPresent()) {
		  Employee employee = optional.get();
		  employee.setEmpFirstName(empFirstName);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
		  }
		  else {
			  throw new EmployeeNotFoundException();
		  }
	 }
    
    // Update the last name of employee employee Id
	@Override
	public String updatempLastNameByEmpId(Integer empId, String empLastName) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  if(optional.isPresent()) {
		  Employee employee = optional.get();
		  employee.setEmpLastName(empLastName);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
		  else {
			  throw new EmployeeNotFoundException();
		  }
	}
	
	// Update the employee grade  of employee employee Id
	@Override
	public String updatempGradeByEmpId(Integer empId, String empGrade) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  if(optional.isPresent()) {
		  Employee employee = optional.get();
		  employee.setEmpGrade(empGrade);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
		  else {
			  throw new EmployeeNotFoundException();
		  }
	}
	
	// Update the employee designation  of employee employee Id
	@Override
	public String updatedesignationByEmpId(Integer empId, String designation) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  if(optional.isPresent()) {
		  Employee employee = optional.get();
		  employee.setDesignation(designation);
		  repository.save(employee);
		  return "Employee updated Successfully";
	 }
		  else {
			  throw new EmployeeNotFoundException();
		  }
	
	}
	
	// Update the employee salary  of employee employee Id
	@Override
	public String updatesalaryByEmpId(Integer empId, String salary) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  if(optional.isPresent()) {
		  Employee employee = optional.get();
		  employee.setSalary(salary);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
		  else {
			  throw new EmployeeNotFoundException();
		  }
	}
	
	// Update the employee marital status  of employee employee Id
	@Override
	public String updateMaritalStatusByEmpId(Integer empId, String maritalStatus) throws EmployeeNotFoundException {
	  Optional<Employee> optional = repository.findById(empId);
	  if(optional.isPresent()) {
	  Employee employee = optional.get();
	  employee.setMaritalStatus(maritalStatus);
	  repository.saveAndFlush(employee);
	  return "Employee updated Successfully";
	 }
	  else {
		  throw new EmployeeNotFoundException();
	  }
}

    //Delete all employee by employee grade
	@Override
	public String deleteAllEmployeesByEmpGrade(String empGrade) throws EmployeeNotFoundException{
		 repository.deleteByEmpGrade(empGrade);
		return "Employees Deleted Successfully";
	}
}
