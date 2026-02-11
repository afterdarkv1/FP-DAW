package libro;

public class PruebaLibro {

	public static void main(String[] args) {
		ConjuntoLibro libros = new ConjuntoLibro();
		Libro libro = new Libro("almas suvitas", "Marco", 186 );
		
		Libro libro2 = new Libro("passenger", "Ana", 220 );
		libros.darAltaLibro(libro);
		libros.darAltaLibro(libro2);
		
		libros.eliminarLibroPorTitulo("passenger");
		libros.eliminarLibroPorAutor("Marco");
		
		Libro libro3 = new Libro("1917", "Luis", 200 );
		Libro libro4 = new Libro("brother", "diego", 150 );
		libros.darAltaLibro(libro3);
		libros.darAltaLibro(libro4);
		System.out.println("LIBROS:");
		System.out.println(libros.toString());
		libro3.darCalificacion();
		libro4.darCalificacion();
		System.out.println("tooString");
		System.out.println(libros.toString());
		System.out.println("MEJOR LIBRO");
		libros.mejorLibro();



	}

}
