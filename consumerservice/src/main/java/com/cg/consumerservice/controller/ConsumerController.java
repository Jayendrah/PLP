package com.cg.consumerservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.cg.consumerservice.dto.Employee;

@RestController
@RequestMapping("/employeemaintenance")
public class ConsumerController {
	@Autowired
	public RestTemplate restTemplate;
		
	@GetMapping("/getAll")
	public List<Employee> getEmployee(){
		String url="http://localhost:4888/employee/getAll";
		Employee [] employee= restTemplate.getForObject(url, Employee[].class);
		return Arrays.asList(employee);
	}
	@GetMapping("/{deptName}")
	public List<Employee> getAllEmployeesByDeptName(@PathVariable("deptName") String deptName){
		//String url="http://localhost:4888/employee/deptName"+deptName;
		Employee [] employee= restTemplate.getForObject("http://localhost:4888/employee/"+deptName, Employee[].class);
		return Arrays.asList(employee);
	}
}
