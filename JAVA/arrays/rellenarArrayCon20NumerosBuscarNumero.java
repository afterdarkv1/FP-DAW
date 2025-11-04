package arrays;
import java.util.Scanner;


public class rellenarArrayCon20NumerosBuscarNumero {
    public static void main(String[] args) {
        int[] numeros = new int[20];
         Scanner sc = new Scanner(System.in);

 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Introduce un número a buscar en el array: ");
        int numeroABuscar = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }

        sc.close();
    }
}