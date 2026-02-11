package libro;


public class ConjuntoLibro {
	private Libro[] libros;
	private int tam = 10;
	
	public ConjuntoLibro(){
		this.libros = new Libro[tam];
				
	}
	public boolean darAltaLibro(Libro b) {
		
		for (int j = 0; j < libros.length; j++) {
			if(libros[j] != null && libros[j].dameTitulo().equalsIgnoreCase(b.dameTitulo()) ) {
				System.out.println("hay nombres iguales");
				return false;
			}
		}
		
		for (int i = 0; i < libros.length; i++) {
			if(libros[i] == null) {
				libros[i] = b;
				return true;
			}
		}
		System.out.println("limite de productos");
		return false;
	}
	public Libro eliminarLibroPorTitulo(String n) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i] != null && libros[i].dameTitulo().equalsIgnoreCase(n) ) {
				libros[i] = null;
	
			}
		}
		return null;

	}
	public Libro eliminarLibroPorAutor(String n) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i] != null && libros[i].dameAutor().equalsIgnoreCase(n) ) {
				libros[i] = null;
	
			}
		}
		return null;

	}
	public void mejorLibro() {
		double mayor = 0;
		Libro mejorLibro = null;

		for (int i = 0; i < libros.length; i++) {
			if(libros[i] != null && libros[i].dameCalificacion() > mayor) {
				mayor = libros[i].dameCalificacion();
				mejorLibro = libros[i];
				System.out.println(mejorLibro);

			}
			
		}

	}
	public void peorLibro() {
		double menor = 10;
		Libro peorLibro = null;

		for (int i = 0; i < libros.length; i++) {
			if(libros[i] != null && libros[i].dameCalificacion() < menor) {
				menor = libros[i].dameCalificacion();
				peorLibro = libros[i];
				System.out.println(peorLibro);
			}
			
		}

	}
	public String toString() {
		String mensaje = "";
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				
				mensaje += libros[i] + "\n";

			}
		}
		return mensaje;
	}
	
	
}
