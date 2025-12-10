package UNIDAD2;

import java.util.Random;

public class aleatorioeje4 {
	
	    static String[] baraja = {
	        "as", "2", "3", "4", "5", "6", "7",
	        "sota", "caballo", "rey"
	    };
	    static Random genAle = new Random();

	    public static void main(String[] args) {

	        // Generar 11 cartas aleatorias
	        for (int i = 0; i < 11; i++) {
	            int indice = genAle.nextInt(baraja.length);
	            String carta = baraja[indice];
	            System.out.println(carta);
	        }

	    }
	}

