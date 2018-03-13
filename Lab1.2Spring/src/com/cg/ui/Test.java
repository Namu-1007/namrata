package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dto.EmployeeBean;



public class Test {

	public static void main(String[] args)
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeBean emp=(EmployeeBean) app.getBean("emp");
		emp.getAllDetails();


	}

}
