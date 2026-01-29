package wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle2 {
	static String palabraSecreta = "";
	static int numIntentosConsumidos = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		
		int victoriaMaquina = 0;
		int victoriaJugador = 0;
		boolean seguirJugando = true;
		String palabra;
		palabraSecreta = generarPalabra();
		
		System.out.println(
				"Bienvenid@ al juego de Wordle. El objetivo es descubrir la palabra oculta de 5 letras. (maximo 6 intentos)");

		do {
			
			System.out.println("introduce una palabra de 5 letras (intento: " + (numIntentosConsumidos+1) + ")");
			palabra = scanner.nextLine().toLowerCase();
			if (!son5Letras(palabra)
			        || !soloLetras(palabra)
			        || !entre2_3Vocales(palabra)
			        || mas3ConsonatesSeguidas(palabra)
			        || !noTerminanQWX(palabra)
			        || vocalesSeguidasIguales(palabra)) {

			    System.out.println("Palabra no válida");
			    continue;
			}

			numIntentosConsumidos++;
			System.out.println(compruebaLetrasAcertadas(palabra));
			if (haGanadoJugador(palabra)) {
				System.out.println("has ganado");
				victoriaJugador++;
				seguirJugando = volverJugar();
				
				if (seguirJugando) {
				    numIntentosConsumidos = 0;
				    palabraSecreta = generarPalabra();
				}

				
			}
			
			else if (haTerminadoJuego()) {
				victoriaMaquina++;
				System.out.println("has fallado el intento: " + numIntentosConsumidos + " lo siento, has perdido. La palabra era: " + palabraSecreta);
				System.out.println("PUNTUACION: JUGADOR: " + victoriaJugador + " MAQUINA: " + victoriaMaquina);
				System.out.println();
				seguirJugando = volverJugar();
				
				if (seguirJugando) {
				    numIntentosConsumidos = 0;
				    palabraSecreta = generarPalabra();
				}
				
			
				
			}
		
			


		} while (seguirJugando);

		System.out.println("saliendo del programa");

	}

	public static String generarPalabra() {
		Random random = new Random();
		String palabras[] = { "perro", "raton", "silla", "pluma", "papel", "libro", "reloj", "llave", "fuego", "arena",
				"pasto", "dulce", "salud", "cielo", "sueno", "noche", "tarde", "costa", "monte", "broma" };
		return palabras[random.nextInt(0, palabras.length)];

	}

	public static String compruebaLetrasAcertadas(String palabra) {
		char palabras[] = new char[5];
		String mensaje = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < palabras.length; j++) {
				if (palabraSecreta.charAt(i) == palabra.charAt(j)) {
					palabras[j] = palabra.charAt(j);
				}
			}
			if (palabraSecreta.charAt(i) == palabra.charAt(i)) {
				palabras[i] = Character.toUpperCase(palabra.charAt(i));

			} else {
				palabras[i] = '*';
			}
		}
		for (int i = 0; i < palabras.length; i++) {
			mensaje += palabras[i];
		}
		return mensaje;
	}

	static boolean haGanadoJugador(String palabra) {

		if (palabraSecreta.equalsIgnoreCase(palabra)) {
			return true;
		}
		return false;
	}

	static boolean haTerminadoJuego() {

		return numIntentosConsumidos >= 6;

	}

	static boolean son5Letras(String palabra) {
		return palabra.length() == 5;
	}

	static boolean soloLetras(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if (!Character.isLetter(palabra.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	static boolean entre2_3Vocales(String palabra) {
		int numeroVocales = 0;
		for (int i = 0; i < palabra.length(); i++) {
		        if ( palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
		            numeroVocales++;
		        }
		}
		return numeroVocales >= 2 && numeroVocales <= 3;

	}

	static boolean mas3ConsonatesSeguidas(String palabra) {
		int numeroConsonantes = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (Character.isLetter(palabra.charAt(i)) && palabra.charAt(i) != 'a' && palabra.charAt(i) != 'e'
					&& palabra.charAt(i) != 'i' && palabra.charAt(i) != 'o' && palabra.charAt(i) != 'u') {

				numeroConsonantes++;
				if (numeroConsonantes > 3) {
					return true;

			} else {
				numeroConsonantes = 0;
			}
		}
	
		} return false;
	}
	static boolean noTerminanQWX(String palabra) {
		if(palabra.charAt(palabra.length()-1) != 'q' && palabra.charAt(palabra.length()-1) != 'w' && palabra.charAt(palabra.length()-1) != 'x') {
			
			return true;
		}
		else
			return false;
	}
	static boolean vocalesSeguidasIguales(String palabra) {
		
		for (int i = 0; i < palabra.length()-1; i++) {
			char siguiente = palabra.charAt(i+1);
			if ((palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e'
					|| palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') && palabra.charAt(i) == siguiente){

		
					return true;
		}
	
		} return false;
	}
	static boolean volverJugar() {
		char c;
		System.out.println("QUIERES VOLVER A JUGAR? (pulsa s para seguir, pulsa cualquier otra letra para salir)");
		c = scanner.nextLine().charAt(0);
		c = Character.toLowerCase(c);
		if(c == 's') {
		return true;
		}
		return false;
	}

}
