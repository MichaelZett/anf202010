package de.feu.fizzbuzz;

public class FizzBuzzGame {
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			decideForNumber(i);
		}
	}

	private static void decideForNumber(int number) {
		if (isDivisibleByNumber(number, 3) && isDivisibleByNumber(number, 5)) {
			System.out.print(FIZZ + BUZZ);
		} else if (isDivisibleByNumber(number, 3)) {
			System.out.print(FIZZ);
		} else if (isDivisibleByNumber(number, 5)) {
			System.out.print(BUZZ);
		} else {
			System.out.print(number);
		}
		
		if (number < 100) {
			System.out.print(",");
		}
	}

	private static boolean isDivisibleByNumber(int number, int divisor) {
		return number % divisor == 0;
	}

}
