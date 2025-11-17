package funciones;

import java.util.Scanner;

public class mostrar_par_impar_funcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = scanner.nextInt();
        mostrar_par_impar(numero);
        scanner.close();
        
    }
    public static int mostrar_par_impar(int numero) {


        if ( numero > 1){
            if (numero % 2 == 0) {
            System.out.println("es par");
            }
            else {
            System.err.println("es impar");
            }
    
        } else {
        System.out.println("el numero debe ser mayor que 1");


    
    }   
            return numero;      
}

}


