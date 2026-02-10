package fraccionArrayObjetos;

import java.util.Scanner;

public class Fraccion {
	static Scanner scanner = new Scanner(System.in);
	int numerador;
	int denominador;
	Fraccion[] fraccion;
	int tam = 3;
	
	public Fraccion(int n, int d) {
		this.numerador = n;
		this.denominador = d;
		this.fraccion = new Fraccion[tam];
		
	}

	public void rellenarFraccion() {
		
		for (int i = 0; i < tam; i++) {
			System.out.println("dame numerado y denominador");
			fraccion[i] = new Fraccion(scanner.nextInt(), scanner.nextInt());
			
		}
	

		
	}
	public Fraccion multiplicarArray( Fraccion[] f2) {
		Fraccion resultado = new Fraccion( f2[0].numerador, f2[0].denominador);
		for (int i = 1; i < tam; i++) {
			resultado = new Fraccion ((resultado.numerador*f2[i].numerador),
					(resultado.denominador*f2[i].denominador));
			
		}
	return resultado;
	

		
	}
	public Fraccion sumarArray( Fraccion[] f2) {
		Fraccion resultado = new Fraccion( f2[0].numerador, f2[0].denominador);
		for (int i = 1; i < tam; i++) {
			resultado = new Fraccion ((resultado.numerador*f2[i].denominador)+((resultado.denominador*f2[i].numerador)) ,
					(resultado.denominador*f2[i].denominador));
			
		}
	return resultado;
	}
	public Fraccion restarArray( Fraccion[] f2) {
		Fraccion resultado = new Fraccion( f2[0].numerador, f2[0].denominador);
		for (int i = 1; i < tam; i++) {
			resultado = new Fraccion ((resultado.numerador*f2[i].denominador)-((resultado.denominador*f2[i].numerador)) ,
					(resultado.denominador*f2[i].denominador));
			
		}
	return resultado;
	}
	public Fraccion dividirArray( Fraccion[] f2) {
		Fraccion resultado = new Fraccion( f2[0].numerador, f2[0].denominador);
		for (int i = 1; i < tam; i++) {
			resultado = new Fraccion ((resultado.numerador*f2[i].denominador),
					(resultado.denominador*f2[i].numerador));
			
		}
	return resultado;
	

		
	}
	public void mostrarFracciones() {
	    for (int i = 0; i < tam; i++) {
	            System.out.print("|" + fraccion[i]);
	        if(i== tam-1) {
	        	System.out.print("|");
	        }
	    }
	}

	public Fraccion[] dameArrayFraccion() {
		return fraccion;
		
	}
	public String toString() {
	    return numerador + "/" + denominador;
	}
	
}