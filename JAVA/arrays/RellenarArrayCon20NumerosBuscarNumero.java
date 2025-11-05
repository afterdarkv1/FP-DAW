package arrays;
import java.util.Scanner;


public class RellenarArrayCon20NumerosBuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        System.out.print("Introduce un número a buscar en el array: ");
        int numeroABuscar = scanner.nextInt();


        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                System.out.println("Número " + numeroABuscar + " encontrado en la posición " + i + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número " + numeroABuscar + " no encontrado en el array.");
        }

        scanner.close();

    }
}


/* 

        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Introduce un número a buscar en el array: ");
        int numeroABuscar = sc.nextInt();

        int i = 0;

        do {
            if (numeros[i] == numeroABuscar) {
                break; 
            }
            i++;
        } while (i < numeros.length);

        if (i < numeros.length) {
            System.out.println("El número " + numeroABuscar + " se encuentra en el array." + numeros[i]);
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }

        sc.close();
        */