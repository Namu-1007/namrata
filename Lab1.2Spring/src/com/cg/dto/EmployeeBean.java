package com.cg.dto;

public class EmployeeBean implements Details
{
	int age;
	int empId;
	String empName;
	double sal;
	SBUBean sbu;
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public SBUBean getSbu() {
		return sbu;
	}

	public void setSbu(SBUBean sbu) {
		this.sbu = sbu;
	}

	@Override
	public void getAllDetails() 
	{
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee [empAge="+age+", empId=" + empId + ", empName=" + empName
				+ ", empSal=" + sal +
				"\nsbu details= SBU[sbuCode=" + sbu.getSbuId() + ", sbuName=" + sbu.getSbuName() + ", sbuHead="
			+ sbu.getSbuHead() + "]]");
		
	}

	

}
