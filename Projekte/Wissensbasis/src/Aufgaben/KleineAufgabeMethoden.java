package Aufgaben;

public class KleineAufgabeMethoden {

	public static void main(String[] args) {
		
		int x = getMax(22,-7);
		System.out.println ("1. x = " + x);
		
		x = getMax(-100,-7);
		System.out.println ("2. x = " + x);
		
		x = getMax(-7,-7);
		System.out.println ("3. x = " + x);
		
		x = getMax(2, 7, 1);
		System.out.println ("4. x = " + x);
		
		x = getMax(200, 7, 1);
		System.out.println ("5. x = " + x);
		
		x = getMax(2, 7, 1000);
		System.out.println ("6. x = " + x);
		
	}
	static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	
	static int getMax(int a, int b, int c) {
		int tmp = getMax(a, b);
		return getMax (tmp, c);
		
	}
}
