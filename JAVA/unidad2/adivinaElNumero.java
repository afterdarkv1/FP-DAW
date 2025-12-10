package UNIDAD2;

import java.util.Random;
import java.util.Scanner;

public class adivinaElNumero {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sn = new Scanner(System.in);

        System.out.println("Piensa un número entre 0 y 100. El programa intentará adivinarlo en 5 intentos.");

        int min = 0;
        int max = 100;
        boolean adivinado = false;

        for (int i = 1; i <= 5; i++) {
            int intento = rand.nextInt(max - min + 1) + min; 
            System.out.println("Intento " + i + ": ¿Tu número es " + intento + "?");
            
            System.out.println("1. Sí");
            System.out.println("2. Mi número es mayor");
            System.out.println("3. Mi número es menor");
            System.out.print("Elige una opción: ");
            
            int opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Lo he adivinado!");
                    adivinado = true;
                    break;
                case 2:
                    min = intento + 1;
                    break;
                case 3:
                    max = intento - 1; 
                    break;
                default:
                    System.out.println("Opción no válida.");
                    i--; 
                    continue;
            }

            if (adivinado) {
                break;
            }

            if (min > max) {
                System.out.println("¡Ups! Parece que hubo un error en las respuestas.");
                break;
            }
        }

        if (!adivinado) {
            System.out.println("Matate");
        }

        sn.close();
    }
}
