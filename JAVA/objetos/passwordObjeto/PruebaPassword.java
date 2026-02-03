package passwordObjeto;

import java.util.Scanner;

public class PruebaPassword {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Introduce el número de passwords: ");
		        int tamaño = sc.nextInt();

		  

		        Password[] pwd = new Password[tamaño];
		        boolean[] fuertes = new boolean[tamaño];

		        for (int i = 0; i < tamaño; i++) {
		            pwd[i] = new Password();
		            fuertes[i] = pwd[i].esFuerte();
		        }

		        for (int i = 0; i < tamaño; i++) {
		            System.out.println(pwd[i].damePassword() + " " + fuertes[i]);
		        }


	}
}
