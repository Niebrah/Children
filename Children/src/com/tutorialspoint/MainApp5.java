package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansC.xml");
		
		
		HelloWorld5 obj = (HelloWorld5) context.getBean("HelloWorld5");
		obj.getMessage();
		obj.getMessage2();
		
		HelloMars objM = (HelloMars) context.getBean("HelloMars");
		objM.getMessage();
		objM.getMessage2();
		objM.getMessage3();
		
		
		
	}

}
