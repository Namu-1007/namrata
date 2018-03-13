package com.cg.dto;

import java.util.List;

public class SBU implements Details
{
	int sbuCode;
	String sbuName;
	String sbuHead;
	List<Employee> emp;
	
	
	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public void getAllDetails() 
	{
		System.out.println("SBU Details");
		System.out.println("--------------------");
		System.out.println("sbuCode= "+sbuCode+", sbuName= "+sbuName+", sbuHead= "+sbuHead);
		System.out.println("Employee Details:------------------");
		for(Employee employee:emp)
		{
			System.out.println("Employee [empId=" + employee.getEmpId() + ", empName=" + employee.getEmpName() + ", sal="
					+ employee.getSal() + "]");
		}
		
	}

}
