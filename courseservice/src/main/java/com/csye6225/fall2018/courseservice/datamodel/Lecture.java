package com.csye6225.fall2018.courseservice.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Lecture {
	long lectureId;
	String name;
	List<String> notes;
	List<String> materials;
	
	public Lecture() {
		
	}
	
	public Lecture(long lectureId,String name) {
		this.name = name;
		this.lectureId = lectureId;
		this.notes = new ArrayList<>();
		this.materials = new ArrayList<>();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLectureId() {
		return lectureId;
	}

	public void setLectureId(long lectureId) {
		this.lectureId = lectureId;
	}

	public List<String> getNotes() {
		return notes;
	}
	public void addNote(String note) {
		this.notes.add(note);
	}
	public List<String> getMaterials() {
		return materials;
	}
	public void setMaterials(String material) {
		this.materials.add(material);
	}
	
}
