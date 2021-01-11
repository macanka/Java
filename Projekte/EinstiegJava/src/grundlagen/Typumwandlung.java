package grundlagen;

public class Typumwandlung {

	public static void main(String[] args) {
		int zahl1 = 42;
		int zahl2 = zahl1;
		System.out.println(zahl2);
		// short zahl3 = zahl1; // Compiler-Fehler: int passt nicht in short-Variable
		short zahl3 = (short) zahl1; // Lösung: Typumwandlung in short (cast)
		System.out.println(zahl3);
		long zahl4 = zahl1;  // funktioniert, weil long größer als ein int
		float pi = 3.14f;
//		zahl4 = pi; // Compiler-Fehler: float passt nicht in long
		pi = zahl4;
		System.out.println(pi);
		// Reihenfolge von groß nach klein: double - float - long - int - short - byte
		//                                                              - char
		char buchstabe = 'X';
		zahl1 = buchstabe; // Zuweisung eines char zu int möglich
		System.out.println(zahl1);
		int zahl = 100;
		buchstabe = (char) zahl;
		System.out.println(buchstabe);
	}

}
