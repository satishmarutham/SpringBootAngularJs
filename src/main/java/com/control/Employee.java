package com.control;

public class Employee {
private String name;
private String email;
private long id;

public Employee(String name, String email, long id) {
	super();
	this.name = name;
	this.email = email;
	this.id = id;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", email=" + email + ", id=" + id + "]";
}
public Employee(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}


}
