package UNIDAD2;


import java.util.Random;

public class quinela {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] signos = {"1", "X", "2"};

        for (int i = 1; i <= 14; i++) {
            System.out.print(signos[rand.nextInt(3)] + " ");
            System.out.print(signos[rand.nextInt(3)] + " ");
            System.out.println(signos[rand.nextInt(3)]);
        }

    }
}

