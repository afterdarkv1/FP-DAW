package UNIDAD2;

import java.util.Random;

public class aleatoriosEje2 {
/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).*/
	public static void main(String[] args) {
		Random genAle = new Random();
		int suma = 0;
		
		for(int i = 0; i<3; i++) {
			int numAle = genAle.nextInt(6)+1;
			System.out.println(numAle);
			suma = (numAle+suma); 
			
		}
		
		System.out.println(suma);

	}

}
