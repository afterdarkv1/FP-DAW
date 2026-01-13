package jercicios;
import java.util.Scanner;

public class palabraRepetidas {

		    static String cadena = "";
		    static Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        System.out.println("Introduce una cadena:");
		        cadena = scanner.nextLine();

		        String[] palabras = cadena.split(" ");
		        System.out.println("La cadena tiene " + palabras.length + " palabras");

		        String palabraMasLarga = "";
		        for (int i = 0; i < palabras.length; i++) {
		            if (palabras[i].length() > palabraMasLarga.length()) {
		                palabraMasLarga = palabras[i];
		            }
		        }
		        System.out.println("La palabra más larga es: " + palabraMasLarga);

		        System.out.println("Repetición de cada palabra:");
		        System.out.println();

		        for (int i = 0; i < palabras.length; i++) {

		            int contador = 0;

		            for (int j = 0; j < palabras.length; j++) {
		                if (palabras[i].equalsIgnoreCase(palabras[j])) {
		                    contador++;
		                }
		            }

		            boolean primeraVez = true;
		            for (int k = 0; k < i; k++) {
		                if (palabras[i].equalsIgnoreCase(palabras[k])) {
		                    primeraVez = false;
		                    break;
		                }
		            }

		            if (primeraVez) {
		                System.out.println(palabras[i] + " se repite " + contador + " veces");
		            }
		        }

	}

}
