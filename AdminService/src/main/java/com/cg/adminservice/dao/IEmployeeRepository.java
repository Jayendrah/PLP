package com.cg.adminservice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeNotFoundException;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//List<Employee> findAll();
	
	List<Employee> findAllByDeptName(String deptName) throws EmployeeNotFoundException;
	
	//Optional<Employee> findByEmpId(Integer empId);
	
	List<Employee> findByEmpGrade(String empGrade);	
	
	//Employee save(Optional<Employee> entity);
	
	List<Employee> deleteByEmpGrade(String empGrade);
}
