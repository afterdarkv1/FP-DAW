package TresEnRaya;


import java.util.Scanner;


public class TresEnRaya2 {


    public static Scanner in = new Scanner(System.in);

    public static char[] tablero = new char[9]; // ' ' vacía, 'X' jugador 1, 'O' jugador 2
    
     public static char jugador1;
    public static char jugador2;




    // MÉTODOS DEL JUEGO


    // Inicializa el tablero con casillas vacías

    public static void iniciar() {

        for (int i = 0; i < 9; i++) tablero[i] = ' ';

    }


    // Comprueba si el movimiento del jugador es válido

    public static boolean movimientoValido(int pos) {

        return pos >= 1 && pos <= 9 && tablero[pos - 1] == ' ';

    }


    // Coloca la ficha del jugador 1 en la posición indicada

    
    public static void mueveJugador1(int pos) {

        tablero[pos - 1] = jugador1;

    }


    // Coloca la ficha del jugador 2 en la posición indicada

    public static void mueveJugador2(int pos) {

        tablero[pos - 1] = jugador2;

    }


    // Comprueba si quedan casillas vacías

    public static boolean quedanCasillas() {

        for (char c : tablero) if (c == ' ') return true;

        return false;

    }


    // Dibuja el tablero en consola

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

            // Mostrar números solo al principio

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


    // Comprueba si el jugador 1 gana

    public static boolean ganaJugador1() {

        return gana('X');

    }


    // Comprueba si el jugador 2 gana

    public static boolean ganaJugador2() {

        return gana('O');

    }


    // Comprueba si un jugador gana

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


    // Muestra las estadísticas del juego

    public static void mostrarEstadisticas(int v1, int v2, int emp) {

        System.out.println("========== ESTADÍSTICAS ==========");

        System.out.println("Victorias Jugador 1 (X): " + v1);

        System.out.println("Victorias Jugador 2 (O): " + v2);

        System.out.println("Empates: " + emp);

        System.out.println("==================================");

    }


    // --------------------------------

    // MAIN CON MENÚ

    // --------------------------------


    public static void main(String[] args) {


        int victoriasJugador1 = 0;

        int victoriasJugador2 = 0;

        int empates = 0;


        while (true) {

            System.out.println("----------------------- Elige una opción --------------------------");

            System.out.println("1. Iniciar partida");

            System.out.println("2. Estadísticas");

            System.out.println("3. Salir");

            System.out.print("> ");


            // Validar que la entrada sea un número

            if (!in.hasNextInt()) {

                System.out.println("Entrada no válida. Debes introducir un número.");

                in.nextLine(); // Limpiar buffer

                continue;

            }
            int opcion = in.nextInt();

            in.nextLine();


            if (opcion == 3) {

                System.out.println("Saliendo del juego...");

                break;

            } else if (opcion == 2) {

                mostrarEstadisticas(victoriasJugador1, victoriasJugador2, empates);

                continue;

            } else if (opcion != 1) {

                System.out.println("Opción no válida. Elige 1, 2 o 3.");

                continue;

            }
            boolean verdadero = true;
             while ( verdadero = true) {

                System.out.print("¿Quieres ser X u O? > ");


                char texto = in.nextLine().toUpperCase().charAt(0);


                if (texto == 'X' || texto == 'O') {

                    jugador1 = texto;
                    

                    if (jugador1 == 'X') {
                        jugador2 = 'O';
                        
                    } else {
                        jugador2 = 'X';
                       
                    }
                    break;
                 
              
                }

            
                System.out.println("Entrada no válida. Introduce X u O.");

            }

            // Iniciar partida

            iniciar();

            int turno = 1;


            while (true) {

                dibujaTablero();

                System.out.print("Turno Jugador " + turno + ". Posición (1-9): ");


                // Validar entrada del jugador

                if (!in.hasNextInt()) {

                    System.out.println("Introduce un número válido.");

                    in.nextLine();

                    continue;

                }

                int pos = in.nextInt();

                in.nextLine();


                if (!movimientoValido(pos)) {

                    System.out.println("Movimiento no válido.");

                    continue;

                }


                if (turno == 1) {

                    mueveJugador1(pos);

                    if (ganaJugador1()) {

                        dibujaTablero();

                        System.out.println("¡Jugador 1 gana!");

                        victoriasJugador1++;

                        break;

                    }

                    turno = 2;

                } else {

                    mueveJugador2(pos);

                    if (ganaJugador2()) {

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