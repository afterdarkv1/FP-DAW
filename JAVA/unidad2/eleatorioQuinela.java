package UNIDAD2;

import java.util.Random;

public class eleatorioQuinela {
	/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas). */

		    public static void main(String[] args) {
		        Random rand = new Random();
		        int partidos = 14; // número de partidos de la quiniela
		        String[] resultados = {"1", "X", "2"}; // 1 = local, X = empate, 2 = visitante

		        System.out.println("Resultados de la quiniela:");

		        for (int i = 1; i <= partidos; i++) {
		            int indice = rand.nextInt(resultados.length); // elige un resultado aleatorio
		            System.out.println("Partido " + i + ": " + resultados[indice]);
		        }
		    }
		}

