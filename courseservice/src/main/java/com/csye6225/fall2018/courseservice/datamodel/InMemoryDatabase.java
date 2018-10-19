package com.csye6225.fall2018.courseservice.datamodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class InMemoryDatabase {

	private static HashMap<Long, Professor> professorDB = new HashMap<>();
	private static HashMap<Long, Course> courseDB = new HashMap<>();
	private static HashMap<Long, Lecture> lectureDB = new HashMap<>();
	private static HashMap<Long, Program> programDB = new HashMap<>();
	private static HashMap<Long, Student> studentDB = new HashMap<>();
    private static void getPrepared() {
		Professor prof1 = new Professor(0L, "Tom", "InfoSystems", new Date());
		Professor prof2 = new Professor(1L, "Cat", "InfoSystems", new Date());
		Program p1 = new Program(0L, "Information Systems");
		programDB.put(0L, p1);
		professorDB.put(0L, prof1);
		professorDB.put(1L, prof2);
		Student s1 = new Student(0L, "chang", 123L, programDB.get(0L));
		Student s2 = new Student(1L, "chang2", 123L, programDB.get(0L));
		studentDB.put(0L, s1);
		studentDB.put(1L, s2);
		Course c1 = new Course(0L, "Cloud computing", professorDB.get(0L), studentDB.get(0L));
		c1.setProfessor(professorDB.get(0L));
		c1.getStudents().add(studentDB.get(0L));
		c1.getStudents().add(studentDB.get(1L));
		courseDB.put(0L, c1);
		Lecture l1 = new Lecture(0L, "System software");
		lectureDB.put(0L, l1);
		
	}

	public static HashMap<Long, Professor> getProfessorDB() {
		    getPrepared();
		
		return professorDB;
	}

	public static HashMap<Long, Course> getCourseDB() {
	    	getPrepared();
            return courseDB;
	}

	public static HashMap<Long, Lecture> getLectureDB() {
		getPrepared();
		return lectureDB;
	}

	public static HashMap<Long, Program> getProgramDB() {
		getPrepared();
		return programDB;
	}

	public static HashMap<Long, Student> getStudentDB() {
		getPrepared();
		return studentDB;
	}
}
