package raicesObjetos;

public class Main {

	public static void main(String[] args) {
		Raices r = new Raices(0, -9, 14);
		Raices.calcular(r);
		System.out.println(Raices.getDiscriminante(r));
	}

}
