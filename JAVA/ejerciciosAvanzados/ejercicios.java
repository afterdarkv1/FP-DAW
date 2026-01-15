package ejerciciosAvanzados;

import java.util.Scanner;

public class ejercicios {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		        int numero = esNumerico();
		        // Verificar si es válido
		        if (numero <= 0) {
		            System.out.println("El número debe ser mayor que 0.");
		        } else {
		            System.out.println("Divisores primos de " + numero + ":");

		            for (int i = 2; i <= numero; i++) {
		                if (numero % i == 0 && esPrimo(i)) {
		                    System.out.println(i);
		                }
		            }
		        }

		        scanner.close();
		    }
	public static void fibonacci(String[] args) {

		int n = 10;

		generarFibonacci(n);
	}

	public static void generarFibonacci(int n) {
		int a = 0;
		int b = 1;

		System.out.print("Secuencia de Fibonacci: ");

		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");

			int siguiente = a + b;
			a = b;
			b = siguiente;
		}

	}

	public static void suma2Primos(String[] args) {
		int numero = 20;

		System.out.println("Formas de expresar " + numero + " como suma de dos números primos:");

		for (int i = 2; i <= numero / 2; i++) {
			if (esPrimo(i) && esPrimo(numero - i)) {
				System.out.println(i + " + " + (numero - i));
			}
		}
	}

	public static void primosGemelos(String[] args) {
		int inicio = 1;
		int fin = 100;

		System.out.println("Pares de números primos gemelos entre " + inicio + " y " + fin + ":");

		for (int i = inicio; i <= fin - 2; i++) {
			if (esPrimo(i) && esPrimo(i + 2)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void numeroPerfecto(String[] args) {

		int numero = 28;

		if (esNumeroPerfecto(numero)) {
			System.out.println(numero + " es un número perfecto");
		} else {
			System.out.println(numero + " no es un número perfecto");
		}
	}

	public static boolean esNumeroPerfecto(int numero) {
		int suma = 0;

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}

		return suma == numero;

	}

	public static void numeroArmstrong(String[] args) {
		int numero = 153;

		if (esArmstrong(numero)) {
			System.out.println(numero + " es un número Armstrong");
		} else {
			System.out.println(numero + " no es un número Armstrong");
		}
	}

	public static boolean esArmstrong(int numero) {
		int original = numero;
		int suma = 0;

		while (numero > 0) {
			int digito = numero % 10;
			suma += Math.pow(digito, 3);
			numero /= 10;
		}

		return suma == original;
	}
	public static int esNumerico() {
		int numero;
		
		while(true) {
			System.out.println("introduce un numero"); 
				if (scanner.hasNextInt()){
					numero = scanner.nextInt();
					break;
				}
				else {
					System.out.println("el valor introducido no es un numero entero");
					scanner.next();
				}
		
		}
		
		return numero;
	
	}
}
