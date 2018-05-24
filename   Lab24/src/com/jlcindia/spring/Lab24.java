package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab24 {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println(".............Spring Container is ready............");
	Hello hello=(Hello)ctx.getBean("hello");
	hello.show();

	}

}
