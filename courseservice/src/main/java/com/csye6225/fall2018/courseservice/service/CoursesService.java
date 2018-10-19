package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.Course;
import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.datamodel.Student;

public class CoursesService {

static HashMap<Long, Course> course_Map = InMemoryDatabase.getCourseDB();
	
	public List<Course> getAllCourses() {	
		//Getting the list
		ArrayList<Course> list = new ArrayList<>();
		for (Course course : course_Map.values()) {
			list.add(course);
		}
		return list ;
	}

	public void addCourse(String name,Professor professor, Student tA) {
		// Next Id 
		long nextAvailableId = course_Map.size() + 1;
		Course prof = new Course(nextAvailableId, name,professor , tA);
		course_Map.put(nextAvailableId, prof);
	}
	
	public Course addCourse(Course course) {	
		long nextAvailableId = course_Map.size() + 1;
		course.setCourseId(nextAvailableId);
		course_Map.put(nextAvailableId, course);
		return course_Map.get(nextAvailableId);
	}
	
	public Course getCourse(Long courseId) {
		System.out.println("size is"+course_Map.size());
		System.out.println(course_Map.get(courseId) == null);
		for(long i:course_Map.keySet()) {
			System.out.println("in key set"+i);
		}
	    System.out.println("I am here");
		return course_Map.get(courseId);
	}
	
	public Course deleteCourse(Long courseId) {
		Course deletedCourseDetails = course_Map.get(courseId);
		course_Map.remove(courseId);
		return deletedCourseDetails;
	}
	
	public Course updateCourseInformation(Long courseId, Course course) {	
		Course oldCourseObject = course_Map.get(courseId);
		courseId = oldCourseObject.getCourseId();
		course.setCourseId(courseId);
		course_Map.put(courseId, course) ;
		
		return course;
	}
	
}
