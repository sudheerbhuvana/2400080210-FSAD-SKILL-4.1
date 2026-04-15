package com.klu.main;

import com.klu.model.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student) con.getBean("student");
		s.display();
		con.close();
	}

}