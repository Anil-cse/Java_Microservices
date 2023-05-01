package com.springboot.REST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.REST.modal.Course;
import com.springboot.REST.service.CourseService;

@RestController
@RequestMapping(value = "v1/api")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@PostMapping(value = "course")
	public ResponseEntity<Course> addAllCourse(@RequestBody Course course)
	{
		return new ResponseEntity<Course>(courseService.addAllCourse(course), HttpStatus.OK);
	}
	
	@GetMapping(value = "courses")
	public ResponseEntity<List<Course>> getAllCourse()
	{
		return new ResponseEntity<List<Course>>(courseService.getAllCourse(), HttpStatus.OK);
	}
	
	@GetMapping(value = "course/{courseId}")
	public ResponseEntity<Course> getCourseById(@PathVariable int courseId)
	{
		return new ResponseEntity<Course>(courseService.getCourseById(courseId), HttpStatus.OK);
	}
	
	@PutMapping(value = "course/{courseId}")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable int courseId)
	{
		return new ResponseEntity<Course>(courseService.updateById(courseId, course), HttpStatus.OK);
	}
	
	@DeleteMapping("course/{courseId}")
	public ResponseEntity<String> deleteCourse(@PathVariable int courseId)
	{
		courseService.deleteById(courseId);
		
		return new ResponseEntity<String>("record deleted by id", HttpStatus.OK);
	}
	
}
