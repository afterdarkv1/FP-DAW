package arrays;

import java.util.Scanner;

public class rellenar_un_array_con_dos_array_multiplicandolas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int [] numeros1 = new int[5];
        int [] numeros2 = new int[5];
        int[] resultado = new int [5];

         for (int i = 0; i < numeros1.length; i++) {
            System.out.print("Introduce un numero ");
            numeros1[i] = scanner.nextInt();
        }
            for (int i = 0; i < numeros2.length; i++) {
            System.out.println("introduce un numer5o ") ;
        }

          for (int i = 0; i < 5; i++) {
            resultado = numeros1[i] * numeros2[i];
        }


    }
    
}
