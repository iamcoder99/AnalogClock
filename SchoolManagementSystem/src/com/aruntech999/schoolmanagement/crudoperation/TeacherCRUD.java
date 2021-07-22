package com.aruntech999.schoolmanagement.crudoperation;
import java.util.*;

import com.aruntech999.schoolmanagement.entity.Student;
import com.aruntech999.schoolmanagement.entity.Teacher;
public class TeacherCRUD {
ArrayList<Teacher> teacherList=new ArrayList<>();
public int createTeacherDetails(Teacher t) {
	teacherList.add(t);
	return t.getId();
	
}
public ArrayList<Teacher> getAllTeacherDetails(){
	
	return  teacherList;
}
public Teacher getTeacherDeatails(int id){
	 Iterator<Teacher> itr=teacherList.iterator();
	 while(itr.hasNext()) {
		 Teacher t=itr.next();
		 if(t.getId()==id) {
			 return t;
		 }
	 }
	return null;
}
public int updateTeacherDetail(Teacher t) {
	 Iterator<Teacher> itr=teacherList.iterator();
	 int count=0;
	 while(itr.hasNext()) {
		 Teacher t1=itr.next();
		  if( t1.getId()==t.getId()) {
			  teacherList.set(count, t);
			  return  t.getId();
		  }
		  count++;
	 }
	 return 0;
}
public int deleteTeacherDetail(int id) {
	 Iterator<Teacher> itr=teacherList.iterator();
	 while(itr.hasNext()) {
		 Teacher t=itr.next();
		  if(t.getId()==id) {
			  teacherList.remove(t);
			 return t.getId();
		  }
		   
	 }
	 return 0;
}
}
