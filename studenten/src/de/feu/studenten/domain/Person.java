package de.feu.studenten.domain;

import java.time.LocalDate;

/**
 * Access modifier: private-package-protected-public
 *
 */
public abstract class Person implements ConsolePrintable, Marker {

	protected String vorname;
	protected String nachname;
	protected LocalDate geburtsdatum;

	public Person(String vorname, String nachname, LocalDate geburtsdatum) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	@Override
	public void printToConsole() {
		System.out.println(this.toString());
	}

	public void updateData(String vorname, String nachname, LocalDate geburtsdatum) {
		if (vorname != null) {
			this.vorname = vorname;
		}
		if (nachname != null) {
			this.nachname = nachname;
		}
		if (geburtsdatum != null) {
			this.geburtsdatum = geburtsdatum;
		}
	}

}