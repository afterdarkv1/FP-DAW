package UNIDAD2;

import java.util.Random;

public class numeroAleatorio24 {

	public static void main(String[] args) {
			/* 9. Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
números se han generado */
				        Random rand = new Random();
				        int numero;
				        int contador = 0;

				        do {
				            numero = rand.nextInt(51) * 2; 
				            System.out.println(numero);
				            contador++;
				        } while (numero != 24);
				        System.out.println("Se generaron " + contador + " números hasta sacar el 24.");
				        
				    }		
	}





