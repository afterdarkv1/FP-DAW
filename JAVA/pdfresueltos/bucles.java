package pdfresueltos;

import java.util.Scanner;
   

public class bucles {
	  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas para las figuras: ");
        int filas = scanner.nextInt();

        System.out.println("\n--- a) Triángulo de asteriscos ---");
        triangulo(filas);

        System.out.println("\n--- b) Pirámide de asteriscos ---");
        piramide(filas);

        System.out.println("\n--- c) Pirámide hueca ---");
        piramideHueca(filas);

        System.out.println("\n--- d) Cuadrado hueco ---");
        cuadradoHueco(filas);

        System.out.println("\n--- e) Diamante ---");
        diamante(filas);

        System.out.println("\n--- f) Diamante hueco ---");
        diamanteHueco(filas);

        scanner.close();
    }

    // a) Triángulo de asteriscos
    public static void triangulo(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // b) Pirámide de asteriscos
    public static void piramide(int filas) {
        for (int i = 1; i <= filas; i++) {
            // espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // c) Pirámide hueca
    public static void piramideHueca(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == filas || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // d) Cuadrado hueco
    public static void cuadradoHueco(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (i == 1 || i == filas || j == 1 || j == filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // e) Diamante
    public static void diamante(int filas) {
        // mitad superior
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // mitad inferior
        for (int i = filas - 1; i >= 1; i--) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // f) Diamante hueco
    public static void diamanteHueco(int filas) {
        // mitad superior
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // mitad inferior
        for (int i = filas - 1; i >= 1; i--) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

			
		  

    public static void paresAmigos(String[] args) {



        // Pedir rango al usuario
        System.out.print("Ingrese el límite inferior del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el límite superior del rango: ");
        int fin = scanner.nextInt();

        if (inicio < 1 || fin < inicio) {
            System.out.println("Rango inválido.");
        } else {

            // Arreglo para almacenar la suma de divisores propios de cada número
            int[] sumaDivisores = new int[fin + 1];

            // Calcular suma de divisores propios de cada número
            for (int i = inicio; i <= fin; i++) {
                sumaDivisores[i] = sumaDivisoresPropios(i);
            }

            System.out.println("\nPares de números amigos en el rango [" + inicio + ", " + fin + "]:");

            boolean encontrado = false;

            // Buscar números amigos
            for (int a = inicio; a <= fin; a++) {
                int b = sumaDivisores[a];

                // Verificar que no se repita el par y que sean números amigos
                if (b > a && b <= fin && sumaDivisores[b] == a) {
                    System.out.println("(" + a + ", " + b + ")");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron números amigos en este rango.");
            }
        }

        scanner.close();
    }

    // Método para calcular la suma de los divisores propios de un número
    public static int sumaDivisoresPropios(int n) {
        if (n <= 1) return 0;

        int suma = 1; // 1 siempre es divisor propio
        int limite = (int) Math.sqrt(n);

        for (int i = 2; i <= limite; i++) {
            if (n % i == 0) {
                suma += i;
                int otro = n / i;
                if (otro != i && otro != n) {
                    suma += otro;
                }
            }
        }
        return suma;
    }



	public static void factorial(String[] args) {
		System.out.println(esFactorial(5)); // 120
	}

	public static int esFactorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static void encontrarPrimos(String[] args) {
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

		while (true) {
			System.out.println("introduce un numero");
			if (scanner.hasNextInt()) {
				numero = scanner.nextInt();
				break;
			} else {
				System.out.println("el valor introducido no es un numero entero");
				scanner.next();
			}

		}

		return numero;

	}
}
