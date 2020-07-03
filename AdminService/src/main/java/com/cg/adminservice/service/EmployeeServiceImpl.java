package com.cg.adminservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.adminservice.dao.IEmployeeRepository;
import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeAlreadyExsistsException;
import com.cg.adminservice.exception.EmployeeNotFoundException;

@Service
@Transactional
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
			return repository.save(employee);		
	}

	public List<Employee> getAllEmployeesByDeptName(String deptName) throws EmployeeNotFoundException {
		List<Employee> employee = repository.findAllByDeptName(deptName);
		return employee;
	}
	

	@Override
	public String updateEmployeeByEmpId(Integer empId, String maritalStatus) throws EmployeeNotFoundException {
	  Optional<Employee> optional = repository.findByEmpId(empId);
	  Employee employee = optional.get();
	  employee.setMaritalStatus(maritalStatus);
	  repository.save(employee);
	  return "Employee updated Successfully";
	  }

	@Override
	public String deleteAllEmployeesByEmpGrade(String empGrade) throws EmployeeNotFoundException{
		 repository.deleteByEmpGrade(empGrade);
		return "Employees Deleted Successfully";
	}
}
