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
import com.csye6225.fall2018.courseservice.service.ProfessorsService;
import com.csye6225.fall2018.courseservice.service.ProgramsService;

@Path("programs")
public class ProgramsResource {
	ProgramsService progService = new ProgramsService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Program> getPrograms() {
		
		return progService.getAllPrograms();
		
	}
	@GET
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program getProfessor(@PathParam("programId") long progId) {
		System.out.println("long is"+progId);
		return progService.getProgram(progId);
	}
	
	@DELETE
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program deleteProgram(@PathParam("programId") long progId) {
		return progService.deleteProgram(progId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program addProgram(Program prog) {
			return progService.addProgram(prog);
	}
	
	@PUT
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program updateProgram(@PathParam("programId") long progId, 
			Program prog) {
		return progService.updateProgramInformation(progId, prog);
	}
	
	public void addProgram(String name) {
		progService.addProgram(name);
	}
}
