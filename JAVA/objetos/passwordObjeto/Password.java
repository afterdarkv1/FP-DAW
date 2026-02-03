package passwordObjeto;

import java.util.Random;

public class Password {
	static Random rand = new Random();
	int longitud;
	String password;

	public Password() {
		this.longitud = 8;
		this.password = generarPassword(this.longitud);
		
	}
	public Password(int longitud) {
	    this.longitud = longitud;
	    this.password = generarPassword(this.longitud);
	}

	
	public String generarPassword(int l) {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String contraseña = "";
		for (int i = 0; i < l; i++) {
			contraseña += caracteres.charAt(rand.nextInt(caracteres.length()));
		}
		return contraseña;
	}
	public boolean esFuerte() {
	int mayus = 0;
	int minus = 0;
	int num = 0;
	for (int i = 0; i < password.length(); i++) {
		if(Character.isUpperCase(password.charAt(i))){
			mayus++;
			
		}
		else if(Character.isLowerCase(password.charAt(i))){
			minus++;
			
		}
		else if(Character.isDigit(password.charAt(i))){
			num++;
			
		}
	}
	return mayus >2 && minus >1 && num >5;
	}
	public int dameLongitud() {
		return longitud;
	}
	public String damePassword() {
		return password;
	}
	public void setLongitud(int l) {
	this.longitud = l;
	this.password = generarPassword(this.longitud);
	}
}
