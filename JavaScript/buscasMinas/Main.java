package buscasMinas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JuegoBuscaminas juego = new JuegoBuscaminas();
        boolean juegoConfigurado = false;
        int opcion;

        do {
            System.out.println("==== BUSCAMINAS ====");
            System.out.println("1. Instrucciones");
            System.out.println("2. Configurar juego");
            System.out.println("3. Nuevo juego");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Descubre casillas con 'd fila col'.");
                    System.out.println("Marca minas con 'm fila col'.");
                    break;

                case 2:
                    System.out.println("1. Principiante");
                    System.out.println("2. Amateur");
                    System.out.println("3. Avanzado");

                    int nivel = sc.nextInt();
                    juego.iniciarTablero(nivel);
                    juegoConfigurado = true;
                    break;

                case 3:
                    if (!juegoConfigurado) {
                        System.out.println("Iniciando modo PRINCIPIANTE por defecto...");
                        juego.iniciarTablero(1);
                        juegoConfigurado = true;
                    }
                    jugar(juego, sc);
                    break;
            }

        } while (opcion != 4);
    }

    private static void jugar(JuegoBuscaminas juego, Scanner sc) {

        while (juego.causaTerminacionJuego() == 0) {

            juego.imprimirTablero();

            System.out.println("Introduce acción (d fila col / m fila col):");

            String accion = sc.next();
            int f = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            if (accion.equals("d"))
                juego.descubrirCasilla(f, c);
            else if (accion.equals("m"))
                juego.marcarCasilla(f, c);
        }

        juego.imprimirTablero();

        int resultado = juego.causaTerminacionJuego();

        if (resultado == 1)
            System.out.println("¡HAS GANADO!");
        else if (resultado == 2)
            System.out.println("¡BOOM! Has descubierto una mina.");
        else if (resultado == 3)
            System.out.println("Has marcado una casilla incorrecta.");
    }
}