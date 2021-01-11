package aufgaben;

import java.util.Scanner;

public class Zinsrechner {

	public static void main(String[] args) {
		// Programmieren Sie einen Zinsrechner der zu einem Startkapital, einem Zinssatz und einer Laufzeit das Endkapital berechnet.
		// Beidpieldaten: Startkapital: 1000 Euro, Zinssatz: 5%, Laufzeit: 5 Jahre => Endkapital: 1276,28
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihr Startkapital ein.");
				int start = sc.nextInt();
			
			System.out.println("Bitte geben Sie Ihren Zinssatz ein.");		
				double zins = sc.nextDouble();
			
			System.out.println("Bitte geben Sie Ihre Laufzeit ein.");	
				int zeit = sc.nextInt();
				
				double kap;
				
				kap = start * Math.pow(1 + zins / 100, zeit);
				
				// System.out.println("Endkapital "+ kap);
				System.out.printf("Ihr Endkapital beträgt %,.2f Euro%n ", kap);
				sc.close();
	}

}
