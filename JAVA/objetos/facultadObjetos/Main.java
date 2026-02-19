package facultadObjetos;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Persona[] personas = new Persona[6];
		int contador = 0;
		int contEstudiantes = 0;
		int contProfesor = 0;
		int contPerServicio = 0;
		int opcion;
		do {
			System.out.println("introduce una opcion");
			System.out.println("1. dar de alta a un estudiante");
			System.out.println("2. dar de alta a un profesor");
			System.out.println("3. dar de alta a un personal de servicio");
			System.out.println("4. estadisticas");
			System.out.println("5. salir");
			opcion = scanner.nextInt();
			scanner.nextLine();
			if (opcion == 1) {
				
				personas[contador] = EstudiantesService.darAltaEstudiante();
				contador++;
				
			} else if (opcion == 2) {
				
				personas[contador] = ProfesorService.crearProfesor();
				contador++;
				
			} else if (opcion == 3) {
				
				personas[contador] = PersonalServicioService.crearPersonaServicio();
				contador++;

			} else if (opcion == 4) {
				System.out.println();
				for (int i = 0; i < personas.length; i++) {
					

					if (personas[i] instanceof Estudiantes) {
						contEstudiantes++;
					} else if (personas[i] instanceof Profesor) {
						contProfesor++;
					} else if (personas[i] instanceof PersonalServicio) {
						contPerServicio++;
					}
					if(personas[i] != null) {
					System.out.println(personas[i]);
					}
				}
				System.out.println("nr estudiantes = " + contEstudiantes + "\n" + "nr profesores = " + contProfesor
						+ "\n" + "nr persnal de servicio = " + contPerServicio);
				System.out.println();

			} else if (opcion == 5) {
				break;

			}

		} while (opcion != 5);

	}

}
