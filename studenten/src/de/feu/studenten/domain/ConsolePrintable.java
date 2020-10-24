package de.feu.studenten.domain;

/**
 * Interface: Methode definiert
 * AbstractSuperclass: defaultMethoden definiert
 * Subclass(es): verschiedene Auspr�gungen
 * XXXUtilities: static code hinterlegt
 *
 */
public interface ConsolePrintable {

	 default void printToConsole() {
		print();
	}

	//java 9
	private void print() {
		System.out.println(this.toString());
	}
	 

}
