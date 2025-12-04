package UNIDAD2;

import java.util.Scanner;

/*QUE PIDA UN CADENA PO TECLADO Y DOS CARACTERES, VALIDA QUE SEA UN CARACTER,
 * SUSTITUYE LA APARICION DEL PRIMER CARACTER CON EL SEGUNDO */

public class hoja7eje7 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);


		        System.out.print("Introduce una cadena de texto: ");
		        String cadena = scanner.nextLine();


		        char caracter1 = ' ';
		        while (true) {
		            System.out.print("Introduce el primer carácter a reemplazar: ");
		            String string1 = scanner.nextLine();
		            if (string1.length() == 1) {
		                caracter1 = string1.charAt(0);
		                break;
		            } else {
		                System.out.println("Debe introducir solo un carácter.");
		            }
		        }


		        char caracter2 = ' ';
		        while (true) {
		            System.out.print("Introduce el carácter con el que reemplazar: ");
		            String string2 = scanner.nextLine();
		            if (string2.length() == 1) {
		                caracter2 = string2.charAt(0);
		                break;
		            } else {
		                System.out.println("Debe introducir solo un carácter.");
		            }
		        }


		        String nuevaCadena = cadena.replace(caracter1, caracter2);

	 
		        System.out.println("La cadena original es: " + cadena);
		        System.out.println("La nueva cadena es: " + nuevaCadena);

		        scanner.close();
		    }
		}


	/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce una cadena");
		String cadena =
		System.out.println("introduce la a remplazar");
		System.out.println("introduce el valor de la nueva vocal");
*/
