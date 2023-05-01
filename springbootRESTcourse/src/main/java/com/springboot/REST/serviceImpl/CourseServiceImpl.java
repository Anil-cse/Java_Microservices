package com.springboot.REST.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.REST.exception.IdNotFoundException;
import com.springboot.REST.modal.Course;
import com.springboot.REST.repository.CourseRepository;
import com.springboot.REST.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addAllCourse(Course course) {
		Course saveCourse = courseRepository.save(course);
		return saveCourse;
	}

	@Override
	public List<Course> getAllCourse() {
		
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(int courseId) {
		
		Optional<Course> courseFromRepo = courseRepository.findById(courseId);
		if(courseFromRepo.isPresent())
		{
			return courseFromRepo.get();
		}
		else
		{
		throw new IdNotFoundException("id is not found for given course_id");
	}
}

	@Override
	public Course updateById(int courseId, Course course) {
		// TODO Auto-generated method stub
		
		Optional<Course> courseFromDb = courseRepository.findById(courseId);
		Course updateCourse = null;
		if(courseFromDb.isPresent())
		{
			Course courseFromRepo = courseFromDb.get();
			courseFromRepo.setName(course.getName());
			courseFromRepo.setDuration(course.getDuration());
			courseFromRepo.setPrice(course.getPrice());
			updateCourse = courseRepository.save(courseFromRepo);
		}
		else
		{
			throw new IdNotFoundException("id is not for course updation");
		}
		return updateCourse;
	}

	@Override
	public void deleteById(int courseId) {
		// TODO Auto-generated method stub
		if(!courseRepository.existsById(courseId))
		{
			throw new IdNotFoundException("id is not found for course deletion");
		}
		courseRepository.deleteById(courseId);

	}

}
