package pruebaFraccion;

public class Main {

	public static void main(String[] args) {
	Fraccion fraccion = new Fraccion(2,4);
	Fraccion fraccion2 = new Fraccion(1,4);
	System.out.println(fraccion.suma(fraccion2));
	System.out.println(fraccion.resta(fraccion2));
	System.out.println(fraccion.multiplicacion(fraccion2));
	System.out.println(fraccion.division(fraccion2));

	}

}
