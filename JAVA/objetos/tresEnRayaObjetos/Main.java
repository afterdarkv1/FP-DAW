package tresEnRayaObjeto;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcion;

        do {
            System.out.println("Bienvenido al Tres en Raya");
            System.out.println("1. Jugador contra jugador");
            System.out.println("2. Jugador contra máquina");
            System.out.println("3. Máquina contra máquina");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {

                // ===============================
                // JUGADOR VS JUGADOR
                // ===============================
                case 1: {
                    TresEnRaya juego = new TresEnRaya();
                    boolean turno = random.nextBoolean();

                    while (true) {

                        juego.dibujaTablero();

                        System.out.println(
                            turno
                            ? "Turno Jugador 1 (X):"
                            : "Turno Jugador 2 (O):"
                        );

                        int pos = scanner.nextInt();

                        if (juego.movimientoValido(pos)) {
                            if (turno) {
                                juego.mueveJugador1(pos);
                            } else {
                                juego.mueveJugador2(pos);
                            }
                            turno = !turno;
                        }

                        if (juego.ganaJugador1()) {
                            juego.dibujaTablero();
                            System.out.println("Gana el Jugador 1 (X)");
                            break;
                        }
                        if (juego.ganaJugador2()) {
                            juego.dibujaTablero();
                            System.out.println("Gana el Jugador 2 (O)");
                            break;
                        }
                        if (!juego.quedanMovimientos()) {
                            juego.dibujaTablero();
                            System.out.println("Empate");
                            break;
                        }
                    }
                    break;
                }

                // ===============================
                // JUGADOR VS MÁQUINA
                // ===============================
                case 2: {
                    TresEnRaya juego = new TresEnRaya();
                    boolean turno = random.nextBoolean();

                    while (true) {

                        juego.dibujaTablero();

                        if (turno) {
                            System.out.println("Tu turno (X):");
                            int pos = scanner.nextInt();
                            if (juego.movimientoValido(pos)) {
                                juego.mueveJugador1(pos);
                                turno = false;
                            }
                        } else {
                            System.out.println("Turno de la máquina...");
                            juego.mueveOrdenador2();
                            turno = true;
                        }

                        if (juego.ganaJugador1()) {
                            juego.dibujaTablero();
                            System.out.println("Has ganado");
                            break;
                        }
                        if (juego.ganaJugador2()) {
                            juego.dibujaTablero();
                            System.out.println("Has perdido");
                            break;
                        }
                        if (!juego.quedanMovimientos()) {
                            juego.dibujaTablero();
                            System.out.println("Empate");
                            break;
                        }
                    }
                    break;
                }

                // ===============================
                // MÁQUINA VS MÁQUINA
                // ===============================
                case 3: {
                    TresEnRaya juego = new TresEnRaya();
                    boolean turno = true;

                    while (true) {

                        if (turno) {
                            juego.mueveOrdenador1();
                        } else {
                            juego.mueveOrdenador2();
                        }

                        juego.dibujaTablero();
                        turno = !turno;

                        if (juego.ganaJugador1()) {
                            System.out.println("Gana Ordenador 1 (X)");
                            break;
                        }
                        if (juego.ganaJugador2()) {
                            System.out.println("Gana Ordenador 2 (O)");
                            break;
                        }
                        if (!juego.quedanMovimientos()) {
                            System.out.println("Empate");
                            break;
                        }
                    }
                    break;
                }
            }

        } while (opcion != 0);

        scanner.close();
    }
}
