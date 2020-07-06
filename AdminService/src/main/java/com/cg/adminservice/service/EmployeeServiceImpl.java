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

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> entity = repository.findAll();
		return entity;
	}

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeAlreadyExsistsException {
		if(repository.existsById(employee.getEmpId()))
			throw new EmployeeAlreadyExsistsException();
		else
			return repository.saveAndFlush(employee);		
	}

	public List<Employee> getAllEmployeesByDeptName(String deptName) throws EmployeeNotFoundException {
		List<Employee> employee = repository.findAllByDeptName(deptName);
		return employee;
	}
	
    @Override
	public String updatempFirstNameByEmpId(Integer empId, String empFirstName) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  Employee employee = optional.get();
		  employee.setEmpFirstName(empFirstName);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
	
	public String updatempLastNameByEmpId(Integer empId, String empLastName) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  Employee employee = optional.get();
		  employee.setEmpLastName(empLastName);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
	
	public String updatempGradeByEmpId(Integer empId, String empGrade) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  Employee employee = optional.get();
		  employee.setEmpGrade(empGrade);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
	public String updatedesignationByEmpId(Integer empId, String designation) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  Employee employee = optional.get();
		  employee.setDesignation(designation);
		  repository.save(employee);
		  return "Employee updated Successfully";
	 }
	
	public String updatesalaryByEmpId(Integer empId, String salary) throws EmployeeNotFoundException {
		  Optional<Employee> optional = repository.findById(empId);
		  Employee employee = optional.get();
		  employee.setSalary(salary);
		  repository.saveAndFlush(employee);
		  return "Employee updated Successfully";
	 }
	
	@Override
	public String updateMaritalStatusByEmpId(Integer empId, String maritalStatus) throws EmployeeNotFoundException {
	  Optional<Employee> optional = repository.findById(empId);
	  Employee employee = optional.get();
	  employee.setMaritalStatus(maritalStatus);
	  repository.saveAndFlush(employee);
	  return "Employee updated Successfully";
	 }


	@Override
	public String deleteAllEmployeesByEmpGrade(String empGrade) throws EmployeeNotFoundException{
		 repository.deleteByEmpGrade(empGrade);
		return "Employees Deleted Successfully";
	}
}
