package JAVA.ejercicios;
//Que eleve un número cualquiera a una potencia cualquiera, mostrar en pantalla el
//resultado, se debe utilizar la recursividad.

public class recursividad21 {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        int resultado = elevarAPotencia(base, exponente);
        System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultado);
    }
    public static int elevarAPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a la potencia de 0 es 1
        } else {
            return base * elevarAPotencia(base, exponente - 1);
        }
    }
    
}
