package complejos;  
import java.util.Scanner;

public class agregarUnPodructoAunaArray {
        final static int TAM = 10;
        static char[] nombre = new char[TAM];
        static double[] precios = new double[TAM];
        static int[] stock = new int[TAM];
        static int pos = 0;
        static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("------------------------ Elige una opción --------------------------");
    System.out.println("----------------------- 1. dar de alta a un producto ---------------------------");
    System.out.println("----------------------- 2. buscar un producto ------------------------------");
    System.out.println("----------------------- 3. modificar el estock y el preio de un producto ------------------------------------");
    System.out.println("----------------------- 4. salir ------------------------------------");
    System.out.print("> ");
    opcion=entrada.nextInt();

   // Verifica si hay un entero
        switch (opcion) {
            case 1:
                    agregarProducto();
                break;
            case 2:
                System.out.println("Aquí irían las estadísticas (por programar).");
                break;
            case 3:
                System.out.println("Saliendo del juego...");
                System.exit(0);
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        } while (opcion != 4 );


        
    }
    public static void agregarProducto(){
        if (pos < TAM) {
            System.out.print("Ingrese el nombre del producto: ");
            nombre[pos] = entrada.next().charAt(0);
            System.out.print("Ingrese el precio del producto: ");
            precios[pos] = entrada.nextDouble();
            System.out.print("Ingrese el stock del producto: ");
            stock[pos] = entrada.nextInt();
            pos++;
        } else {
            System.out.println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
        }
    }
}