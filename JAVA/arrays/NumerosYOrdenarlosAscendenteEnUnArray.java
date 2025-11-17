package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class NumerosYOrdenarlosAscendenteEnUnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);


        System.out.println("Números ordenados de menor a mayor:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
        }

        scanner.close();
    }
}




/*  pfsd37@educa.madrid.org 

revision programacion ud1,2

he obtenido un ......
 */



