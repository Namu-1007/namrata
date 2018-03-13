package com.cg.dao;

import java.util.List;

import com.cg.dto.Employee;

public class EmployeeDaoImpl implements IEmployeeDao
{
	List<Employee> eList;
	
	public List<Employee> geteList() 
	{
		return eList;
	}

	public void seteList(List<Employee> eList) 
	{
		this.eList = eList;
	}

	@Override
	public void getAllDetails(int empId)
	{
		Employee emp=null;
		for(Employee e:eList)
		{
			if(e.getEmpId()==empId)
			{
				emp=e;
			}
			else
			{
				;
			}
		}
		
	}

}
