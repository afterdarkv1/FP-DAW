package tiempo;

public class PruebaTiempo {

	public static void main(String[] args) {
	Tiempo t = new Tiempo(3,28,36);
	System.out.println(t.toString());
	t.modificarHora(5);
	System.out.println(t.toString());
	
	Tiempo t2 = new Tiempo(3,28);
	t2.modificarMinuto(5);
	System.out.println(t2.toString());
	
	Tiempo t3 = new Tiempo(-3);
	t3.modificarSegundo(8);
	System.out.println(t3.toString());
	
	}

}
