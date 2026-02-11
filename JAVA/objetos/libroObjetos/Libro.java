package libro;

import java.util.Scanner;

public class Libro {
	Scanner sc = new Scanner(System.in);
	
	private String titulo;
	private String autor;
	private int numPag;
	private int calificacion;
	private boolean hayCalificacion = false;
	
	public Libro(String t, String a, int np) {
		this.titulo = t;
		this.autor = a;
		this.numPag = np;
		if(hayCalificacion == true) {
			this.calificacion = dameCalificacion();
		}
	}
	public String dameTitulo() {
		return titulo;

	}
	public String dameAutor() {
		return autor;

	}
	public int dameNumPag() {
		return numPag;

	}
	public int dameCalificacion() {
		return calificacion;

	}
	public void darCalificacion() {
		System.out.println("califica del uno al 10 este libro: ");
		int puntuacion = sc.nextInt();
		if(puntuacion >=0 && puntuacion <=10) {
			calificacion = puntuacion;
		}
		else if (puntuacion < 0 && puntuacion > 10) {
			System.out.println("los numeros debe ser del 0 al 10");
			hayCalificacion = true;
		}
		else {
			System.out.println("sin valoraciion");
			hayCalificacion = false;
		}

	}
	public String toString() {
		return "(LIBRO): TITULO = " + titulo + " | AUTOR = " + autor + " | NUMERO DE PAGINAS = " + numPag + " | CALIFICACION = " + calificacion;
	}

}
