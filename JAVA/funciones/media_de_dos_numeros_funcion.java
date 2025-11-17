package funciones;

import java.util.Scanner;

public class media_de_dos_numeros_funcion {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("introduce un numero");
    double numero1 = scanner.nextDouble();

    System.out.println("introduce otro numero");
    double numero2 = scanner.nextDouble();
    
    double resultado = media(numero1, numero2);
    System.out.println("la media de los dos numeros es " + resultado);
    scanner.close();
}

public static double media(double a, double b) {
    double resultado = (a + b ) /2;
    return resultado;    
}



}













/* 

    public static void main(String[] args) {
        // Llamamos a la función media
        double resultado = media(4, 8);
        System.out.println("La media es: " + resultado);
    }

    // Definimos una función que calcula la media de dos números
    public static double media(double a, double b) {
        double resultado = (a + b) / 2;
        return resultado;
    } 
        
    
    */