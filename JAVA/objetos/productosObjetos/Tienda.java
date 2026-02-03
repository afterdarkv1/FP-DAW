package objetos.productosObjetos;

public class Tienda {
	private Producto[] productos;;

	public Tienda() {
		productos = new Producto[10];
	}

	public boolean darAlta(Producto p) {
		
		for (int j = 0; j < productos.length; j++) {
			if(productos[j] != null && productos[j].dameNombre().equalsIgnoreCase(p.dameNombre()) ) {
				System.out.println("hay nombres iguales");
				return false;
			}
		}
		
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] == null) {
				productos[i] = p;
				return true;
			}
		}
		System.out.println("limite de productos");
		return false;
	}
	public Producto buscarProducto(String n) {
		for (int i = 0; i < productos.length; i++) {
			if(productos[i].dameNombre().equals(n) ) {
				return productos[i];
			}
		}
		return null;

	}
	public Producto modificarProducto(String n, int s) {
		for (int i = 0; i < productos.length; i++) {
			if(productos[i].dameNombre().equals(n) ) {
				productos[i].modificarNombre(n);
				productos[i].modificarStock(s);
			}
		}
		return null;

	}
	public String toString() {
		String mensaje = "";
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				
				mensaje += productos[i] + "\n";

			}
		}
		return mensaje;
	}
}
