package UNIDAD2;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		Scanner scanner;
		int num = 0;
		scanner = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		boolean esEntero = scanner.hasNextInt();

		System.out.println("El numero leido es: " + num);
		if (esEntero) {
			System.out.println("Es entero");
			num=scanner.nextInt();
		}
		else {
			System.out.println("no es entero");
		scanner.nextLine();
		}
		
		System.out.println(); 
		}

}
