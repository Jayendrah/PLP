package com.cg.adminservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.adminservice.entity.Employee;
import com.cg.adminservice.exception.EmployeeAlreadyExsistsException;
import com.cg.adminservice.exception.EmployeeNotFoundException;
import com.cg.adminservice.service.IEmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService service;
	
	@GetMapping("/getAll")
	public List<Employee> getEmployee(){
		return service.getAllEmployee();
	}

	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) throws EmployeeAlreadyExsistsException{
		Employee entity = service.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(entity);
	}

	
	@GetMapping("/{deptName}")
	public ResponseEntity<List<Employee>> getAllEmployeesByDeptName(@PathVariable("deptName") String deptName) throws EmployeeNotFoundException{
		List<Employee> entity = service.getAllEmployeesByDeptName(deptName);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	
	@PutMapping("/{empId}/{maritalStatus}")
	public ResponseEntity<String> updateEmployee(@PathVariable("empId") Integer empId,@PathVariable("maritalStatus") String maritalStatus) throws EmployeeNotFoundException{
		String entity = service.updateEmployeeByEmpId(empId,maritalStatus );
		return ResponseEntity.ok(service.updateEmployeeByEmpId(empId,maritalStatus));
	}

	
	@DeleteMapping("/{empGrade}")
	public ResponseEntity<String> deleteAllEmployeesByEmpGrade(@PathVariable("empGrade") String empGrade) throws EmployeeNotFoundException {
		return ResponseEntity.ok(service.deleteAllEmployeesByEmpGrade(empGrade));
	}

}
