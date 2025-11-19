package TresEnRaya;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class TresEnRaya {
    private static int victoriasJugador1 = 0;
    private static int victoriasJugador2 = 0;
    private static int empates = 0;


    private static String nombreJuego = "Bienvenido al juego tresEnRaya";

    private static char jugador = 'x';
    public static int jugadorNumero() {
        return (jugador == 'x') ? 1 : 2;
    }

    
    public static void cambiar_jugador() {
    	if (jugador == 'x'){
    		jugador = 'o';
    	} else {
    		jugador = 'x';
    	}
    }
    

    static char[] tablero = {
        '1','2','3',
        '4','5','6',
        '7','8','9'
    };

    private static Map<Integer,Integer> posiciones = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bucle principal (Menú y Juego)
        while (true) {
            // --- LÓGICA DEL MENÚ ---
            System.out.println("-----------------------eliga una opcion--------------------------");
            System.out.println("-----------------------1.iniciar partida---------------------------");
            System.out.println("------------------------2.estadisticas-----------------------------");
            System.out.println("----------------------------3.salir-----------------------------------");
            System.out.print("> ");
            
            int opcion = 0; 
            
            try {
                opcion = scanner.nextInt();
                // Consumir el salto de línea pendiente aquí si la lectura es exitosa
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpiar el buffer si no es un número
                opcion = 0;         // Asignar 0 para que caiga en el 'else'
            }
            
            
            if (opcion == 3) {
                System.out.println("Saliendo del juego...");
                return; // Termina el método main y el programa
            }
            else if (opcion == 2) {
                mostrarEstadisticas();
                System.out.println("-----------------------------------------------------------------");
                continue;
            }

            else if (opcion != 1) { // Esto cubre 'opcion == 0' (letras) y otros números inválidos
                System.out.println("Opción no válida. Tiene que elegir entre 1 y 3.");
                System.out.println("-----------------------------------------------------------------");
                continue; // Vuelve al inicio del bucle para mostrar el menú de nuevo
            }
            
            // Si llegamos a este punto, 'opcion' DEBE ser 1
            
            // --- LÓGICA DE INICIO DE PARTIDA (Opción 1) ---
            
            System.out.println(nombreJuego);
            cargarPosiciones(); 
            mostrarTablero();
            
            // Bucle para los turnos del juego
            while(true) {
                System.out.print("Es tu turno Jugador " + jugadorNumero() + ", ingresa la posición (1-9): ");
                int posicionElegida;
                
                // **IMPORTANTE:** Manejo de error para la entrada de posición
                try {
                    posicionElegida = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                } catch (InputMismatchException e) {
                    scanner.nextLine(); // Limpiar el buffer si es una letra
                    System.out.println("Error: Por favor, ingresa un número de posición válido (1-9).");
                    continue; // Volver al inicio del bucle de turnos
                }

                System.out.println("Has elegido la posición " + posicionElegida);

                // **CORRECCIÓN:** Revisar si la posición existe en el mapa (rango 1-9)
                if (!posiciones.containsKey(posicionElegida)) {
                    System.out.println("La posición elegida no se encuentra disponible. Elige un número en el rango de 1-9.");
                    continue; 
                }

                int index = posiciones.get(posicionElegida); 

                if (tablero[index] == 'x' || tablero[index] == 'o') {
                    System.out.println("La posición elegida ya ha sido tomada. Intenta otra.");
                    continue; 
                }
                
                // Aplicar el movimiento
                tablero[index] = jugador;

                mostrarTablero();
                
                if (hayGanador()) {
    System.out.println("¡Felicidades jugador " + jugadorNumero() + "! ¡Has ganado!");

    // SUMAR ESTADÍSTICA
    if (jugador == 'x') {
        victoriasJugador1++;
    } else {
        victoriasJugador2++;
    }

    break;
}
 if (tableroLleno()) {
    System.out.println("Ha sido un empate");

    // SUMAR EMPATE
    empates++;

    break;
}

                
                cambiar_jugador();
            } // Fin del bucle de turnos del juego
            
            // Después de que la partida termina (break), el código continúa aquí.
            // Se añade una línea para separar visualmente el final del juego del menú.
            System.out.println("----------------------- PARTIDA FINALIZADA ----------------------");
        } // Fin del bucle principal (vuelve a mostrar el menú)
    }
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
    private static boolean primeraVez = true;

    private static void mostrarTablero() {
        System.out.println("-------------");

        for (int i = 0; i < tablero.length; i++) {

            if (i % 3 == 0) System.out.print("| ");
            
            char mostrar = tablero[i];
            if (!primeraVez) {
            	if (mostrar != 'x' && mostrar != 'o') {
                mostrar = ' ';
            	}
            }


            System.out.print(mostrar + " | ");
            
           

            if (i % 3 == 2) {
                System.out.println();
                System.out.println("-------------");
            
            }
        }
        primeraVez = false;
    }
    private static boolean tableroLleno() {
    // Verificar si existe alguna casilla NO ocupada
    for (char c : tablero) {
        if (c != 'x' && c != 'o') {
            return false; // aún hay casillas disponibles
        }

    }
    return true;
}
    private static boolean hayGanador() {

        // Líneas horizontales
        if (tablero[0] == tablero[1] && tablero[1] == tablero[2]) return true;
        if (tablero[3] == tablero[4] && tablero[4] == tablero[5]) return true;
        if (tablero[6] == tablero[7] && tablero[7] == tablero[8]) return true;

        // Líneas verticales
        if (tablero[0] == tablero[3] && tablero[3] == tablero[6]) return true;
        if (tablero[1] == tablero[4] && tablero[4] == tablero[7]) return true;
        if (tablero[2] == tablero[5] && tablero[5] == tablero[8]) return true;

        // Líneas diagonales
        if (tablero[0] == tablero[4] && tablero[4] == tablero[8]) return true;
        if (tablero[2] == tablero[4] && tablero[4] == tablero[6]) return true;

        return false;
    }

    private static void mostrarEstadisticas() {
    System.out.println("========== ESTADÍSTICAS ==========");
    System.out.println("Victorias del Jugador 1 (X): " + victoriasJugador1);
    System.out.println("Victorias del Jugador 2 (O): " + victoriasJugador2);
    System.out.println("Empates: " + empates);
    System.out.println("==================================");
}


    }