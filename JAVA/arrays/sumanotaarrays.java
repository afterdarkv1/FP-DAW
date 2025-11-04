package arrays;

public class sumanotaarrays {
    public static void main(String[] args) {
        // Crear un array de notas
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};

        // Sumar las notas
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        // Imprimir la suma de las notas
        System.out.println("La suma de las notas es: " + suma);
        
    }
    
}




/*notas = new int [8] el ocho es logintud osea espacio a reservar ram */