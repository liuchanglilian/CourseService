package com.csye6225.fall2018.courseservice.datamodel;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private long studentId;
	private long photo;
	private List<Course> enrolled;
	private Program program;
	
	public Student() {
		
	}
    
	public Student(long studentId, String name, long photo, Program program) {
		this.studentId = studentId;
		this.name = name;
		this.photo = photo;
		this.program = program;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getPhoto() {
		return photo;
	}

	public void setPhoto(long photo) {
		this.photo = photo;
	}

	public List<Course> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Course> enrolled) {
		this.enrolled = enrolled;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
	
}
