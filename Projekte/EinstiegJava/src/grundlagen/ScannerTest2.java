package grundlagen;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// Scanner zur Eingabe durch einen Benutzer
		Scanner sc = new Scanner(System.in);  
		System.out.println("Bitte geben Sie eine Ganzzahl ein.");
		int zahl = sc.nextInt();
		System.out.println("Sie haben die Zahl " + zahl + " eingegeben." );
		System.out.println("Bitte geben Sie eine Kommazahl ein.");
		double kommazahl = sc.nextDouble();
		System.out.println("Sie haben die Kommazahl " + kommazahl + " eingegeben." );
		System.out.println("Bitte geben Sie Ihren Namen ein.");
		String vorname = sc.next();
		System.out.println("Hallo " + vorname);
		System.out.println("Servus");
	}

}

		