package UNIDAD2;

import java.util.Iterator;
import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
			String num = scanner.nextLine();
			String numInvertido = "";
		for (int i = num.length() - 1; i >= 0; i--) {
            numInvertido += num.charAt(i);
        }
		System.out.println(numInvertido);
		
	if (numInvertido.equals(num)) {
		System.out.println("es capicua");
	}
	else {
		System.out.println("no es capicua");
	}
	

}
	public static boolean esNumero(String cad) {
		String numeros="0123456789";
	for (int i = 0; i<num.length(); i++) {
				
}
	}