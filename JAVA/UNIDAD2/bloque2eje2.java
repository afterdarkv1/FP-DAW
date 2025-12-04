package UNIDAD2;

import java.util.Scanner;

/* Programa que diga si una cadena dada por el usuario está o no vacía. */
public class bloque2eje2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce una cadena: ");
			String cadena = scanner.nextLine();
			
			if (cadena == "") {
				System.out.println("esta vacio");
			}
			else System.out.println("esta llena");
	}

}
