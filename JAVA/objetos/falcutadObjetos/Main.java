package facultadObjetos;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		Persona[] personas = new Persona[6];
		int opcion;
		System.out.println("introduce una opcion");
		System.out.println("1. dar de alta a un estudiante");
		System.out.println("2. dar de alta a un profesor");
		opcion = scanner.nextInt();
		scanner.nextLine();
		switch (opcion) {
		case 1: {
			
			Estudiantes.darAltaEstudiante();
			break;
		}
		case 2: {
			break;
			
		}
	
		
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}
		
	}
}
