package com.kumar.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Customer thecustomer=(Customer)context.getBean("customer", Customer.class);
		thecustomer.customerDetails();

	}

}
