package com.cg.labone.dto;

public class Employee implements Details
{
	int empId;
	String empName;
	double sal;
	String bussUnit;
	int age;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double sal, String bussUnit,
			int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.bussUnit = bussUnit;
		this.age = age;
	}

	@Override
	public void getAllDetails() 
	{
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee ID : "+empId+
						   "\nEmployee Name : "+empName+
						   "\nEmployee Salary : "+sal+
						   "\nEmployee BU : "+bussUnit+
						   "\nEmployee Age : "+age);
		
	}

}
