package com.aruntech999.schoolmanagement.crudoperation;

import java.util.ArrayList;
import java.util.Iterator;

import com.aruntech999.schoolmanagement.entity.School;

public class SchoolCRUD {


	ArrayList<School> schoolList=new ArrayList<>();
	public int createSchoolDetails(School s) {
		schoolList.add(s);
		return s.getSchoolId();
	}
	public ArrayList<School> getAllSchoolDetails(){
		return schoolList;
		
	}
	public School getSchoolDetails(int schoolId) {
		Iterator<School> itr=schoolList.iterator();
		while(itr.hasNext()) {
			School s=itr.next();
			if(s.getSchoolId()==schoolId) {
				return s;
			}
		}
		return null;
	}
	public int updateSchoolDetails(School s) {
		Iterator<School> itr=schoolList.iterator();
		int count=0;
		while(itr.hasNext()) {
			School s1=itr.next();
			if(s1.getSchoolId()==s.getSchoolId()) {
				 schoolList.set(count, s);
				 return s.getSchoolId();
			}
			count++;
		}
		return 0;
	}
	public int deleteSchoolDetails(int id) {
		Iterator<School> itr=schoolList.iterator();
	 
		while(itr.hasNext()) {
			School s=itr.next();
			if(s.getSchoolId()==id) {
				 schoolList.remove(s);
				 return s.getSchoolId();
			}
			 
		}
		return 0;
	
	}
}
