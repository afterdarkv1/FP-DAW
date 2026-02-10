package tresEnRayaObjeto;

import java.util.Random;

public class TresEnRaya {

    private int[][] tablero;
    private Random random;

    // ===============================
    // CONSTRUCTOR
    // ===============================
    public TresEnRaya() {
        tablero = new int[3][3];
        random = new Random();
        iniciar();
    }

    // ===============================
    // REINICIAR TABLERO
    // ===============================
    public void iniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    // ===============================
    // MOVIMIENTOS
    // ===============================
    public boolean movimientoValido(int pos) {
        int fila = (pos - 1) / 3;
        int col = (pos - 1) % 3;
        return tablero[fila][col] == 0;
    }

    public void mueveJugador1(int pos) {
        if (movimientoValido(pos)) {
            int fila = (pos - 1) / 3;
            int col = (pos - 1) % 3;
            tablero[fila][col] = 1;
        }
    }

    public void mueveJugador2(int pos) {
        if (movimientoValido(pos)) {
            int fila = (pos - 1) / 3;
            int col = (pos - 1) % 3;
            tablero[fila][col] = 2;
        }
    }

    public void mueveOrdenador1() {
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        mueveJugador1(pos);
    }

    public void mueveOrdenador2() {
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        mueveJugador2(pos);
    }

    // ===============================
    // ESTADO DEL JUEGO
    // ===============================
    public boolean quedanMovimientos() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ganaJugador1() {
        return comprobarVictoria(1);
    }

    public boolean ganaJugador2() {
        return comprobarVictoria(2);
    }

    private boolean comprobarVictoria(int jugador) {

        // Filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador &&
                tablero[i][1] == jugador &&
                tablero[i][2] == jugador) {
                return true;
            }
        }

        // Columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador &&
                tablero[1][j] == jugador &&
                tablero[2][j] == jugador) {
                return true;
            }
        }

        // Diagonales
        if (tablero[0][0] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][2] == jugador) {
            return true;
        }

        if (tablero[0][2] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }

    // ===============================
    // DIBUJAR TABLERO
    // ===============================
    public void dibujaTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) System.out.print("_ ");
                if (tablero[i][j] == 1) System.out.print("X ");
                if (tablero[i][j] == 2) System.out.print("O ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
