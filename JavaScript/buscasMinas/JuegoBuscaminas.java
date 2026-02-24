package buscasMinas;

import java.util.Random;

class JuegoBuscaminas {

    private Casilla[][] tablero;
    private int filas;
    private int columnas;
    private int totalMinas;
    private boolean explosion;
    private boolean marcaIncorrecta;

    public void iniciarTablero(int nivel) {

        switch (nivel) {
            case 1: filas = 8; columnas = 8; totalMinas = 10; break;
            case 2: filas = 12; columnas = 12; totalMinas = 30; break;
            case 3: filas = 16; columnas = 16; totalMinas = 60; break;
            default: filas = 8; columnas = 8; totalMinas = 10;
        }

        tablero = new Casilla[filas][columnas];

        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                tablero[i][j] = new Casilla();

        colocarMinas();
        calcularMinasCercanas();

        explosion = false;
        marcaIncorrecta = false;
    }

    private void colocarMinas() {
        Random rand = new Random();
        int minasColocadas = 0;

        while (minasColocadas < totalMinas) {
            int f = rand.nextInt(filas);
            int c = rand.nextInt(columnas);

            if (!tablero[f][c].isTieneMina()) {
                tablero[f][c].setTieneMina(true);
                minasColocadas++;
            }
        }
    }

    private void calcularMinasCercanas() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (!tablero[i][j].isTieneMina()) {

                    int contador = 0;

                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {

                            int nf = i + x;
                            int nc = j + y;

                            if (nf >= 0 && nf < filas &&
                                nc >= 0 && nc < columnas &&
                                tablero[nf][nc].isTieneMina()) {

                                contador++;
                            }
                        }
                    }

                    tablero[i][j].setNumMinasCercanas(contador);
                }
            }
        }
    }

    public boolean descubrirCasilla(int f, int c) {

        if (!dentroLimites(f, c) ||
            !tablero[f][c].isEstaOculta() ||
            tablero[f][c].isEstaMarcada())
            return false;

        tablero[f][c].setEstaOculta(false);

        if (tablero[f][c].isTieneMina()) {
            explosion = true;
        }
        else if (tablero[f][c].getNumMinasCercanas() == 0) {
            descubrirRecursivo(f, c);
        }

        return true;
    }
    private void descubrirRecursivo(int f, int c) {

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {

                int nf = f + x;
                int nc = c + y;

                if (dentroLimites(nf, nc) &&
                    tablero[nf][nc].isEstaOculta() &&
                    !tablero[nf][nc].isTieneMina()) {

                    tablero[nf][nc].setEstaOculta(false);

                    if (tablero[nf][nc].getNumMinasCercanas() == 0) {
                        descubrirRecursivo(nf, nc);
                    }
                }
            }
        }
    }
    public boolean marcarCasilla(int f, int c) {

        if (!dentroLimites(f, c) ||
            !tablero[f][c].isEstaOculta() ||
            tablero[f][c].isEstaMarcada())
            return false;

        tablero[f][c].setEstaMarcada(true);

        if (!tablero[f][c].isTieneMina())
            marcaIncorrecta = true;

        return true;
    }

    private boolean dentroLimites(int f, int c) {
        return f >= 0 && f < filas &&
               c >= 0 && c < columnas;
    }

    public int causaTerminacionJuego() {

        if (tablero == null)
            return 0;

        if (explosion)
            return 2;

        if (marcaIncorrecta)
            return 3;

        int minasCorrectas = 0;

        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                if (tablero[i][j].isTieneMina() &&
                    tablero[i][j].isEstaMarcada())
                    minasCorrectas++;

        if (minasCorrectas == totalMinas)
            return 1;

        return 0;
    }

    public void imprimirTablero() {

        System.out.print("  ");
        for (int i = 0; i < columnas; i++)
            System.out.print((i + 1) + " ");
        System.out.println();

        for (int i = 0; i < filas; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < columnas; j++) {

                Casilla c = tablero[i][j];

                if (c.isEstaMarcada())
                    System.out.print("F ");
                else if (c.isEstaOculta())
                    System.out.print("- ");
                else if (c.isTieneMina())
                    System.out.print("* ");
                else
                    System.out.print(c.getNumMinasCercanas() + " ");
            }

            System.out.println();
        }
    }
}