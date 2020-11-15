package com.cg;

import java.time.LocalDate;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private LocalDate dob;
	 public Employee() {
		 
	 }
	public Employee(int empId, String empName, double salary, LocalDate dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dob=" + dob + "]";
	}
	 
}
