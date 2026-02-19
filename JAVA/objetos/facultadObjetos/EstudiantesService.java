package facultadObjetos;

public class EstudiantesService {
	public static Estudiantes darAltaEstudiante() {

		System.out.println("Nombre del estudiante:");
		String nombre = Main.scanner.nextLine();

		System.out.println("Apellido:");
		String apellido = Main.scanner.nextLine();

		System.out.println("DNI:");
		String dni = Main.scanner.nextLine();

		System.out.println("Estado civil:");
		String estadoCivil = Main.scanner.nextLine();

		System.out.println("Curso:");
		String curso = Main.scanner.nextLine();

		return new Estudiantes(nombre, apellido, dni, estadoCivil, curso);
	}
}
