package funciones;

import java.util.Scanner;

public class tabla_pedida_por_teclado {

    public static void main(String[] args) {
        multiplicar();


}
 public static void multiplicar() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("introduce un numero para la tabla de multiplicar");
    int numero = scanner.nextInt(); 
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
scanner.close();

}
}