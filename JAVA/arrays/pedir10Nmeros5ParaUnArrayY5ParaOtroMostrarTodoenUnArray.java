package arrays;

public class pedir10Nmeros5ParaUnArrayY5ParaOtroMostrarTodoenUnArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] arrayCombinado = new int[10];
        int contador = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número para el primer array: ");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número para el segundo array: ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            arrayCombinado[i] = array1[i];
            contador++;
            /*arrayCombinado[i + 5] = array2[i]; SI QUIERES AHORRARTE UN CONTADOR Y UN FOR */
     
        }
        for (int i = 0; i < 5; i++) {
            arrayCombinado[contador] = array2[i];
            contador++;
        }

    

        System.out.println("Array combinado:");
        for (int i = 0; i < arrayCombinado.length; i++) {
            System.out.println("Posición " + i + ": " + arrayCombinado[i]);
        }

        scanner.close();
    }
    
}
