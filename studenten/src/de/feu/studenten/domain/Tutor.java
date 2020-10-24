package de.feu.studenten.domain;

import java.time.LocalDate;

public class Tutor extends Person {
	private String steuernummer;

	public Tutor(String vorname, String nachname, LocalDate geburtsdatum, String steuernummer) {
		super(vorname, nachname, geburtsdatum);
		this.steuernummer = steuernummer;
	}

	public String getSteuernummer() {
		return steuernummer;
	}

	@Override
	public String toString() {
		return "Tutor [steuernummer=" + steuernummer + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", geburtsdatum=" + geburtsdatum + "]";
	}

}
