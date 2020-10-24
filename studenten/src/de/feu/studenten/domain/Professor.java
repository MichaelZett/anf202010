package de.feu.studenten.domain;

import java.time.LocalDate;

public class Professor extends Person {
	private final String mitarbeiterNummer;

	public Professor(String vorname, String nachname, LocalDate geburtsdatum,
			String mitarbeiterNummer) {
		super(vorname, nachname, geburtsdatum);
		this.mitarbeiterNummer = mitarbeiterNummer;
	}

	public String getMitarbeiterNummer() {
		return mitarbeiterNummer;
	}

}
