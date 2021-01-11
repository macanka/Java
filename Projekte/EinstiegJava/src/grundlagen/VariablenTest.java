package grundlagen;

public class VariablenTest {

	public static void main(String[] args) {
		// Deklaration von Variablen
		// byte ist sehr kleine Ganzzahl von -128 bis 127
		byte alter;
		// Initialisierung (Wertzuweisung)
		alter = 42;
		// Ausgabe der Variablen
		System.out.println(alter);
		// Deklaration und Initialierung in einer Anweisung
		// short ist eine kleine Ganzzahl zwischen -32.768 und 32.767
		short gewicht = 130;
		System.out.println(gewicht);
		gewicht = 77;
		System.out.println(gewicht);
		// int ist der häufigste Ganzzahl-Datentyp. Er speichert Zahlen zwischen - 2,4 Milliarden und 2,4 Milliarden
		int postleitzahl = 47058;
		System.out.println(postleitzahl);
		// long ist der größte ganzzahlige Datentyp
		// das Literal (fester Wert) 8123456789 ist zu groß für einen int; Lösung: Umwandlung in einen long => L anhängen
		long bevoelkerungDerErde = 8123456789L;
		System.out.println(bevoelkerungDerErde);
		
		// (Fließ-) Kommazahlen
		// float 4 Byte, Genauigkeit von 7 Nachkommastellen (einfach)
		// Komma-Literale werden in Java als double gespeichert
		float piAsFloat = 3.14f;
		// double 8 Byte, Genauigkeit von 15 Nachkommastellen (doppelt)
		// In der Praxis verwendet man mittlerweile nur double
		double piAsDouble = 3.14;
		double verbrauch100 = 6.4;
		System.out.println(verbrauch100);
		
		// Wahrheitswerte
		boolean istPremiumKunde = false;
		System.out.println(istPremiumKunde);
		istPremiumKunde = true;
		System.out.println(istPremiumKunde);
		
		// Variablen mit einem Zeichen (0 bis 65.535, 2 Byte groß)
		// char-Literale mit EINEM Anführungszeichen
		char antwort = 'j';
		char exit = 'X';
		System.out.println(exit);
		
		// Konstante mit final
		final int MWST = 16;
		// MWST = 17; Neue Wertzuweisung nicht erlaubt
	}

}
