package UNIDAD2;

import java.util.Scanner;

/* Bloque 2
1. Pedir al usuario su nombre y saludarlo.*/
public class bloque2eje1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cual es tu nombre: ");
		String nombre = scanner.nextLine();
			System.out.println("Hola "+ nombre);

	}

}
