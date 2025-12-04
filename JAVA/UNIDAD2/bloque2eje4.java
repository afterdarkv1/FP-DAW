package UNIDAD2;

import java.util.Scanner;

public class bloque2eje4 {
	/* Como el anterior, pero sin importar si es mayúscula o minúscula. */

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("introduce una cadena: ");
			String cadena = scanner.nextLine();
			cadena = cadena.toUpperCase();
			if ((cadena.indexOf("H")) == -1) {
				System.out.println("no tiene H");
			}
			else if ((cadena.indexOf("H")) == 0) { 
				System.out.println("tiene un a H al comiendo");
			}
				
		


	}

}
