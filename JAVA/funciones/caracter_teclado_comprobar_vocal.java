package funciones;
import java.util.Scanner;

public class caracter_teclado_comprobar_vocal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un carácter: ");
        
        char c = scanner.nextLine().charAt(0);

        if (esVocal(c)) {
            System.out.println("El carácter " + c + " es una vocal.");
        } else {
            System.out.println("El carácter " + c + " no es una vocal.");
        }
    }

    public static boolean esVocal(char c) {

        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
