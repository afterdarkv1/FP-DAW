package tresEnRayaObjeto;

public class Jugadores {

    String jugador1;
    String jugador2;
    Tablero tablero;

    public Jugadores() {
        jugador1 = "Jugador 1";
        jugador2 = "Jugador 2";
        tablero = new Tablero();
    }
    
    public String dameJugador1() {
    	return jugador1;
    }
    public String dameJugador2() {
    	return jugador2;
    }
    public void mueveJugador1(int pos) {
if (tablero.marcarCasilla(pos, 1)) {
            tablero.dibujarTablero();
        }
        if (tablero.ganaJugador1()) {
            System.out.println("¡Gana el Jugador 1 (X)!");
        }


    }

    public void mueveJugador2(int pos) {
     
       if (tablero.marcarCasilla(pos, 2)) {
            tablero.dibujarTablero();
        }
        if (tablero.ganaJugador2()) {
            System.out.println("¡Gana el Jugador 2 (O)!");
        }
    }
}
