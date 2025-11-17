package funciones;

public class EjemploFuncion {

  

    public static void main(String[] args) {
        // Llamamos a la función sumar
        int suma = sumar(5, 3);
        System.out.println("La suma es: " + suma);
    }
      // Definimos una función que suma dos números
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
