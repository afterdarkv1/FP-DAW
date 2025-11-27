package TresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

    public static Scanner in = new Scanner(System.in);

    public static char[] tablero = new char[9];

    // ===================================================
    // FUNCIÓN PARA ELEGIR FICHA (SIN USAR STRING)
    // ===================================================

    public static char elegirFicha() {
        while (true) {
            System.out.print("¿Quieres ser X u O? > ");

            if (!in.hasNext()) {
                in.next();
                System.out.println("Entrada no válida.");
                continue;
            }

            char c = in.next().toUpperCase().charAt(0);
            in.nextLine(); // limpiar buffer

            if (c == 'X' || c == 'O') {
                return c;
            }

            System.out.println("Entrada no válida. Escribe X o O.");
        }
    }

    // ===================================================
    // MÉTODOS DEL JUEGO
    // ===================================================

    public static void iniciar() {
        for (int i = 0; i < 9; i++) tablero[i] = ' ';
    }

    public static boolean movimientoValido(int pos) {
        return pos >= 1 && pos <= 9 && tablero[pos - 1] == ' ';
    }

    public static void mueveJugador1(int pos, char f) {
        tablero[pos - 1] = f;
    }

    public static void mueveJugador2(int pos, char f) {
        tablero[pos - 1] = f;
    }

    public static boolean quedanCasillas() {
        for (char c : tablero) if (c == ' ') return true;
        return false;
    }

    public static void dibujaTablero() {
        boolean primeraVez = true;

        for (char c : tablero) {
            if (c != ' ') {
                primeraVez = false;
                break;
            }
        }

        System.out.println("-------------");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.print("| ");

            char c = tablero[i];

            if (c == ' ') {
                System.out.print((primeraVez ? (i + 1) : " ") + " | ");
            } else {
                System.out.print(c + " | ");
            }

            if (i % 3 == 2) {
                System.out.println();
                System.out.println("-------------");
            }
        }
    }

    public static boolean gana(char f) {
        return
                (tablero[0] == f && tablero[1] == f && tablero[2] == f) ||
                (tablero[3] == f && tablero[4] == f && tablero[5] == f) ||
                (tablero[6] == f && tablero[7] == f && tablero[8] == f) ||
                (tablero[0] == f && tablero[3] == f && tablero[6] == f) ||
                (tablero[1] == f && tablero[4] == f && tablero[7] == f) ||
                (tablero[2] == f && tablero[5] == f && tablero[8] == f) ||
                (tablero[0] == f && tablero[4] == f && tablero[8] == f) ||
                (tablero[2] == f && tablero[4] == f && tablero[6] == f);
    }

    public static void mostrarEstadisticas(int v1, int v2, int emp) {
        System.out.println("========== ESTADÍSTICAS ==========");
        System.out.println("Victorias Jugador 1: " + v1);
        System.out.println("Victorias Jugador 2: " + v2);
        System.out.println("Empates: " + emp);
        System.out.println("==================================");
    }

    // ===================================================
    // MAIN
    // ===================================================

    public static void main(String[] args) {

        int victoriasJugador1 = 0;
        int victoriasJugador2 = 0;
        int empates = 0;

        char fichaJugador1 = 'X';
        char fichaJugador2 = 'O';

        while (true) {

            System.out.println("----------------------- Elige una opción --------------------------");
            System.out.println("1. Iniciar partida");
            System.out.println("2. Estadísticas");
            System.out.println("3. Salir");
            System.out.print("> ");

            if (!in.hasNextInt()) {
                System.out.println("Entrada no válida.");
                in.next();
                continue;
            }

            int opcion = in.nextInt();
            in.nextLine();

            if (opcion == 3) {
                System.out.println("Saliendo del juego...");
                break;
            } 
            else if (opcion == 2) {
                mostrarEstadisticas(victoriasJugador1, victoriasJugador2, empates);
                continue;
            }
            else if (opcion != 1) {
                System.out.println("Opción no válida.");
                continue;
            }

            // ===================================================
            // ELEGIR FICHA DEL JUGADOR 1
            // ===================================================

            fichaJugador1 = elegirFicha();
            fichaJugador2 = (fichaJugador1 == 'X') ? 'O' : 'X';

            System.out.println("Jugador 1 será: " + fichaJugador1);
            System.out.println("Jugador 2 será: " + fichaJugador2);

            iniciar();
            int turno = 1;

            // ===================================================
            // BUCLE DE PARTIDA
            // ===================================================

            while (true) {

                dibujaTablero();
                System.out.print("Turno Jugador " + turno + ". Posición (1-9): ");

                if (!in.hasNextInt()) {
                    System.out.println("Introduce un número válido.");
                    in.next();
                    continue;
                }

                int pos = in.nextInt();
                in.nextLine();

                if (!movimientoValido(pos)) {
                    System.out.println("Movimiento no válido.");
                    continue;
                }

                if (turno == 1) {
                    mueveJugador1(pos, fichaJugador1);

                    if (gana(fichaJugador1)) {
                        dibujaTablero();
                        System.out.println("¡Jugador 1 gana!");
                        victoriasJugador1++;
                        break;
                    }

                    turno = 2;
                } else {
                    mueveJugador2(pos, fichaJugador2);

                    if (gana(fichaJugador2)) {
                        dibujaTablero();
                        System.out.println("¡Jugador 2 gana!");
                        victoriasJugador2++;
                        break;
                    }

                    turno = 1;
                }

                if (!quedanCasillas()) {
                    dibujaTablero();
                    System.out.println("Empate.");
                    empates++;
                    break;
                }
            }

            System.out.println("------------------- PARTIDA FINALIZADA -------------------");
        }
    }
}
