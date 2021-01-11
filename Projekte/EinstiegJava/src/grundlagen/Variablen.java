package grundlagen;

public class Variablen {

	public static void main(String[] args) {
		// Deklaration von Variablen
		// byte ist sehr kleine Ganzzahl von -128 bis 127
		byte alter;
		// Initialisierung (Wertzuweisung)
		alter = 42;
		// Ausgabe der Variablen
		System.out.println(alter);
		// Deklaration und Initialisierung in einer Anweisung
		// Short ist eine kleine Ganzzahl zwischen -32.768 und 32.767
		short gewicht = 130;
		System.out.println(gewicht);
		gewicht = 77;
		System.out.println(gewicht);	
		
		// Zeilen markieren und Strg Alt und Pfeil nach unten dr�cken um zu kopieren
		
		gewicht = 55;
		System.out.println(gewicht);	
		// int ist der h�ufigste Ganzzahl-Datentyp. Er speichert Zahlen zwischen -2,14 Millarden und 2,14 Millarden
		int postleitzahl = 70771;
		System.out.println(postleitzahl);
		// long ist der gr��te ganzzahlige Datentyp
		// das Literal (fester Wert) 8123456789 ist zu gro� f�r einen int; L�sung: Umwandlung in einen long => L anh�ngen
		long bevoelkerungDerErde = 8123456789L;
		System.out.println(bevoelkerungDerErde);
		
		// Variablennamen anfangen und �ber Strg Leerzeichen erg�nzen lassen 
		
		// (Flie�-) Kommazahlen
		// float 4 Byte; Genauigkeit von 7 Nachkommastellen (einfach)
		// Komma-Literale werden in Java als double gespeichert
		float piAsFloat = 3.14f;
		System.out.println(piAsFloat);
		// double 8 Byte, Genauigkeit von 15 Nachkommastellen (doppelt)
		// In der Praxis verwendet man mittlerweile nur double
		double piAsDouble = 3.14;
		System.out.println(piAsDouble);
		
		//Wahrheitswerte
		boolean istPremiumKunde = false;
		System.out.println(istPremiumKunde);
		istPremiumKunde = true;
		System.out.println(istPremiumKunde);
		
		// Variable mit einem Zeichen (0 bis 65.535, 2 Byte gro�)
		// char-Literale mit EINEM Anf�hrungszeichen		
		char buchstabe = 'A';
		System.out.println(buchstabe);
	
	}
	
	

}
