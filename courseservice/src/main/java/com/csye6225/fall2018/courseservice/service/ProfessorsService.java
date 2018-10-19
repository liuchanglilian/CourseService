package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Professor;

public class ProfessorsService {
	static HashMap<Long, Professor> prof_Map = InMemoryDatabase.getProfessorDB();
	public List<Professor> getAllProfessors() {	
		ArrayList<Professor> list = new ArrayList<>();
		for (Professor prof : prof_Map.values()) {
			list.add(prof);
		}
		return list ;
	}
    public void addProfessor(String name, String department, Date joiningDate) {
		long nextAvailableId = prof_Map.size() + 1;
		Professor prof = new Professor(nextAvailableId, name , 
				department, joiningDate);
		prof_Map.put(nextAvailableId, prof);
	}
	
	public Professor addProfessor(Professor prof) {	
		long nextAvailableId = prof_Map.size() + 1;
		prof.setProfessorId(nextAvailableId);
		prof_Map.put(nextAvailableId, prof);
		return prof_Map.get(nextAvailableId);
	}
	public Professor getProfessor(Long profId) {
		System.out.println("size is"+prof_Map.size());
		System.out.println(prof_Map.get(profId) == null);
		for(long i:prof_Map.keySet()) {
			System.out.println("in key set"+i);
		}
		return prof_Map.get(profId);
	}
	public Professor deleteProfessor(Long profId) {
		Professor deletedProfDetails = prof_Map.get(profId);
		prof_Map.remove(profId);
		return deletedProfDetails;
	}
	public Professor updateProfessorInformation(Long profId, Professor prof) {	
		Professor oldProfObject = prof_Map.get(profId);
		profId = oldProfObject.getProfessorId();
		prof.setProfessorId(profId);
		prof_Map.put(profId, prof) ;
		
		return prof;
	}
	public List<Professor> getProfessorsByDepartment(String department) {	
		ArrayList<Professor> list = new ArrayList<>();
		for (Professor prof : prof_Map.values()) {
			if (prof.getDepartment().equals(department)) {
				list.add(prof);
			}
		}
		return list ;
	}
	
}
