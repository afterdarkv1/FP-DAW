package UNIDAD2;

import java.util.Scanner;

public class hoja7eje11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu email:");
        String correo = scanner.nextLine();

        if (emailValido(correo)) {
            System.out.println("El email está bien formado.");
        } else {
            System.out.println("El email NO es válido.");
        }
    }

    public static boolean emailValido(String correo) {
        return tieneSoloUnaArroba(correo)
                && noTieneEspacios(correo)
                && noTienePuntosSeguidosDespuesArroba(correo);
    }


    public static boolean tieneSoloUnaArroba(String correo) {
        int primera = correo.indexOf('@');
        int ultima = correo.lastIndexOf('@');


        if (primera == -1) return false;


        return primera == ultima;
    }

    public static boolean noTieneEspacios(String correo) {
        return correo.indexOf(' ') == -1;
    }


    public static boolean noTienePuntosSeguidosDespuesArroba(String correo) {

        int posArroba = correo.indexOf('@');

        if (posArroba == -1) return false;  

        int posPuntosSeguidos = correo.indexOf("..", posArroba);

        return posPuntosSeguidos == -1;
    }
}
