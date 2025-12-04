package UNIDAD2;

import java.util.Scanner;

/* Pedir al usuario una cadena y decir si empieza por el carácter ‘H’ */
public class bloque2eje3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce una cadena: ");
		String cadena = scanner.nextLine();
		if ((cadena.indexOf("H")) == -1) {
			System.out.println("no tiene H");
		}
		else if ((cadena.indexOf("H")) == 0) { 
			System.out.println("tiene un a H al comiendo");
		}
			
	
}
}
	/*	Scanner scanner = new Scanner(System.in);
	System.out.println("introduce una cadena: ");
	String cadena = scanner.nextLine();
		for(int i = 0; i < cadena.length(); i++ ) {
			char c = cadena.charAt(i);
			char h = 'h'; 
			if (c == h ) {
				System.out.println("tiene una h");
				return;
			}
		}
		System.out.println("no tiene h");

*/