package grundlagen;

public class OperatorenTest {

	public static void main(String[] args) {
		int zahl1 = 42;
		int zahl2 = 8;
		int summe = zahl1 + zahl2; // Addition
		int differenz = zahl1 - zahl2;
		int produkt = zahl1 * zahl2;
		int quotient = zahl1 / zahl2;
		int restwert = zahl1 % zahl2;
		System.out.println("Summe = " + summe); // Verkettung (Konkatenation)
		System.out.println("Diffenrenz =  " + differenz);
		System.out.println("Produkt = " + produkt);
		System.out.println("Quotient = " + quotient);
		System.out.println("Restwert = " + restwert);
		// Der Plus-Operator kann in Java entweder zur Addition oder zur Verkettung benutzt werden. Entscheidend sind die Operanden.
		System.out.println("Summe = " + zahl1 + zahl2);
		System.out.println("Summe = " + (zahl1 + zahl2));
		double quotientDouble =  zahl1 / (double) zahl2;
		// Der Ergebnistyp einer mathematischen Operation in Java ist mindestens ein int bzw. der größte beteiligte Datentyp
		quotientDouble =  1.0 * zahl1 / zahl2;
		System.out.println("QuotientDouble = " + quotientDouble);
		byte b1 = 120;
		byte b2 = 8;
		byte summeByte = (byte) (b1 + b2);
		System.out.println("b1 + b2 = " + (b1 + b2));
		System.out.println("b1 + b2 = " + summeByte);
		int zahl3 = 42;
		zahl3 = zahl3 + 1;
		zahl3++; // Inkrement-Operator 
		++zahl3;
		System.out.println("zahl3 = " + zahl3);
		int zahl4 = 42;
		// Post-inkrement: Erst Operation, dann inkrement
//		System.out.println("zahl4++ = "+ zahl4++);
		// Pre-inkrement: Erst inkrement, dann Operation
		System.out.println("++zahl4 = " + ++zahl4);
		System.out.println("zahl4 = " + zahl4);
		zahl4 = zahl4 +4;
		zahl4 += 4;
		// Potenz-Operator: a hoch b
		int a = 2;
		int b = 64;
		long potenz = (long) Math.pow(a, b);
		System.out.println("Potenz = " + potenz);
		double potenzDouble = Math.pow(a, b);
		System.out.println("PotenzDouble = " + potenzDouble);
	}

}
