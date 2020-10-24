package de.feu.studenten;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import de.feu.studenten.domain.ConsolePrintable;
import de.feu.studenten.domain.Person;
import de.feu.studenten.domain.Student;
import de.feu.studenten.domain.StudentRepository;
import de.feu.studenten.domain.Tutor;

public class UniverwaltungApp {

	public static void main(String[] args) {
		Student peterMueller = new Student("Peter", "Müller", LocalDate.of(1988, 3, 27));
		Student frankSchmidt = new Student("Frank", "Schmidt", LocalDate.of(1978, 8, 7));

		System.out.println("Anahl Studenten: " + Student.getCount());

		StudentRepository repository = new StudentRepository();
		repository.addStudent(peterMueller);
		repository.addStudent(frankSchmidt);

		repository.showAll();
		System.out.println("Anzahl Studenten im Repo: " //
				+ repository.getCount());
			
		Tutor tutor = new Tutor("Michael", "Zöller", LocalDate.of(1985,  9, 9), "xyz");
		
		List<ConsolePrintable> toBePrinted =  new ArrayList<>();
		
		toBePrinted.add(peterMueller);
		toBePrinted.add(tutor);
		
		toBePrinted.forEach(ConsolePrintable::printToConsole);
	}

}
