package com.spring.noXml;
public class Person {
String name;
int age;
Address address;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Person(String name, int age, Address address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
}
void show(){  
    System.out.println(age+" "+name);  
    System.out.println(address);  
}  
}