package com.cg.studentapp.ui;
import java.sql.SQLException;
import com.cg.studentapp.exception.InvalidMarksException;
import com.cg.studentapp.model.Student;
import com.cg.studentapp.service.IStudentSevice;
import com.cg.studentapp.service.StudentServicelmpl;


public class StudentApp {
	
	public static void main(String[] args) {
		
		IStudentSevice service=new StudentServicelmpl();
		
		Student student=new Student("s1028", "Rohit Shetty", 78.35F, 8764164765L);
		
		try {
			Student savedStudent=service.addStudent(student);
			System.out.println(savedStudent);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (InvalidMarksException e) {
			e.printStackTrace();
		}
		

	}

}