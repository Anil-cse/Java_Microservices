package com.springboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.demo.repo.EmployeeRepository;
import com.springboot.demo.repoModel.Employee;

@SpringBootApplication
public class SpringdataJpaApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
      	Employee employee = new Employee();
      	employee.setEmpName("Ankit");
      	employee.setDept("hr");
      	employeeRepository.save(employee);
      	List<Employee> listOfEmployee = employeeRepository.findAll();
      	listOfEmployee.forEach(System.out::println);

}
}