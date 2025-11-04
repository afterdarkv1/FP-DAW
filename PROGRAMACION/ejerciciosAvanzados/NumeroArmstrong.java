package ejerciciosAvanzados;
import java.util.Scanner;

public class NumeroArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de tres cifras: ");
        int numero = sc.nextInt();

        // Comprobamos si el número tiene tres cifras
        if (numero < 100 || numero > 999) {
            System.out.println("El número debe tener tres cifras.");
        } else {
            int original = numero;
            int suma = 0;
            int digitos = 3; // sabemos que tiene tres cifras

            while (numero > 0) {
                int digito = numero % 10;
                suma += Math.pow(digito, digitos);
                numero /= 10;
            }

            if (suma == original) {
                System.out.println(original + " es un número Armstrong.");
            } else {
                System.out.println(original + " no es un número Armstrong.");
            }
        }

        sc.close();
    }
}

