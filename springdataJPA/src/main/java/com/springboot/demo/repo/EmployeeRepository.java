package com.springboot.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.repoModel.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

