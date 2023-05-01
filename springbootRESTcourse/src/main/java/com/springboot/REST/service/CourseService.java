package com.springboot.REST.service;

import java.util.List;

import com.springboot.REST.modal.Course;

public interface CourseService {
	
	public Course addAllCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(int courseId);
	
	public Course updateById(int courseId, Course course);
	
	public void deleteById(int courseId);

}
