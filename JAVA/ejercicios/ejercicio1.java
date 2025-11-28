package JAVA.ejercicios;

public class ejercicio1 {

    public static void main(String[] args) {
        int numero = 33;
        System.out.println("el factorial de " + numero + " es " + factorial(numero));

        
    }
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);

        }
    }
}