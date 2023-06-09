package com.springboot.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.REST.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
