package arrays;

public class queRelleneUnArrayConLos100PrimerosNúmerosPareYMuestreLaSuma {
    public static void main(String[] args) {
        int[] numerosPares = new int[100];
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            numerosPares[i] = i * 2;
            System.out.print(numerosPares[i] + " ");
            suma = numerosPares[i] + suma;
        
         
        }

      
        System.out.println("La suma de estos números pares es: " + suma);
    }
    
}
