package notasObjetos;

import java.util.Scanner;

public class Alumno {
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private double nota;
	private int stock;
	
	public Alumno(String n, double nt) {
		this.nombre = n;
		this.nota = nt;


	}

	public String dameNombre() {
		return nombre;

	}
	public double dameNota() {
		return nota;

	}

	public String toString() {
		return "(ALUMNO): NOMBRE = " + nombre + " | NOTA = " + nota;
	}

}


