package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App {

	public static void main(String[] args)
	{
		System.out.println("my program started...");
		//spring jdbc>jdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Dao/config.xml");
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		Student student=new Student();
		student.setId(38);
		student.setName("hii");
		student.setCity("bye");
		
		int result=studentDao.insert(student);
		System.out.println("student added "+result);
		
	}
}
