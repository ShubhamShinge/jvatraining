package com.training.model;

public class Employee {
	private int empId;
	private String empName;
	private int Salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}

	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
	}
	
	

}
