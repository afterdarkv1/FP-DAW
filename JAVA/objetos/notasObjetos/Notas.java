package notasObjetos;

public class Notas {
	private Alumno[] alumnos;

	public Notas() {
		alumnos = new Alumno[20];
	}

	public boolean darAlta(Alumno a) {
		
		for (int j = 0; j < alumnos.length; j++) {
			if(alumnos[j] != null && alumnos[j].dameNombre().equalsIgnoreCase(a.dameNombre()) ) {
				System.out.println("hay nombres iguales");
				return false;
			}
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] == null) {
				if(a.dameNota() >= 0 && a.dameNota() <=10) {
				alumnos[i] = a;
				return true;
				}
				else {
					System.out.println("rango de notas invalidas (0-10)");
					return false;
				}
			}
		}
		System.out.println("limite de productos");
		return false;
	}
	public Alumno buscarAlumno(String n) {
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].dameNombre().equals(n) ) {
				return alumnos[i];
			}
		}
		return null;

	}
	public double mediaNotas() {
		double suma = 0;
		double cont = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null) {
				suma += alumnos[i].dameNota();
				cont++;
			}
		}
		return suma/cont;

	}
	public double mediaMenorA5() {
		double suma = 0;
		double cont = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].dameNota() < 5) {
				suma += alumnos[i].dameNota();
				cont++;
			}
		}
		return suma/cont;

	}
	public Alumno mejorAlumno() {
		double mayor = 0;
		Alumno mejorAlumno = null;

		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].dameNota() > mayor) {
				mayor = alumnos[i].dameNota();
				mejorAlumno = alumnos[i];

			}
			
		}
		return mejorAlumno;

	}
	public Alumno peorAlumno() {
		double menor = 10;
		Alumno peorAlumno = null;

		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].dameNota() < menor) {
				menor = alumnos[i].dameNota();
				peorAlumno = alumnos[i];

			}
			
		}
		return peorAlumno;

	}
}
