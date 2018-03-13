package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dto.SBU;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		 SBU s = (SBU) app.getBean("sbu");
		 s.getAllDetails();

	}

}
