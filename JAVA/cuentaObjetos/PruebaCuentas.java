package cuentaObjetos;

public class PruebaCuentas {

	public static void main(String[] args) {
	Cuenta cuenta = new Cuenta("ES1231290812392");
	Cuenta cuenta2 = new Cuenta("ES1231290812393");
	Persona persona = new Persona("z92-1-021");
	persona.addCuenta(cuenta);
	persona.addCuenta(cuenta2);
	cuenta2.recibirAbonos(700);
	cuenta.recibirAbonos(1100);
	cuenta2.pagarRecibo(750);
	if(persona.esMorosa()) {
		System.out.println("es morosa");
	}
	else {
		System.out.println("no es morosa");
	}
	System.out.println(cuenta.toString());
	System.out.println(cuenta2.toString());

	
	
	
	}

}
