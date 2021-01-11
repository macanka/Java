package aufgaben;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		// Schreiben Sie ein Programm, das eine Jahreszahl durch den Benutzer einliest und ausgibt, ob es ein Schaltjahr ist oder nicht.
		// Einfache Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist
		// Schwierige Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist. Ausnahme: eine Jahrhundertwende ist nur dann ein Schaltjahr,
		// wenn sie auch durch 400 teilbar ist
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Jahreszahl ein");
		int jahr = sc.nextInt();
		
		// Einfache Variante
		if (jahr % 4 == 0) {
			System.out.println(jahr + " ist ein Schaltjahr");
		} else {
			System.out.println(jahr + " ist ein Gemeinjahr");
		}
		
		// Schwierige Variante
		if (jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				if (jahr % 400 == 0) {
					System.out.println(jahr + " ist ein Schaltjahr");
				} else {
					System.out.println(jahr + " ist kein Schaltjahr");
				}
			} else {
				System.out.println(jahr + " ist ein Schaltjahr");
			}
		} else {
			System.out.println(jahr + " ist ein Gemeinjahr");
		}
		
		if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
			System.out.println(jahr + " ist ein Schaltjahr");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr");
		}
		
	}

}
