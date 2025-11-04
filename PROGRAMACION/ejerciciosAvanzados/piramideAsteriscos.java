package ejerciciosAvanzados;

public class piramideAsteriscos {
    public static void main(String[] args) {
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios
            for (int j = filas; j > i; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
