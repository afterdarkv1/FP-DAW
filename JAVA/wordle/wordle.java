package wordle;
import java.util.Random;
import java.util.Scanner;

public class wordle {
    static String palabraSecreta;
    static int numIntentosConsumidos;
    static int numLetrasAdivinadas;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int jugadorVictorias = 0;
        int maquinaVictorias = 0;
        int partidasJugadas = 0;
        System.out.println("Bienvenid@ al juego de Wordle.");
        boolean seguirJugando = true;
        while (seguirJugando) {
            iniciarPartida();
            jugarPartida();
            partidasJugadas++;
            if (haGanadoJugador()) {
                jugadorVictorias++;
                System.out.println("¡Has ganado la partida!");
            } else {
                maquinaVictorias++;
                System.out.println("Has perdido la partida");
            }
            System.out.println("Tú: " + jugadorVictorias + " puntos");
            System.out.println("Máquina: " + maquinaVictorias + " puntos");
            System.out.println("Total de partidas: " + partidasJugadas);
            System.out.print("¿Deseas jugar otra partida? (s/n): ");
            char opc;
            do {
                opc = entrada.nextLine().charAt(0);
                if (opc != 's' && opc != 'n' && opc != 'S' && opc != 'N') System.out.println("Opción no válida");
            } while (opc != 'n' && opc != 's' && opc != 'S' && opc != 'N');
            seguirJugando = opc == 's' || opc == 'S';
        }

        System.out.println("Fin del juego");
    }

    public static void iniciarPartida() {
        palabraSecreta = generaPalabra();
        numIntentosConsumidos = 0;
        numLetrasAdivinadas = 0;
    }

    public static void jugarPartida() {
        while (!haTerminadoJuego() && !haGanadoJugador()) {
            String intento = pedirPalabra();
            char [] resultado = new char[5];
            String palabra = compruebaLetrasAcertadas(intento,resultado);
            System.out.println(palabra);
            numIntentosConsumidos++;
        }
    }

    public static boolean haGanadoJugador() {
        return numLetrasAdivinadas == 5;
    }

    public static boolean haTerminadoJuego() {
        return numIntentosConsumidos >= 6;
    }

    public static String compruebaLetrasAcertadas(String intento, char[] resultado) {
        intento = intento.toLowerCase();
        String secreta = palabraSecreta.toLowerCase();
        numLetrasAdivinadas = 0;
        for (int i = 0; i < 5; i++) {
            char letra = intento.charAt(i);

            if (letra == secreta.charAt(i)) {
                resultado[i] = Character.toUpperCase(letra);
                numLetrasAdivinadas++;
            }
            else {
                boolean encontrada = false;
                for (int j = 0; j < 5; j++) {
                    if (letra == secreta.charAt(j)) {
                        encontrada = true;
                        break;
                    }
                }
                if (encontrada) {
                    resultado[i] = letra;
                }
                else resultado[i] = '*';
            }
        }
        String nuevo = "";
        for (int i = 0; i < resultado.length; i++) {
            nuevo = nuevo + resultado[i];
        }
        return nuevo;
    }

    public static String generaPalabra() {
        String[] palabras = {
                "vuela", "pasea", "ronca", "juega", "rodea",
                "carro", "coche", "plaza", "cielo", "nubes",
                "brisa", "techo", "vapor", "clase", "rueda",
                "noche", "beber", "rombo", "gamba", "playa",
        };
        Random r = new Random();
        return palabras[r.nextInt(palabras.length)];
    }

    public static String pedirPalabra() {
        String palabra;
        do {
            System.out.print("Introduce una palabra de 5 letras: ");
            palabra = entrada.nextLine();
        } while (!palabraValida(palabra));
        return palabra;
    }

    public static boolean palabraValida(String palabra) {
        palabra = palabra.toLowerCase();
        // 1. Comprobar longitud
        if (palabra.length() != 5) {
            System.out.println("Error: la palabra debe tener exactamente 5 letras.");
            return false;
        }
        int vocales = 0;
        int consonantesSeguidas = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            // 2. Comprobar que solo sean letras
            if (c < 'a' || c > 'z') {
                System.out.println("Error: solo letras.");
                return false;
            }
            // 3. Contar vocales y consonantes seguidas
            if (esVocal(c)) {
                vocales++;
                consonantesSeguidas = 0;
                // 4. Dos vocales iguales seguidas
                if (i > 0 && c == palabra.charAt(i - 1)) {
                    System.out.println("Error: no puede haber dos vocales iguales seguidas.");
                    return false;
                }
            }
            else {
                consonantesSeguidas++;
                if (consonantesSeguidas > 3) {
                    System.out.println("Error: la palabra no puede tener más de 3 consonantes seguidas.");
                    return false;
                }
            }
        }
        // 5. Comprobar número de vocales
        if (vocales < 2 || vocales > 3) {
            System.out.println("Error: debe tener entre 2 y 3 vocales.");
            return false;
        }
        // 6. No terminar en q, w o x
        char ultima = palabra.charAt(4);
        if (ultima == 'q' || ultima == 'w' || ultima == 'x') {
            System.out.println("Error: no puede terminar en q, w o x.");
            return false;
        }
        return true;
    }
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}