package pdfresueltos;

import java.util.Arrays;
import java.util.Scanner;

public class condicionales {
	static Scanner scanner = new Scanner(System.in);
	
	static int dia = 0;
	static String dias[] = {"lunes","martes","miercoles","jueves","viernes","sabado", "domingo"} ;
	static String meses[] = {"enero","febrero","marzo","abril","mayo","junio", "julio", "agosto", " septiembre", "octubre", "noviembre", "diciembre"};
	static int numero = 1;
	static int numero2 = 2;
	static int numero3 = 3;
	static int mes = 0;
	static int mayor = 0;
	static int menor = 0;
	static int medio = 0;
	static int[] numeros = new int[3];
	public static void main(String[] args) {
	
			for(int i = 0; i <= numeros.length - 1; i++ ) {
				System.out.println("introduce el numero" + (i+1));
				numeros[i] = scanner.nextInt();
		
			}
			
			Arrays.sort(numeros);
			System.out.println("DE MENOR A MAYOR");
			for(int i = 0; i <= numeros.length - 1; i++ ) {
				System.out.println(numeros[i]);
		
			}
			System.out.println("DE MAYOR A MENOR");
			for(int i = numeros.length - 1; i >= 0; i-- ) {
				System.out.println(numeros[i]);
		
			}
			System.out.println("DE MAYOR A MENOR (líneas distintas, iguales juntos):");

			if (numeros[0] == numeros[1] && numeros[1] == numeros[2])
			{
			    // Los tres iguales
			    System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);

			} else if (numeros[2] == numeros[1]) {
			    // Dos mayores iguales
			    System.out.println(numeros[2] + " " + numeros[1]);
			    System.out.println(numeros[0]);

			} else if (numeros[1] == numeros[0]) {
			    // Dos menores iguales
			    System.out.println(numeros[2]);
			    System.out.println(numeros[1] + " " + numeros[0]);

			} else {
			    // Todos distintos
			    System.out.println(numeros[2]);
			    System.out.println(numeros[1]);
			    System.out.println(numeros[0]);
			}

		
	}

	public static void mayorMedioMenorSinArray(String[] args) {
		 do {
		        numero  = esNumerico();
		        numero2 = esNumerico();
		        numero3 = esNumerico();

		        // MAYOR
		        if (numero >= numero2 && numero >= numero3) {
		            mayor = numero;
		        } else if (numero2 >= numero && numero2 >= numero3) {
		            mayor = numero2;
		        } else {
		            mayor = numero3;
		        }

		        // MENOR
		        if (numero <= numero2 && numero <= numero3) {
		            menor = numero;
		        } else if (numero2 <= numero && numero2 <= numero3) {
		            menor = numero2;
		        } else {
		            menor = numero3;
		        }

		        // MEDIO
		        medio = numero + numero2 + numero3 - mayor - menor;

		        // 5. Menor a mayor
		        System.out.println("DE MENOR A MAYOR:");
		        System.out.println(menor + " " + medio + " " + mayor);

		        // 6. Mayor a menor
		        System.out.println("\nDE MAYOR A MENOR:");
		        System.out.println(mayor + " " + medio + " " + menor);

		        // 7. Mayor a menor en líneas distintas
		        System.out.println("\nDE MAYOR A MENOR (líneas distintas):");

		        if (mayor == medio) {
		            System.out.println(mayor + " " + medio);
		        } else {
		            System.out.println(mayor);
		            System.out.println(medio);
		        }

		        if (medio == menor && medio != mayor) {
		            System.out.println(medio + " " + menor);
		        } else if (medio != menor) {
		            System.out.println(menor);
		        }

		        System.out.println("\n--- NUEVA ITERACIÓN ---\n");

		    } while (true); // se mantiene el do-while
	   
	}

	public static void decirMes(String[] args) {
		
		do {
		mes = esNumerico();
		if(mes >=1 && mes <= 12) {
			System.out.println(meses[mes - 0]);
		}
	
		
		} while(mes >=1 && mes <= 12);
		System.out.println("el numero debe de estar entre 1 y 12");
		
	}
	
	public static void decirDiaDeLaSemana(String[] args) { 
		do {
		dia = esNumerico();
		if(dia >= 1 && dia <= 7) {
		System.out.println(dias[dia -1]);
		}
		} while(dia >= 1 && dia <= 7);
		System.out.println("error el numero debe de estar entre 1 y 7");
	}
	public static void parOImpar(String[] args) { 
		while(true) {
			
			numero  = esNumerico();
			
			if (esPar(numero)) {
				System.out.println("es par");
			}
			if(!esPar(numero)) {
				System.out.println("no es par");
			}
			
		}
	}
	public static void primo(String[] args) { 
		while (numero >= 1 && numero <= 5) {
		System.out.println("introduce un numero del 1 al 5");
		numero = scanner.nextInt();
		if (esPrimo(numero)) {
			System.out.println("es primo");
		}
		if (!esPrimo(numero)) {
			System.out.println("no es primo");
		}
		}
	}
	public static boolean esPrimo(int N) {
		if(N == 1) return false;
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				return false;
			}

		}
		return true;
	}
	public static int esNumerico() {
		int numero;
		
		while(true) {
			System.out.println("introduce un numero"); {
				if (scanner.hasNextInt()){
					numero = scanner.nextInt();
					break;
				}
				else {
					System.out.println("el valor introducido no es un numero entero");
					scanner.next();
				}
			}
		
		}
		
		return numero;
	
	}
	public static boolean esPar(int N) { 
		if (N % 2 == 0){
			System.out.println();
			return true;
		}
		return false;
	}

	

}
