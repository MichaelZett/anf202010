package de.feu.studenten.domain;

import java.util.LinkedList;
import java.util.List;

import de.feu.studenten.Repository;

public class TutorRepository implements Repository {
	private List<Tutor> tutors = new LinkedList<>();

	public void addTutor(Tutor tutor) {
		tutors.add(tutor);
	}
	 
	public Iterable<Tutor> getAllTutors() {
		return new LinkedList<>(tutors);
	}
  
	@Override
	public void showAll() {
		for(Tutor tutor : tutors) {
			tutor.printToConsole();
		}		
	}
		
	@Override
	public int getCount() {
		return tutors.size();
	}
}
