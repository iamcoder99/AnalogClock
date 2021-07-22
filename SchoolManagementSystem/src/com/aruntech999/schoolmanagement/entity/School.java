package com.aruntech999.schoolmanagement.entity;

public class School {
	private int schoolId;
private String name;
private String yearOfOpening;
private String medium;
public String getName() {
	return name;
}

 
public School(int schoolId, String name, String yearOfOpening, String medium) {
	super();
	this.schoolId = schoolId;
	this.name = name;
	this.yearOfOpening = yearOfOpening;
	this.medium = medium;
}

@Override
public String toString() {
	return "School [schoolId=" + schoolId + ", name=" + name + ", yearOfOpening=" + yearOfOpening + ", medium=" + medium
			+ "]";
}

public int getSchoolId() {
	return schoolId;
}

public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}

public void setName(String name) {
	this.name = name;
}

public String getYearOfOpening() {
	return yearOfOpening;
}

public void setYearOfOpening(String yearOfOpening) {
	this.yearOfOpening = yearOfOpening;
}

public String getMedium() {
	return medium;
}

public void setMedium(String medium) {
	this.medium = medium;
}
public School(){
	 
 }
 
 
}
