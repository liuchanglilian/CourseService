package com.csye6225.fall2018.courseservice.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Program {
	long programId;
	String name;
    List<Course> courses;

	public Program() {
		
	}
	
	public Program(long programId,String name) {
		this.name = name;
		this.programId = programId;
	    this.courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getProgramId() {
		return programId;
	}

	public void setProgramId(long programId) {
		this.programId = programId;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}
    
}
