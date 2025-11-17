package examenes;
import java.util.Scanner;

public class EvaluablePractica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 'p' para pares o 'i' para impares: ");
        String caracter = scanner.next();
        int[] numeros = new int[500];

        if (caracter.equals("p")) {
            // Números pares
            for (int i = 0; i < 500; i++) {
                numeros[i] = (i + 1) * 2; // 2, 4, 6, ...
                System.out.println(numeros[i]);
            }
        } else if (caracter.equals("i")) {
            // Números impares
            for (int i = 0; i < 500; i++) {
                numeros[i] = i * 2 + 1; // 1, 3, 5, ...
                System.out.println(numeros[i]);
            }
        } else {
            System.out.println("Entrada no válida. Debes introducir 'p' o 'i'.");
        }

        scanner.close(); // buena práctica
    }
}
