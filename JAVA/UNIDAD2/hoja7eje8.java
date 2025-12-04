package UNIDAD2;

import java.util.Scanner;

public class hoja7eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);


            if (c >= 'A' && c <= 'Z') {
                resultado += (char)(c + 32); 
            }
        
            else if (c >= 'a' && c <= 'z') {
                resultado += (char)(c - 32);        
                }
            else {
                resultado += c;
            }
        }

        System.out.println("Cadena convertida: " + resultado);
    }
}
