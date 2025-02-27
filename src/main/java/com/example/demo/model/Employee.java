package com.example.demo.model;


public class Employee {

	private String empid;
	private String empName="Rathnesh";
	private Double empsalary;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(Double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	public Employee(String empid, String empName, Double empsalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsalary = empsalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
