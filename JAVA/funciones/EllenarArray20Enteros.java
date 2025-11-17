package funciones;

import java.util.Scanner;

public class EllenarArray20Enteros {
    public static void main(String[] args) {
        int[] array = llenar_array(); 
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] llenar_array() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5]; 

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un número: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
