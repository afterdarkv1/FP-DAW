package pdfresueltos;

import java.util.Scanner;

public class algoritmos {

	static Scanner scanner = new Scanner(System.in);

	static int menor;

	static int mayor;

	static int num1;

	static double Dnum1;

	static int num2;

	static int num3;

	static double suma = 0;

	static double cateto1 = 0;

	static double cateto2 = 0;

	static double hipotenusa = 0;

	static double ms;

	static int opcion;
	static int nota = 0;
	static int notas = 0;
	static double promedio = 0;
	static int cont = 0;
	static int dia = 0;
	static int dias = 0;
	static int semana = 0;
	static int mes = 0;
	static int año = 0;

	public static void main(String[] args) {
		dia = leerEntero("introduce el numero de dias ");
		dias = dia;

		while (dia >= 365) {
			año++;
			dia = dia - 365;
		}
		while (dia >= 30) {
			mes++;
			dia = dia - 30;
		}
			while (dia >= 7) {
				semana++;
				dia = dia - 7;
			}
			



		System.out.println(dias + " dias es equivalente a " + año + " años" + " y " + mes + " meses " + " y " + semana
				+ " semanas " + dia + " y dias.");

	}

	public static void promedioNotas(String[] args) {
		while (true) {

			nota = leerEntero("introduce una nota: " + " (pulsa 0 para finalizar)");
			if (nota < 0 || nota > 10) {
				System.out.println("la nota debe de estar compredida entre 1 y 10");
				break;
			}

			if (nota == 0) {
				break;
			} else {
				notas += nota;
				cont++;
			}

		}

		if (cont > 0) {
			promedio = (notas / cont);
			System.out.println("tu promedio es de:" + promedio);

		} else {
			System.out.println("no se introducieron notas");
		}

	}

	public static void km_A_ms(String[] args) {
		System.out.println("Programa para convertir km/h a m/s");

		System.out.println("Introduce 's' para salir en cualquier momento.");

		while (true) {

			String input = leerString("Introduce un número: ");

			if (input.equalsIgnoreCase("s")) {

				System.out.println("Programa finalizado.");

				break;

			}

			try {

				Dnum1 = Double.parseDouble(input);

				ms = (Dnum1 * 1000) / 3600;

				System.out.println(Dnum1 + " km/h = " + ms + " m/s");

			} catch (NumberFormatException e) {

				System.out.println("Debes introducir un número válido o 's' para salir.");

			}

		}

	}

	// Método para leer String

	public static String leerString(String mensaje) {

		System.out.println(mensaje);

		return scanner.nextLine();

	}

	// ms = kmh * 1000 / 3600;//

	public static void primo(String[] args) {

		do {

			num1 = leerEntero("intruduce un numero: ");

			if ((num1 >= 0)) {

				if (esPrimo(num1)) {

					System.out.println("el numero es primo");

				}

				if (!esPrimo(num1)) {

					System.out.println("no es primo");

				}

			}

			else {

				System.out.println("el numero debe ser entero positivo");

			}

		} while (num1 <= 0);

	}

	public static void numerosMenorAMayor(String[] args) {

		do {

			num1 = leerEntero("intruduce un numero");

			num2 = leerEntero("intruduce un numero");

			if (num1 != num2) {

				if (num1 > num2) {

					mayor = num1;

					menor = num2;

				}

				else {

					mayor = num2;

					menor = num1;

				}

				for (int i = menor; i <= mayor; i++) {

					System.out.print(i + " ");

				}

			} else {

				System.out.println("los numeros no pueden ser iguales");

			}

		}

		while (num1 == num2);

	}

	public static void notas(String[] args) {

		do {

			num1 = leerEntero("introduce tu nota");

			if (num1 >= 1 && num1 <= 20) {

				if (num1 == 20 || num1 == 19) {

					System.out.println("tu no es A");

				}

				if (num1 == 18 || num1 == 17 || num1 == 16) {

					System.out.println("tu no es B");

				}

				if (num1 == 15 || num1 == 14 || num1 == 13) {

					System.out.println("tu no es C");

				}

				if (num1 == 12 || num1 == 11 || num1 == 10) {

					System.out.println("tu no es D");

				}

				if (num1 <= 9) {

					System.out.println("tu no es E");

				}

			}

			else {

				System.out.println("el numero debe de estar entre 1 y 20");

			}

		} while (num1 < 1 || num1 > 20);

	}

