
package com.tnsif.studentmain;

import com.tnsif.model.*;
import com.tnsif.service.*;

public class StudentMain {
	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		student.setSid(109);
		student.setSname("Ram");
		service.addStudent(student);
		
		/*student = service.findStudentById(10);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname()); 
		student = service.findStudentById(100);
		student.setSname("Sachin Tendulkar");
		service.updateStudent(student);
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname()); 
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
		
		*/
	}
}
