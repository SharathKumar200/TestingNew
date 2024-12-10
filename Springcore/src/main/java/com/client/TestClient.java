package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbb.Emp;
import com.sbb.Student;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Emp e = (Emp) context.getBean("emp");
		e.empinfo();
		Student s = (Student) context.getBean("student");
		s.studentinfo();
	}

}
