package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Professor;
import com.csye6225.fall2018.courseservice.datamodel.Program;

public class ProgramsService {
static HashMap<Long, Program> program_Map = InMemoryDatabase.getProgramDB();
	public List<Program> getAllPrograms() {	
		ArrayList<Program> list = new ArrayList<>();
		for (Program pro : program_Map.values()) {
			list.add(pro);
		}
		return list ;
	}
    public void addProgram(String name) {
		long nextAvailableId = program_Map.size() + 1;
		Program pro = new Program(nextAvailableId,name);
		program_Map.put(nextAvailableId, pro);
	}
	
	public Program addProgram(Program pro) {	
		long nextAvailableId = program_Map.size() + 1;
		pro.setProgramId(nextAvailableId);
		program_Map.put(nextAvailableId, pro);
		return program_Map.get(nextAvailableId);
	}
	
	public Program getProgram(Long proId) {
		System.out.println("size is"+program_Map.size());
		System.out.println(program_Map.get(proId) == null);
		for(long i:program_Map.keySet()) {
			System.out.println("in key set"+i);
		}
		return program_Map.get(proId);
	}
	
	public Program deleteProgram(Long proId) {
		Program deletedProDetails = program_Map.get(proId);
		program_Map.remove(proId);
		return deletedProDetails;
	}
	
	public Program updateProgramInformation(Long proId,Program pro) {	
		Program oldProObject = program_Map.get(proId);
		proId = oldProObject.getProgramId();
		pro.setProgramId(proId);
		program_Map.put(proId, pro) ;
		
		return pro;
	}
	
	
	
	
}
