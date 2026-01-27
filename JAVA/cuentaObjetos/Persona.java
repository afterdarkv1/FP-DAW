package cuentaObjetos;

public class Persona {
	String dni;
	Cuenta[] cuentas;
	

	public Persona( String dni) {
		this.dni = dni;
		cuentas = new Cuenta[3];
		
		
		
	}
	public boolean addCuenta(Cuenta c) {
	    for (int i = 0; i < cuentas.length; i++) {
	        if (cuentas[i] == null) { 
	            cuentas[i] = c;         
	            return true;          
	        }
	    }
	    return false; 

		
		
		
		
		
	}
	public boolean esMorosa() {
	    for (int i = 0; i < cuentas.length; i++) {
	        if (cuentas[i] != null && cuentas[i].consultarSaldo() < 0) {
	            return true; 
	        }
	    }
	    return false; 
	}

}
