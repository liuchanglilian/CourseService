package com.csye6225.fall2018.courseservice.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Course {
	long courseId;
	String name;
	List<Lecture> lectures;
	List<String> boards;
	List<String> roster;
	List<Student> students;
	Professor professor;
	Student TA;
	public Course() {
		
	}
	
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public Course(long courseId,String name,Professor professor, Student tA) {
		
		this.courseId = courseId;
		this.name = name;
		this.lectures = new ArrayList<>();
		this.boards = new ArrayList<>();
		this.roster = new ArrayList<>();
		this.students = new ArrayList<>();
		this.students = students;
		this.professor = professor;
		this.TA = tA;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}
	public void AddLecture(Lecture lecture) {
		this.lectures.add(lecture);
	}
	public List<String> getBoard() {
		return boards;
	}
	public void addBoard(String board) {
		this.boards.add(board);
	}
	public List<String> getRoster() {
		return roster;
	}
	public void addRoster(String name) {
		this.roster.add(name);
	}
	public List<Student> getStudents() {
		return students;
	}
	public void addStudents(Student student) {
		this.students.add(student);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Student getTA() {
		return TA;
	}
	public void setTA(Student tA) {
		TA = tA;
	}
	
}
