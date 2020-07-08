package com.cg.consumerservice.dto;



import java.time.LocalDate;

public class Employee {
	private Integer empId;
	
	private String empFirstName;

	private String empLastName;
	
	private LocalDate dateofJoining;
	
	private LocalDate dateofBirth;

	private String empGrade;
	
	private String deptName;
	
	private String designation;
	
	private String salary;
	
	private String gender;
	
	private String maritalStatus;

	private String homeAddress;
	
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
				+ gender + ", maritalStatus=" + maritalStatus + ", homeAddress=" + homeAddress + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
}
