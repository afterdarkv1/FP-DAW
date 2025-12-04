package UNIDAD2;

import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = scanner.nextLine();

        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        System.out.println(palabraInvertida);
        scanner.close();
    }
}
