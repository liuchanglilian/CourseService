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
import com.csye6225.fall2018.courseservice.datamodel.Lecture;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.service.LectureService;
import com.csye6225.fall2018.courseservice.service.ProfessorsService;

@Path("lectures")
public class LecturesResource {

	LectureService lecService = new LectureService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lecture> getProfessorsByDeparment() {
		
		return lecService.getAllLectures();
		
	}
	@GET
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture getLecture(@PathParam("lectureId") long lecId) {
		System.out.println("long is"+lecId);
		return lecService.getLecture(lecId);
	}
	
	@DELETE
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture deleteLecture(@PathParam("lectureId") long lecId) {
		return lecService.deleteLecture(lecId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture addLecture(Lecture lec) {
			return lecService.addLecture(lec);
	}
	
	@PUT
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture updateLecture(@PathParam("lectureId") long lecId, 
			Lecture lec) {
		return lecService.updateLectureInformation(lecId, lec);
	}
	
	public void addLecture(String name) {
		lecService.addLecture(name);
	}
}
