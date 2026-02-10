package fraccionArrayObjetos;

public class Main {

	public static void main(String[] args) {

	    Fraccion f = new Fraccion(0, 1); 
	    f.rellenarFraccion();
	    f.mostrarFracciones();
	    System.out.println();
	    System.out.println("suma = " + f.sumarArray(f.dameArrayFraccion())); 
	    System.out.println("resta = " + f.restarArray(f.dameArrayFraccion())); 
	    System.out.println("multiplicacion = " + f.multiplicarArray(f.dameArrayFraccion())); 
	    System.out.println("division = " + f.dividirArray(f.dameArrayFraccion())); 
	   
	}

}
