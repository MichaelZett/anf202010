package de.feu.studenten.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import de.feu.studenten.Repository;

public class StudentRepository implements Repository {
	private Map<String, Student> students = new HashMap<>();

	public void addStudent(Student student) {
		students.put(student.getMatrikelnummer(), student);
	}
	
	public Student getStudent(String matrikelnummer) {
		return students.get(matrikelnummer);
	}
	
	public Iterable<Student> getAllStudents() {
		return new HashSet<>(students.values());
	}

	@Override
	public void showAll() {
		for(Student student : students.values()) {
			student.printToConsole();
		}		
	}
		
	@Override
	public int getCount() {
		return students.size();
	}
}
