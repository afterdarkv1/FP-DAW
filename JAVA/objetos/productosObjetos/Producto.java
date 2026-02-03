package objetos.productosObjetos;
import java.util.Scanner;

public class Producto {
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String n, double p, int s) {
		this.nombre = n;
		this.precio = p;
		this.stock = s;

	}
	public Producto(String n) {
		this.nombre = n;
		this.precio = 0;
		this.stock = 0;

	}
	public String dameNombre() {
		return nombre;

	}
	public void modificarNombre(String c) {
		this.nombre = c;

	}
	public void modificarStock(int s) {
		this.stock = s;

	}
	public double damePrecio() {
		return precio;

	}
	public int dameStock() {
		return stock;

	}

	public String toString() {
		return "(PRODUCTO): NOMBRE = " + nombre + " | PRECIO = " + precio + " | STOCK = " + stock;
	}

}
