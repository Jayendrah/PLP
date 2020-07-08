package com.cg.adminservice.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	private Integer empId;
	
	@Column(name="empfirstname")
	@NotBlank(message="First Name should not be blank")
	@Size(min=3, message="First Name should be atleast 3 characters")
	private String empFirstName;

	@Column(name="emplastname")
	@NotBlank(message="Last Name should not be blank")
	@Size(min=3, message="Last Name should be atleast 3 characters")
	private String empLastName;
	
	@Column(name="date_of_joining")
	private LocalDate dateofJoining;
	
	@Column(name="date_of_birth")
	private LocalDate dateofBirth;
	
	@Column(name="grade")
	@NotBlank(message="Grade should not be blank")
	private String empGrade;
	
	@Column(name="deptname")
	@NotBlank(message="Department Name should not be blank")
	@Size(min=2, message="Department Name should be atleast 2 characters")
	private String deptName;
	
	@NotBlank(message="Designation should not be blank")
	@Column(name="designation")
	private String designation;
	
	@NotBlank(message="Salary should not be blank")
	@Column(name="salary")
	private String salary;
	
	@NotBlank(message="Gender should not be blank")
	@Column(name="gender")
	private String gender;
	
	@Column(name="maritalstatus")
	@NotBlank(message="Marital Status should not be blank")
	private String maritalStatus;
	
	@Column(name="home_address")
	private String homeAddress;
	
	@Size(min=10,max=10, message="Mobile no should be 10 digit")
	@Column(name="mobile_no")
	private String mobileNo;
	
	public Employee(Integer empId, String empFirstName, String empLastName, String empGrade, String deptName,
			String maritalStatus, LocalDate dateofJoining, LocalDate dateofBirth, String designation, String gender,String salary, String homeAddress, String mobileNo) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName= empLastName;
		this.empGrade = empGrade;
		this.deptName = deptName;
		this.maritalStatus= maritalStatus;
		this.dateofJoining= dateofJoining;
		this.dateofBirth= dateofBirth;
		this.designation=designation;
		this.gender=gender;
		this.salary=salary;
		this.homeAddress= homeAddress;
		this.mobileNo= mobileNo;
		 
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
	public LocalDate getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(LocalDate dateofJoining) {
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
	public String getHomeAddress() { 
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", dateofJoining=" + dateofJoining + ", dateofBirth=" + dateofBirth + ", empGrade=" + empGrade
				+ ", deptName=" + deptName + ", designation=" + designation + ", salary=" + salary + ", gender="
				+ gender + ", maritalStatus=" + maritalStatus + ", homeAddress=" + homeAddress + ", mobile_no="
				+ mobileNo + "]";
	}
	
	
}
