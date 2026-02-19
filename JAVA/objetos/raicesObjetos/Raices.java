package raicesObjetos;

import java.util.Scanner;

public class Raices {
	public static Scanner scanner = new Scanner(System.in);
	int a, b, c;
	double discriminante;

	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.discriminante = (b * b) - (4 * a * c);
	}

	public static void obtenerRaices(Raices r) {
		System.out.println("solucion 1");
		System.out.println((-r.b + Math.sqrt(r.discriminante)) / (2 * r.a));

		System.out.println("solucion 2");
		System.out.println((-r.b - Math.sqrt(r.discriminante)) / (2 * r.a));

	}

	public static void obtenerRaiz(Raices r) {
		System.out.println("una sola solucion");
		System.out.println((-r.b) / (2 * r.a));

	}

	public static double getDiscriminante(Raices r) {
		return r.discriminante;

	}

	public static boolean tienRaices(Raices r) {

		if (Raices.getDiscriminante(r) > 0) {
			return true;
		}
		return false;
	}

	public static boolean tieneRaiz(Raices r) {

		if (Raices.getDiscriminante(r) == 0) {
			return true;
		}
		return false;
	}

	public static void calcular(Raices r) {
		if (Raices.tienRaices(r)) {
			System.out.println("tiene dos soluciones");
			Raices.obtenerRaices(r);
		} else if (Raices.tieneRaiz(r)) {
			System.out.println("tiene una solucion");
			Raices.obtenerRaiz(r);
		}

		else {
			System.out.println("no tiene solucion");
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
