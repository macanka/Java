package aufgaben;

import java.util.Scanner;

public class Benzinrechner {

	public static void main(String[] args) {
		     // Programmieren Sie einen Benzinrechner, der zu dem Gesamtverbrauch in Liter und den gefahrenen Kilometern den Verbrauch auf 100 Kilometer 
			 // berechnet. Beispieldaten: 60 Liter, 400 Kilometer = 15 Liter / 100 Kilometer
		
		Scanner sc = new Scanner(System.in);       	
		
			 // Deklaration der Variablen und Zuweisung der Werte

		       //   double verbrauch = 30;
				System.out.println("Bitte geben Sie den Gesamtverbrauch ein.");
				int verbrauch = sc.nextInt();
		        //  double kilometer = 400;
				System.out.println("Bitte geben Sie die gefahrenen Kilometer ein.");
				int kilometer = sc.nextInt();
				
		          double durchschnitt;

		     // Berechnung des Verbrauchs auf 100 Kilometer
		          
		          durchschnitt =  verbrauch * 100 * 1.0 / kilometer;
		          
		     // Ausgabe des Verbrauchs auf 100 Kilometer 
		 
		          System.out.println("Verbrauch auf 100 Kilometer = " + durchschnitt + " Liter");
		      
		      sc.close();


	}

}
