package ejerciciosAvanzados;

import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo:");
        int numero = sc.nextInt();

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) { 
            if (numero % i == 0) { 
                sumaDivisores += i; 
            }
        }

        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        sc.close();
    }
}
