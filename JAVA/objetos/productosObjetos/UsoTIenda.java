package objetos.productosObjetos;


public class UsoTIenda {

	public static void main(String[] args) {
		Tienda t = new Tienda();
		System.out.println(t.darAlta(new Producto("pc")));
		System.out.println(t.darAlta(new Producto("pc")));
		System.out.println(t);

	}

}
