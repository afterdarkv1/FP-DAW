package notasObjetos;

public class Main {

	public static void main(String[] args) {
		Notas n = new Notas();
		
	System.out.println(n.darAlta(new Alumno("Alex", 8)));
	System.out.println(n.darAlta(new Alumno("Debra", 4)));	
	System.out.println(n.darAlta(new Alumno("Celeste", 2)));	
	System.out.println(n.darAlta(new Alumno("kevin", 7)));
	System.out.println(n.darAlta(new Alumno("luis", 2)));	
	System.out.println(n.darAlta(new Alumno("sara", 11)));	
	System.out.println(n.buscarAlumno("Alex"));
	System.out.println(n.mediaNotas());
	System.out.println(n.mediaMenorA5());
	System.out.println(n.mejorAlumno());
	System.out.println(n.peorAlumno());

	}

}
