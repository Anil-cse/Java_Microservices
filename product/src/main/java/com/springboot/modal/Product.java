package com.springboot.modal;


public class Product {

	private long id;
	private String name;
	private String category;
	private String time;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String name, String category, String time) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.time = time;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", time=" + time + "]";
	}
	
	
	
	
}
