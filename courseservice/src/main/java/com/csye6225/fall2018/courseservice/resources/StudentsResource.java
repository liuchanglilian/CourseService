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

import com.csye6225.fall2018.courseservice.datamodel.Lecture;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.datamodel.Program;
import com.csye6225.fall2018.courseservice.datamodel.Student;
import com.csye6225.fall2018.courseservice.service.ProfessorsService;
import com.csye6225.fall2018.courseservice.service.StudentsService;

@Path("students")
public class StudentsResource {
	StudentsService stuService = new StudentsService();
	
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents() {
		
		return stuService.getAllStudents();
		
	}
	@GET
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("studentId") long studentId) {
		System.out.println("long is"+studentId);
		return stuService.getStudent(studentId);
	}
	
	@DELETE
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student deleteStudent(@PathParam("studentId") long studentId) {
		return stuService.deleteStudent(studentId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student addStudent(Student stu) {
			return stuService.addStudent(stu);
	}
	
	@PUT
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(@PathParam("studentId") long studentId, 
			Student stu) {
		return stuService.updateStudentInformation(studentId, stu);
	}
	
	public void addStudent(String name, long photo, Program program) {
		stuService.addStudent(name, photo, program);
	}
}
