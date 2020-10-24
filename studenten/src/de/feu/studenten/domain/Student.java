package de.feu.studenten.domain;

import java.time.LocalDate;

/**
 * access modifier: public: jeder (default): package-private bedeutet nur im
 * gleiche Paket private: nur in der Klasse bekannt
 */
public class Student extends Person {
	private static int count = 0;
	private String matrikelnummer;
	
	public Student(String vorname, String nachname, LocalDate geburtsdatum) {
		super(vorname, nachname, geburtsdatum);
		count++; // count = count + 1;
		this.matrikelnummer = "00000" + count;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matrikelnummer == null) ? 0 : matrikelnummer.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (matrikelnummer == null) {
			if (other.matrikelnummer != null)
				return false;
		} else if (!matrikelnummer.equals(other.matrikelnummer))
			return false;
		return true;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Student [vorname=" + vorname + ", nachname=" + nachname 
				+ ", matrikelnummer=" + matrikelnummer
				+ ", geburtsdatum=" + geburtsdatum + "]";
	}
		
}
