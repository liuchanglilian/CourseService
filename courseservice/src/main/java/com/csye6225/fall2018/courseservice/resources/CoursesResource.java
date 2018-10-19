package com.csye6225.fall2018.courseservice.resources;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.csye6225.fall2018.courseservice.datamodel.Course;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.datamodel.Student;
import com.csye6225.fall2018.courseservice.service.CoursesService;
import com.csye6225.fall2018.courseservice.service.ProfessorsService;

@Path("courses")
public class CoursesResource {
	CoursesService courService = new CoursesService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getProfessorsByDeparment() {
		
		return courService.getAllCourses();
		
	}
	
	@GET
	@Path("/{courseId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course getCourse(@PathParam("courseId") long courId) {
		System.out.println("long is"+courId);
		return courService.getCourse(courId);
	}
	
	@DELETE
	@Path("/{courseId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course deleteCourse(@PathParam("courseId") long courId) {
		return courService.deleteCourse(courId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course addCourse(Course cour) {
			return courService.addCourse(cour);
	}
	
	@PUT
	@Path("/{courseId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course updateCourse(@PathParam("courseId") long courId, 
			Course cour) {
		return courService.updateCourseInformation(courId, cour);
	}
	
	public void addCourse(String name,Professor professor, Student tA) {
		courService.addCourse(name,professor,tA);
	}
}
