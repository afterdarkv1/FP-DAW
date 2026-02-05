package tresEnRayaObjetos;

import java.util.Scanner;

public class Jugadores {
	String jugador1;
	String jugador2;
	
	static Scanner scanner = new Scanner(System.in);
	
	public  Jugadores() {
		String jugador1 = "jugador1";
		String jugador2 = "jugador2";

	}
	public void mueveJugador1(int pos) {
		do {

		if(pos <1 && pos > 9) {
		}
		} while(pos <1 && pos > 9);
	}

}
