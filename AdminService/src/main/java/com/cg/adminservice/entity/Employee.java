package com.cg.adminservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empid")
	@Min(value=999999, message="Employee Id has to be six digit")
	@NotNull(message="Id should not be null")
	@Positive(message="Id should be positive")
	private Integer empId;
	
	@Column(name="empfirstname")
	@NotBlank(message="First Name should not be blank")
	@Size(min=3, message="First Name should be atleast 3 characters")
	private String empFirstName;
	
	@Column(name="emplastname")
	@NotBlank(message="Last Name should not be blank")
	@Size(min=3, message="Last Name should be atleast 3 characters")
	private String empLastName;
	
	@DateTimeFormat(pattern="DD-MM-YY")
	@Column(name="date_of_Joining")
	private String dateofJoining;
	
	@DateTimeFormat(pattern="DD-MM-YY")
	@Column(name="date_of_Birth")
	private String dateofBirth;
	
	@Column(name="grade")
	@NotBlank(message="Grade should not be blank")
	private String empGrade;
	
	@Column(name="deptname")
	@NotBlank(message="Department Name should not be blank")
	@Size(min=2, message="Department Name should be atleast 2 characters")
	private String deptName;
	
	@Max(50)
	@Column(name="designation")
	private String designation;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="maritalstatus")
	@NotBlank(message="Marital Status should not be blank")
	private String maritalStatus;
	
	@Column(name="home_address")
	private String home_address;
	
	@Column(name="mobile_no")
	private String mobile_no;
	
	public Employee(Integer empId, String empFirstName, String empLastName, String empGrade, String deptName,
			String maritalStatus, String date_of_Joining, String dateofBirth, String designation, String gender,String salary, String home_address, String mobile_no) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName= empLastName;
		this.empGrade = empGrade;
		this.deptName = deptName;
		this.maritalStatus= maritalStatus;
		this.dateofJoining= date_of_Joining;
		this.dateofBirth= dateofBirth;
		this.designation=designation;
		this.gender=gender;
		this.salary=salary;
		this.home_address= home_address;
		this.mobile_no= mobile_no;
		 
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public String getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", dateofJoining=" + dateofJoining + ", dateofBirth=" + dateofBirth + ", empGrade=" + empGrade
				+ ", deptName=" + deptName + ", designation=" + designation + ", salary=" + salary + ", gender="
				+ gender + ", maritalStatus=" + maritalStatus + ", home_address=" + home_address + ", mobile_no="
				+ mobile_no + "]";
	}
	
	
}
