package com.springboot.REST.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_details")
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String name;
	private String duration;
	private float price;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String name, String duration, float price) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.duration = duration;
		this.price = price;
	}
	public int getId() {
		return courseId;
	}
	public void setId(int id) {
		this.courseId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + courseId + ", name=" + name + ", duration=" + duration + ", price=" + price + "]";
	}
	
	
}
