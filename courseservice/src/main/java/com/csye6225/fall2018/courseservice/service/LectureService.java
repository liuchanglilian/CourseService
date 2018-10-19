package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Lecture;
import com.csye6225.fall2018.courseservice.datamodel.Professor;

public class LectureService {
static HashMap<Long, Lecture> lecture_Map = InMemoryDatabase.getLectureDB();
	public List<Lecture> getAllLectures() {	
		ArrayList<Lecture> list = new ArrayList<>();
		for (Lecture lec : lecture_Map.values()) {
			list.add(lec);
		}
		return list ;
	}

	public void addLecture(String name) {
		long nextAvailableId = lecture_Map.size() + 1;
		Lecture lec = new Lecture(nextAvailableId,name);
		lecture_Map.put(nextAvailableId, lec);
	}
	
	public Lecture addLecture(Lecture lec) {	
		long nextAvailableId = lecture_Map.size() + 1;
		lec.setLectureId(nextAvailableId);
		lecture_Map.put(nextAvailableId, lec);
		return lecture_Map.get(nextAvailableId);
	}
	
	public Lecture getLecture(Long lectureId) {
		System.out.println("size is"+lecture_Map.size());
		System.out.println(lecture_Map.get(lectureId) == null);
		for(long i:lecture_Map.keySet()) {
			System.out.println("in key set"+i);
		}
		return lecture_Map.get(lectureId);
	}
	
	public Lecture deleteLecture(Long lecId) {
		Lecture deletedLectureDetails = lecture_Map.get(lecId);
		lecture_Map.remove(lecId);
		return deletedLectureDetails;
	}
	
	public Lecture updateLectureInformation(Long lecId, Lecture lec) {	
		Lecture oldLectureObject = lecture_Map.get(lecId);
		lecId = oldLectureObject.getLectureId();
		lec.setLectureId(lecId);
		lecture_Map.put(lecId, lec) ;
		
		return lec;
	}
	
	
}
