package arrays.masarrays;

import java.util.Arrays;
import java.util.Scanner;

public class CuantasLetrasArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("cuantas letras tiene tu palabra:");
int palabra = scanner.nextInt();
scanner.nextLine();


char[] letras = new char[palabra];
    System.out.println("intruduzca letra a letra:");
for (int i = 0; i < palabra; i++) {
    System.out.print("letra " + (i + 1) + ": ");
    letras[i] = scanner.nextLine().charAt(0);
}
System.out.println(letras);

for (int i = letras.length - 1; i >= 0; i--) {
    System.out.print(letras[i]);
}
scanner.close();

    }
}