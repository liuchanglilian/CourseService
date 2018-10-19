package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.datamodel.Program;
import com.csye6225.fall2018.courseservice.datamodel.Student;

public class StudentsService {
static HashMap<Long, Student> student_Map = InMemoryDatabase.getStudentDB();
	
	public List<Student> getAllStudents() {	
		ArrayList<Student> list = new ArrayList<>();
		for (Student stu : student_Map.values()) {
			list.add(stu);
		}
		return list ;
	}

	public void addStudent(String name, long photo, Program program)  {
		long nextAvailableId = student_Map.size() + 1;
		Student stu = new Student(nextAvailableId, name , 
				photo, program);
		student_Map.put(nextAvailableId, stu);
	}
	
	public Student addStudent(Student stu) {	
		long nextAvailableId = student_Map.size() + 1;
		stu.setStudentId(nextAvailableId);
		student_Map.put(nextAvailableId, stu);
		return student_Map.get(nextAvailableId);
	}
	
	public Student getStudent(Long studId) {
		System.out.println("size is"+student_Map.size());
		System.out.println(student_Map.get(studId) == null);
		for(long i:student_Map.keySet()) {
			System.out.println("in key set"+i);
		}
		return student_Map.get(studId);
	}
	
	public Student deleteStudent(Long stuId) {
		Student deletedStuDetails = student_Map.get(stuId);
		student_Map.remove(stuId);
		return deletedStuDetails;
	}
	
	public Student updateStudentInformation(Long stuId, Student stu) {	
		Student oldStuObject = student_Map.get(stuId);
		stuId = oldStuObject.getStudentId();
		stu.setStudentId(stuId);
		student_Map.put(stuId, stu) ;
		
		return stu;
	}
	
	
}
