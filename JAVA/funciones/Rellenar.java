package funciones;
import java.util.Scanner;

public class Rellenar {

    public static void main(String[] args) {
        int[] original = rellenarArray();          // llenar el array
        int[] multiplicado = multiplicarPorDos(original); // multiplicar por 2

        // Mostrar array multiplicado
        System.out.print("Array multiplicado por 2: ");
        for (int num : multiplicado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Función para llenar el array
    private static int[] rellenarArray() {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }

        // Mostrar array original
        System.out.print("Contenido del array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        return a;
    }

    // Función que multiplica cada elemento por 2 y devuelve un nuevo array
    private static int[] multiplicarPorDos(int[] array) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[i] * 2;
        }
        return resultado;
    }
}
