package aufgaben;

import java.util.Scanner;

public class SchaltjahrAnka {

	public static void main(String[] args) {
		// Schreiben Sie ein Programm, das eine Jahreszahl durch den Benutzer einliest und ausgibt, ob es ein Schaltjahr ist oder nicht.
		// Einfache Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist
		// Schwierige Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist. Ausnahme: eine Jahrhundertwende ist nur dann ein Schaltjahr,
		// wenn sie auch durch 400 teilbar ist
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine beliebige Jahreszahl ein: ");
		int jahr = sc.nextInt();
		
		if (jahr%4 == 0 & jahr%400 == 0 ) {
			System.out.println("Sie haben das Jahr " + jahr + " eingegeben und dieses ist ein Schaltjahr ");
		} else if (jahr< 400 & jahr%4 == 0) { 	
			System.out.println("Sie haben das Jahr " + jahr + " eingegeben und dieses ist ein Schaltjahr.");
		} else if (jahr%100 !=0 & jahr%4 == 0) { 	
			System.out.println("Sie haben das Jahr " + jahr + " eingegeben und dieses ist ein Schaltjahr.");
		} else { 
			System.out.println("Sie haben das Jahr " + jahr + " eingegeben und dieses ist KEIN Schaltjahr.");
		}
		System.out.println("Servus");			
		sc.close();
	}

}
	
