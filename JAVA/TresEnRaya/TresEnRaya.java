package TresEnRaya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TresEnRaya {

    private static String nombreJuego = "Bienvenido al juego tresEnRaya";

    private static char jugador = 'x';

    // Tablero
    static char[] tablero = {
        '1','2','3',
        '4','5','6',
        '7','8','9'
    };

    private static Map<Integer,Integer> posiciones = new HashMap<>();
    private static boolean primeraVez = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarMenu(scanner);

        iniciarTablero();
        jugar(scanner);
    }



    // ─────────────────────────────────────────────
    // MENÚ PRINCIPAL
    // ─────────────────────────────────────────────
    private static void mostrarMenu(Scanner scanner) {
    System.out.println("------------------------ Elige una opción --------------------------");
    System.out.println("----------------------- 1. Iniciar partida ---------------------------");
    System.out.println("----------------------- 2. Estadísticas ------------------------------");
    System.out.println("----------------------- 3. Salir ------------------------------------");
    System.out.print("> ");

    if (scanner.hasNextInt()) {      // Verifica si hay un entero
        int opcion = scanner.nextInt();
        scanner.nextLine();          // Limpiar el buffer
        switch (opcion) {
            case 1:
                return; // iniciar partida
            case 2:
                System.out.println("Aquí irían las estadísticas (por programar).");
                System.exit(0);
            case 3:
                System.out.println("Saliendo del juego...");
                System.exit(0);
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }
    } else {
        System.out.println("Debes ingresar un número (1-3).");
        scanner.nextLine(); // Limpiar el buffer si no era número
    }
}


    // ─────────────────────────────────────────────
    // INICIALIZAR EL TABLERO
    // ─────────────────────────────────────────────
    private static void iniciarTablero() {
        cargarPosiciones();
        mostrarTablero();
    }

    // Mapear números 1-9 a posiciones reales del array del tablero
    private static void cargarPosiciones() {
        posiciones.put(1, 0);
        posiciones.put(2, 1);
        posiciones.put(3, 2);
        posiciones.put(4, 3);
        posiciones.put(5, 4);
        posiciones.put(6, 5);
        posiciones.put(7, 6);
        posiciones.put(8, 7);
        posiciones.put(9, 8);
    }

    // ─────────────────────────────────────────────
    // BUCLE PRINCIPAL DEL JUEGO
    // ─────────────────────────────────────────────
    private static void jugar(Scanner scanner) {
        while (true) {
            pedirMovimiento(scanner);

            mostrarTablero();

            if (hayGanador()) {
                System.out.println("¡Felicidades jugador " + jugadorNumero() + ", has ganado!");
                break;
            }

            if (tableroLleno()) {
                System.out.println("Ha sido un empate.");
                break;
            }

            cambiar_jugador();
        }
    }

    // ─────────────────────────────────────────────
    // PEDIR POSICIÓN AL JUGADOR
    // ─────────────────────────────────────────────
    private static void pedirMovimiento(Scanner scanner) {
        System.out.print("Es tu turno Jugador " + jugadorNumero() + ", ingresa la posición (1-9): ");
        int posicionElegida = scanner.nextInt();
        System.out.println("Has elegido la posición " + posicionElegida);

        if (!posiciones.containsKey(posicionElegida)) {
            System.out.println("La posición no existe. Elige entre 1-9.");
            pedirMovimiento(scanner);
            return;
        }

        int index = posiciones.get(posicionElegida);

        if (tablero[index] == 'x' || tablero[index] == 'o') {
            System.out.println("La posición ya está ocupada. Elige otra.");
            pedirMovimiento(scanner);
            return;
        }

        tablero[index] = jugador;
    }

    // ─────────────────────────────────────────────
    // MOSTRAR TABLERO
    // ─────────────────────────────────────────────
    private static void mostrarTablero() {
        System.out.println(nombreJuego);
        System.out.println("-------------");

        for (int i = 0; i < tablero.length; i++) {
            if (i % 3 == 0) System.out.print("| ");

            char mostrar = tablero[i];

            // En el primer turno muestra números, después espacios vacíos
            if (!primeraVez && mostrar != 'x' && mostrar != 'o') {
                mostrar = ' ';
            }

            System.out.print(mostrar + " | ");

            if (i % 3 == 2) {
                System.out.println();
                System.out.println("-------------");
            }
        }
        primeraVez = false;
    }

    // ─────────────────────────────────────────────
    // CAMBIAR DE JUGADOR
    // ─────────────────────────────────────────────
    private static void cambiar_jugador() {
        jugador = (jugador == 'x') ? 'o' : 'x';
    }

    private static int jugadorNumero() {
        return (jugador == 'x') ? 1 : 2;
    }

    // ─────────────────────────────────────────────
    // DETECCIÓN DE GANADOR
    // ─────────────────────────────────────────────
    private static boolean hayGanador() {
        // horizontales
        if (tablero[0]==tablero[1] && tablero[1]==tablero[2]) return true;
        if (tablero[3]==tablero[4] && tablero[4]==tablero[5]) return true;
        if (tablero[6]==tablero[7] && tablero[7]==tablero[8]) return true;

        // verticales
        if (tablero[0]==tablero[3] && tablero[3]==tablero[6]) return true;
        if (tablero[1]==tablero[4] && tablero[4]==tablero[7]) return true;
        if (tablero[2]==tablero[5] && tablero[5]==tablero[8]) return true;

        // diagonales
        if (tablero[0]==tablero[4] && tablero[4]==tablero[8]) return true;
        if (tablero[2]==tablero[4] && tablero[4]==tablero[6]) return true;

        return false;
    }

    // ─────────────────────────────────────────────
    // VERIFICAR TABLERO LLENO
    // ─────────────────────────────────────────────
    private static boolean tableroLleno() {
        for (char c : tablero) {
            if (c != 'x' && c != 'o') return false;
        }
        return true;
    }
}








