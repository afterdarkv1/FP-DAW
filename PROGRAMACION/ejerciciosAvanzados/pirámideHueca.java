package ejerciciosAvanzados;

public class pirámideHueca {
    public static void main(String[] args) {
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios
            for (int j = filas; j > i; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos huecos
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
