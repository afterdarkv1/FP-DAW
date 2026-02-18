package facultadObjetos;

import libro.Libro;

public class Estudiantes extends Persona {
	private String curso;
	public Estudiantes(String nombre, String apellido,String dni,  String estadoCivil, String curso) {
		super(nombre, apellido,dni, estadoCivil);
		this.curso = "daw1";
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return super.toString() + "Estudiantes [curso=" + curso + "]";
	}

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
