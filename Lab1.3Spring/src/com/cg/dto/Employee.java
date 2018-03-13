package com.cg.dto;

public class Employee implements Details 
{
	int empId;
	String empName;
	double sal;
	
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public void getAllDetails() {
		// TODO Auto-generated method stub
		
	}

	
}
