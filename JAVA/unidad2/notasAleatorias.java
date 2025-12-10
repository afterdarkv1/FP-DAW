package UNIDAD2;

import java.util.Random;

public class notasAleatorias {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] notas = {"suspenso", "suficiente", "bien", "notable", "sobresaliente"};
        int[] contador = new int[notas.length];

        for (int i = 0; i < 20; i++) {
            int n = rand.nextInt(notas.length);
            System.out.println(notas[n]);
            contador[n]++;
        }


        for (int i = 0; i < notas.length; i++)
            System.out.println(notas[i] + ": " + contador[i]);
    }
}


