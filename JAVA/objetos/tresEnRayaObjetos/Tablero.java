package tresEnRayaObjeto;

public class Tablero {
    private int[][] tablero;

    public Tablero() {
        tablero = new int[3][3];
    }

    public void dibujarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j] == 0) {
                    System.out.print("_ ");
                } else if (tablero[i][j] == 1) {
                    System.out.print("X ");
                } else if (tablero[i][j] == 2) {
                    System.out.print("O ");
                }

            }
            System.out.println();
        }
    }

    public boolean marcarCasilla(int pos, int jugador) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;

        if (tablero[fila][columna] == 0) {
            tablero[fila][columna] = jugador;
            return true;
        } else {
            System.out.println("La casilla ya está ocupada");
            return false;
        }
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

        // Diagonal principal
        if (tablero[0][0] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][2] == jugador) {
            return true;
        }

        // Diagonal secundaria
        if (tablero[0][2] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }


}
