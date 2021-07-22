package com.aruntech999.schoolmanagement.entity;
public  class Teacher extends Person {
int id;
String qualification;
String subject;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public void work() {
	 System.out.println("Works as Teacher..");
	
}
public Teacher(String name, int age, String address, int id, String qualification, String subject) {
	super(name, age, address);
	this.id = id;
	this.qualification = qualification;
	this.subject = subject;
}
}
