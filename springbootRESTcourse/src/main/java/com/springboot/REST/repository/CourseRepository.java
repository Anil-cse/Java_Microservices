package com.springboot.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.REST.modal.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