	public static void mayorMenor2numeros(String[] args) {

		System.out.println("introduce un numero");

		int num1 = scanner.nextInt();

		System.out.println("introduce un numero");

		int num2 = scanner.nextInt();

		if (num1 > num2) {

			System.out.println(num1 + " es mayor que " + num2);

		}

		else {

			System.out.println(num2 + " es mayor que " + num1);

		}

	}

	public static void mayorMenor3numeros(String[] args) {

		do {

			System.out.println("introduce un numero");

			num1 = scanner.nextInt();

			System.out.println("introduce un numero");

			num2 = scanner.nextInt();

			System.out.println("introduce un numero");

			num3 = scanner.nextInt();

			if (num1 > num2 || num1 > num3) {

				mayor = num1;

			}

			else {

				menor = num1;

			}

			if (num2 > num1 || num2 > num3) {

				mayor = num2;

			}

			else {

				menor = num2;

			}

			if (num3 > num1 || num3 > num2) {

				mayor = num3;

			}

			else {

				menor = num3;

			}

			System.out.println("el mayor es " + mayor + " y el menor es " + menor);

			if (num1 == num2 || num1 == num3 || num2 == num3) {

				System.out.println("hay numero iguakes intentelo de nuevo");

			}

		} while (num1 == num2 || num1 == num3 || num2 == num3);

	}

	public static void sumahasta10(String[] args) {

		for (int i = 1; i <= 10; i++) {

			suma = suma + i;

		}

		System.out.println(suma);

	}

	public static void calculahipotenusa(String[] args) {

		System.out.println("!!!!vamos a determinar la hipotenusa de tu triangulo!!!!");

		System.out.println();

		System.out.println("introduce el cateto1 :");

		while (!scanner.hasNextDouble()) {

			System.out.println("error: introduce un numero");

			scanner.next();

		}

		cateto1 = scanner.nextDouble();

		System.out.println("introduce el cateto1 :");

		while (!scanner.hasNextDouble()) {

			System.out.println("error: introduce un numero");

			scanner.next();

		}

		cateto2 = scanner.nextDouble();

		suma = (cateto1 * cateto1) + (cateto2 * cateto2);

		hipotenusa = Math.sqrt(suma);

		System.out.println("la hipotenusa es : " + hipotenusa);

	}

	public static void calcularVolumenAltura(String[] args) {

		System.out.println("1 - calcular el volumen");

		System.out.println("2 - calcular la altura");

		System.out.println("");

		opcion = leerEntero("elige una opcion");

		switch (opcion) {

		case 1:

			int r1 = leerEntero("introduzca el valor del radio");

			int h1 = leerEntero("introduzca el valor de la altura");

			double v1 = Math.PI * (Math.pow(r1, 2) * h1);

			System.out.println("el volumen es " + v1);

			break;

		case 2:

			int r2 = leerEntero("introduzca el valor del radio");

			int v2 = leerEntero("introduzca el valor del volumen");

			double h2 = v2 / (Math.PI * (Math.pow(r2, 2)));

			System.out.println("el altura es " + h2);

			break;

		default:

			System.out.println("opcion invalida eliga 1 o 2");

			break;

		}

	}

	public static void parOImpar(String[] args) {

		num1 = leerEntero("introduzca un numero");

		if (num1 % 2 == 0) {

			System.out.println("es un numero par");

		}

		else {

			System.out.println("no es un numero par");

		}

	}

	// CLASES O FUNCIONES //

	public static int leerEntero(String mensaje) {

		int numero;

		while (true) {

			System.out.println(mensaje);

			if (scanner.hasNextInt()) {

				numero = scanner.nextInt();

				break;

			}

			else {

				System.out.println("tiene que introducir un numero");

				scanner.next();

			}

		}

		return numero;

	}

	public static double leerDouble(String mensaje) {

		double numero;

		while (true) {

			System.out.println(mensaje);

			if (scanner.hasNextDouble()) {

				numero = scanner.nextDouble();

				break;

			}

			else {

				System.out.println("tiene que introducir un numero");

				scanner.next();

			}

		}

		return numero;

	}

	public static boolean esPrimo(int N) {

		if (N == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(N); i++) {

			if (N % i == 0)
				return false;

		}

		return true;

	}

}