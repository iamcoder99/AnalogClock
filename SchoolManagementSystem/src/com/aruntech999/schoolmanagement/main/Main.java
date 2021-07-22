package com.aruntech999.schoolmanagement.main;
import java.util.*;
import com.aruntech999.schoolmanagement.crudoperation.SchoolCRUD;
import com.aruntech999.schoolmanagement.crudoperation.StudentCRUD;
import com.aruntech999.schoolmanagement.crudoperation.SupportiveStaffCRUD;
import com.aruntech999.schoolmanagement.crudoperation.TeacherCRUD;
import com.aruntech999.schoolmanagement.entity.School;
import com.aruntech999.schoolmanagement.entity.Student;
import com.aruntech999.schoolmanagement.entity.SupportiveStaff;
import com.aruntech999.schoolmanagement.entity.Teacher;

public class Main {
	SchoolCRUD schoolCRUD=new SchoolCRUD();
	TeacherCRUD teacherCRUD=new TeacherCRUD();
	StudentCRUD studentCRUD=new StudentCRUD();
	SupportiveStaffCRUD supportiveStaffCRUD=new SupportiveStaffCRUD();
	public static void main(String [] args) {
		Main m=new Main();
	System.out.println("Welcome to school management Services.we are providingfollowing functionalities:");	 
	Scanner sc=new Scanner(System.in);
	int parentChoice=0;
	do {
		System.out.println("1.Enter 1 to perform student related operation \n 2.Enter 2 to perform SupportiveStaff related operation \n3.Enter 3 to perform  Teacher related operation \n4. Enter 4 to perform school related operation \n5.Enter 5 to exist the programm" );
	parentChoice=sc.nextInt();
	if(parentChoice>=1 || parentChoice<=5) {
		int childChoice=0;
	switch(parentChoice)	{
	case 1:
		System.out.println("1.Enter 1 to create student \n 2.Enter 2  to get List of students present at time.\n 3. enter to 3 to get teacher based on techerId .\n 4. Enter to 4  to upadate teacher details\n 5. enter 5 to delete teacher Details.\n 6.enter to 6 to go back to main menu");
		childChoice=sc.nextInt();
		m.studentTask(childChoice,sc);
		break;
	case 3:
		System.out.println("1.Enter 1 to create Teacher\n 2.Enter 2  to get List of teachers present at time.\n 3. enter to 3 to get student based on roll no.\n 4. Enter to 4  to upadate Student details\n 5. enter 5 to delete student Details.\n 6.enter to 6 to go back to main menu");
		childChoice=sc.nextInt();
		m.teacherTask(childChoice,sc);
		break;
	case 2:
		System.out.println("1.Enter 1 to create supportiveStaff \n 2.Enter 2  to get List of supportiveStaff present at time.\n 3. enter to 3 to get supportiveStaff based on Id.\n 4. Enter to 4  to upadate  supportiveStaff details\n 5. enter 5 to delete  supportiveStaff Details.\n 6.enter to 6 to go back to main menu");
		childChoice=sc.nextInt();
		m.supportiveStaffTask(childChoice,sc);
		break;
	case 4:
		System.out.println("1.Enter 1 to create  school \n 2.Enter 2  to get List of  school present at time.\n 3. enter to 3 to get  school based on Id.\n 4. Enter to 4  to upadate   school details\n 5. enter 5 to delete   school Details.\n 6.enter to 6 to go back to main menu");
		childChoice=sc.nextInt();
		m. schoolTask(childChoice,sc);
		break;
	case 5:
		System.out.println("Thank you for using our services.Please visit again");
	}
	} 
	}while(parentChoice!=5);
		 
	}
	private void schoolTask(int childChoice, Scanner sc) {
		// TODO Auto-generated method stub
		switch(childChoice) {
		case 1:
		System.out.println("please enter following deatails create school");
		School school=getSchoolDetailsFromUser(sc);
		System.out.println("school create successfully with ID"+schoolCRUD.createSchoolDetails(school));
		break;
		case 2:
			ArrayList<School> schoolList=schoolCRUD.getAllSchoolDetails();
			schoolList.stream().forEach((schoolFromList)->System.out.println(schoolFromList));	
			break;
		case 3:
			schoolTask(2,sc);
			System.out.println("please enter school id if you want to details");
			int sid=sc.nextInt();
			School s1=schoolCRUD.getSchoolDetails(sid);
			if(s1!=null) {
				System.out.println(s1);
			}else {
				System.out.println("no details found");
			}
			break;
		case 4:
			schoolTask(2,sc);
			System.out.println("please enter school id if you want to update");
			int sid1=sc.nextInt();
			School upo=getSchoolDetailsFromUser(sc);
			upo.setSchoolId(sid1);
			int value=schoolCRUD.updateSchoolDetails(upo);
			if(value >0) {
				System.out.println(value+" successfully");
			}else {
				System.out.println("No details found");
			}
			break;
		case 5:
			schoolTask(2,sc);
			System.out.println("please enter school id if you want to delete");
			int s=sc.nextInt();
			 
			int dvalue=schoolCRUD.deleteSchoolDetails(s);
			if(dvalue >0) {
				System.out.println(dvalue+" successfully");
			}else {
				System.out.println("No details found");
			}
			break;
		case 6:
			 System.out.println("you are navigating to main menu");
			 break;
		
		}
		
	}
	private School getSchoolDetailsFromUser(Scanner sc) {
		 System.out.println("please enter scholId");
		 int schoolID=sc.nextInt();
		 System.out.println("please enter school name");
		 String name=sc.next();
		 System.out.println("please enter year of opening");
		 String yearOfOpening=sc.next();
		 System.out.println("please enter medium");
		 String medium=sc.next();
		 School school=new School(schoolID,name,yearOfOpening,medium);
		return null;
	}
	private void supportiveStaffTask(int childChoice, Scanner sc) {
		switch(childChoice) {
		case 1:
			System.out.println("please enter required supportive staff details");
			SupportiveStaff ss=getSupportiveStaffDetailsFromUser(sc);
			System.out.println("SupportiveStaff object creat"+supportiveStaffCRUD.createSupportiveStaffDetails(ss));
			break;
		 case 2:
			 ArrayList<SupportiveStaff>  ssList=supportiveStaffCRUD.getAllSupportiveStaffDetails();
			 ssList.stream().forEach((ssFromList)->System.out.println(ssFromList));
			 break;
		 case 3:
			 supportiveStaffTask(2,sc);
			 System.out.println("please enter id for which you want details:");
			 int  ssID=sc.nextInt();
			 SupportiveStaff  ss1= supportiveStaffCRUD.getSupportiveStaffDetails(ssID);
			 if( ss1!=null) {
				 System.out.println(ss1);
			 }else {
				 System.out.println("No details found");
			 }
				 break;
				 //  supportiveStaff    SupportiveStaff
		 case 4:
			 teacherTask(2,sc);
			 System.out.println("Enter for which id you want to update:");
			 int sid=sc.nextInt();
			 SupportiveStaff updateobject=getSupportiveStaffDetailsFromUser(sc);
			 updateobject.setId(sid);
			 int upid=supportiveStaffCRUD.updateSupportiveStaffDetails(updateobject);
			 if(upid>0) {
				 System.out.println();
				 System.out.println( upid+"updated successfully");
			 }else {
				 System.out.println("no details found");
			 }
			 break;
		 case 5:
			 teacherTask(2,sc);
			 System.out.println("Enter for which id you want to delete:");
			 int did=sc.nextInt();
			 int deid=supportiveStaffCRUD.deleteSupportiveStaffDetails(did);
			 if(deid>0) {
				 System.out.println();
				 System.out.println( deid+" delete successfully");
			 }else {
				 System.out.println("no details found");
			 }
			 break;
		 case 6:
			 System.out.println("you are navigating to main menu");
			 break;
		}
		
	}
	private SupportiveStaff getSupportiveStaffDetailsFromUser(Scanner sc) {
		System.out.println("Enter Student following SupportiveStaff   details..");
		 System.out.println("please enter name:");
		 String name =sc.next();
		 
		 System.out.println("please enter age");
		 
		 int age=sc.nextInt();
		 System.out.println("please enter address:");
		 String address=sc.next();
		 System.out.println("please enter SupportiveStaff id");
		 int id=sc.nextInt();
		 System.out.println("please enter domain");
		 String  domain=sc.next();
		  
		 SupportiveStaff  ss=new SupportiveStaff(name,age,address,id, domain);
		return ss;
	}
	private void teacherTask(int childChoice, Scanner sc) {
		 switch(childChoice) {
		 case 1:
			 Teacher teacher=getTeacherDetailsFromUser(sc);
			 
			 System.out.println("Teacher object is created with "+teacherCRUD.createTeacherDetails(teacher));
			 
			 break;
		 case 2:
			 ArrayList<Teacher> teacherList=teacherCRUD.getAllTeacherDetails();
			 teacherList.stream().forEach((teacherFromList)->System.out.println(teacherFromList));
			 break;
		 case 3:
			 teacherTask(2,sc);
			 System.out.println("please enter id for which you want details:");
			 int teacherID=sc.nextInt();
			 Teacher teach=teacherCRUD.getTeacherDeatails(teacherID);
			 if(teach!=null) {
				 System.out.println(teach);
			 }else {
				 System.out.println("No details found");
			 }
				 break;
		 case 4:
			 teacherTask(2,sc);
			 System.out.println("Enter for which id you want to update:");
			 int teacherid=sc.nextInt();
			 Teacher t1=getTeacherDetailsFromUser(sc) ;
			 t1.setId(teacherid);
			 int updateID=teacherCRUD.updateTeacherDetail(t1);
			 if(updateID > 0){
				 System.out.println(updateID+"updated successfully");
			 }else {
				 System.out.println("no details found");
			 }
			 break;
		 case 5:
			 teacherTask(2,sc);
			 System.out.println("Enter for which id you want to delete:");
			 int id=sc.nextInt();
			int deletedID =teacherCRUD.deleteTeacherDetail(id);
			if(deletedID>0) {
				System.out.println(deletedID+" deleted successfully");
			}else {
				System.out.println("No found id");
			}
			 break;
		 case 6:
			 System.out.println("you are navigating to main menu");
			 break;
		 }
		
	}
	private Teacher getTeacherDetailsFromUser(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student following Teacher details..");
		 System.out.println("please enter name:");
		 String name =sc.next();
		 
		 System.out.println("please enter age");
		 
		 int age=sc.nextInt();
		 System.out.println("please enter address:");
		 String address=sc.next();
		 System.out.println("please enter teacher id");
		 int id=sc.nextInt();
		 System.out.println("please enter qualification");
		 String qualification=sc.next();
		 System.out.println("please enter subject (enter comma separated mode)");
		 String subject=sc.next();
		 Teacher teacher=new Teacher(name,age,address,id,qualification,subject);
		return teacher;
	}
	private void studentTask(int childChoice,Scanner sc) {
		switch(childChoice) {
		case 1:
			Student s=getStudentDetailsFromUser(sc);
	System.out.println("Student created and added to Student list with"+studentCRUD.createStudent(s));
			break;
		case 2:
			ArrayList<Student> studentList=studentCRUD.getAllStudentDetails();
			studentList.stream().forEach((studentFromList)->System.out.println(studentFromList));
			break;
		case 3:
			System.out.println("please enter roll no to get Student detail.");
			int rno=sc.nextInt();
			Student searchStudent=studentCRUD.getStudentDetailByRollNo(rno);
			if(searchStudent!=null) {
				System.out.println(searchStudent);
			}else {
				System.out.println("no details found...");
			}
			break;
		case 4:
			studentTask(2,sc);
			System.out.println("enter roll no for which to update details");
			int rno1=sc.nextInt();
			Student updatedDta=getStudentDetailsFromUser(sc);
			updatedDta.setRollNo(rno1);
			int updatedStudentRollNo=studentCRUD.updateStudentDetail(updatedDta);
			if(updatedStudentRollNo>0)
			System.out.println("Updated Student's rollNo:"+updatedStudentRollNo);
			else
				System.out.println("no roll update");
			break;
		case 5:
			studentTask(2,sc);
			System.out.println("enter roll no for which to delete details");
			int rno2=sc.nextInt();
		 
			int deletedStudentRollNo=studentCRUD.deleteStudentDetail(rno2);
			if(deletedStudentRollNo>0) {
				
			System.out.println("delete data with Student's rollNo:"+deletedStudentRollNo);
			}
			else {
				System.out.println("no student details with give roll no.");
			}
			break;
		case 6:
			System.out.println("you are navigating to main menu");
			break;
			
	}
	}
	private Student getStudentDetailsFromUser(Scanner sc) {
 System.out.println("Enter Student following student details..");
 System.out.println("please enter name:");
 String name =sc.next();
 
 System.out.println("please enter age");
 
 int age=sc.nextInt();
 System.out.println("please enter address:");
 String address=sc.next();
 System.out.println("please enter your roll no:");
 int rollNo=sc.nextInt();
 System.out.println("please enter your standard");
 int standard=sc.nextInt();
 System.out.println("please enter area of interest");
 String areaOfInterest=sc.next();
 Student s=new Student(name,age,address,rollNo,standard,areaOfInterest);
return s;
	}
	 
}
