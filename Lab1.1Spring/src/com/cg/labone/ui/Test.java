package com.cg.labone.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.labone.dto.Employee;


public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee) app.getBean("emp");
		emp.getAllDetails();

	}

}
