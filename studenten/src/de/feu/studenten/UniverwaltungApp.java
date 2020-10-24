package de.feu.studenten;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import de.feu.studenten.domain.ConsolePrintable;
import de.feu.studenten.domain.Marker;
import de.feu.studenten.domain.Person;
import de.feu.studenten.domain.Student;
import de.feu.studenten.domain.StudentRepository;
import de.feu.studenten.domain.StudentState;
import de.feu.studenten.domain.Tutor;
import de.feu.studenten.domain.TutorRepository;

public class UniverwaltungApp {

	public static void main(String[] args) {
		// Studenten werden angelegt
		Student peterMueller = new Student("Peter", "Müller", LocalDate.of(1988, 3, 27));
		Student frankSchmidt = new Student("Frank", "Schmidt", LocalDate.of(1978, 8, 7));

		// Studenten werden "persistiert"
		StudentRepository repository = new StudentRepository();
		repository.addStudent(peterMueller);
		repository.addStudent(frankSchmidt);

		// Student mit der Matrikelnummer 000001 ändert Nachnamen
		Student toBeChanged = repository.getStudent("000001");
		toBeChanged.updateData(null, "Meyer", null);
		toBeChanged.immatrikulieren();

		// Tutor anlegen und Persistieren
		Tutor tutor = new Tutor("Michael", "Zöller", LocalDate.of(1985, 9, 9), "xyz");
		TutorRepository tutorRepository = new TutorRepository();
		tutorRepository.addTutor(tutor);

		// Alle relevanten Personen ausdrucken
		List<Repository> all = new ArrayList<>();
		all.add(repository);
		all.add(tutorRepository);
		for (Repository repo : all) {
			repo.showAll();
		}

		// Materialien versenden
		for (Student student : repository.getAllStudents()) {
			if (StudentState.INTERESSENT == student.getState()) {
				System.out.println("Werbebroschüre versandt an " + student.getVorname() + " " + student.getNachname());
			} else if (StudentState.IMMATRIKULIERT == student.getState()) {
				System.out.println("Studienmaterial versandt an " + student.getVorname() + " " + student.getNachname());
			} else if (StudentState.ALUMNI == student.getState()) {
				System.out.println(
						"Einladung zur Party versandt an " + student.getVorname() + " " + student.getNachname());
			}
		}

        // Die unterschiedlichen Rollen (Typen) von Frank Schmidt...
		Object objFrankSchmit = frankSchmidt;
		objFrankSchmit.toString();
		Marker markFrankSchmit = frankSchmidt;
		markFrankSchmit.hashCode();
		ConsolePrintable cpFrankSchmit = frankSchmidt;
		cpFrankSchmit.printToConsole();
		Person perFrankSchmit = frankSchmidt;
		perFrankSchmit.getVorname();

		frankSchmidt.getMatrikelnummer();
	}

}
