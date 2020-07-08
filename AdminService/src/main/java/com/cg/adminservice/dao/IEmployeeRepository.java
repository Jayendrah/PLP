package com.cg.adminservice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeNotFoundException;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	List<Employee> findAllByDeptName(String deptName) throws EmployeeNotFoundException;
	
	List<Employee> findByEmpGrade(String empGrade);	
	
	List<Employee> deleteByEmpGrade(String empGrade);
}
