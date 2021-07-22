package com.aruntech999.schoolmanagement.entity;

public class SupportiveStaff extends Person {
 
int id;
String donain;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDonain() {
	return donain;
}
public void setDonain(String donain) {
	this.donain = donain;
}
@Override
public void work() {
	 System.out.println("Works as Student..");
	
}
public SupportiveStaff(String name, int age, String address, int id, String donain) {
	super(name, age, address);
	this.id = id;
	this.donain = donain;
}

}
