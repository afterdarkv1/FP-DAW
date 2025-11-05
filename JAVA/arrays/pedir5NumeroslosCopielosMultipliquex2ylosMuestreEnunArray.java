package arrays;

import java.util.Scanner;

public class pedir5NumeroslosCopielosMultipliquex2ylosMuestreEnunArray {
    public static void main(String[] args) {
       Scanner scanner = new java.util.Scanner(System.in);
        int[] numeros = new int[5];
        int[] numerosMultiplicados = new int[5];

   

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número : ");
            numeros[i] = scanner.nextInt();
            numerosMultiplicados[i] = numeros[i] * 2;
        }

        System.out.println("Números multiplicados por 2:");
        for (int i = 0; i < numerosMultiplicados.length; i++) {
            System.out.println("Posición " + i + ": " + numerosMultiplicados[i]);
        }

        scanner.close();
    }

    
}



