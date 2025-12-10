package UNIDAD2;

import java.util.Random;

public class ejemplosNumerosAleatorios {
	static Random genAle = new Random();

	public static void main(String[] args) {
		int[] frecuencia=new int[11];
		
		for(int i = 0; i<100; i++) {
			int numAle = genAle.nextInt(11);
			System.out.println(numAle);
			frecuencia[numAle]++;
			
		}
		



		

	}

}
