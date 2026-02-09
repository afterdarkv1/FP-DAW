package pruebaFraccion;

public class Fraccion {
	int numerador;
	int denominador;
	
	public Fraccion(int n, int d) {
		this.numerador = n;
		this.denominador = d;
				
	}
	public int dameNumerador() {
		return numerador;
	}
	public int  dameDenominador() {
		return denominador;
	}
	public void modificaNumerador( int n) {
		this.numerador = n;
	}
	public void modificaDenominador( int d) {
		this.denominador = d;
	}
	public Fraccion suma(Fraccion f2) {
		Fraccion f = new Fraccion(
		(numerador * f2.denominador) + (denominador * f2.numerador),
		(denominador * f2.denominador));
		return f;
		
	}
	public Fraccion resta(Fraccion f2) {
		Fraccion f = new Fraccion(
		(numerador * f2.denominador) - (denominador * f2.numerador),
		(denominador * f2.denominador));
		return f;
		
	}
	public Fraccion multiplicacion(Fraccion f2) {
		Fraccion f = new Fraccion(
		(numerador * f2.numerador),
		(denominador * f2.denominador));
		return f;
		
	}
	public Fraccion division(Fraccion f2) {
		Fraccion f = new Fraccion(
		(numerador * f2.denominador),
		(denominador * f2.numerador));
		return f;
		
	}
	
	public String toString() {
		return "la fraccion es = " + numerador+ "/" + denominador;
	}
	
	
}
