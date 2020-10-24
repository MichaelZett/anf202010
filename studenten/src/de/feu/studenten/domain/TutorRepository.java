package de.feu.studenten.domain;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TutorRepository {
	private List<Student> students = new LinkedList<>();

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public Iterable<Student> getAllStudents() {
		return new LinkedList<>(students);
	}

	public void showAll() {
		for(Student student : students) {
			student.printToConsole();
		}		
	}
		
	public int getCount() {
		return students.size();
	}
}
