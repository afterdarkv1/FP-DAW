package arrays;
import java.util.Scanner;
public class pedir10numerosarrayyhaceraritmeticas {
    public static void main(String[] args) {
        int suma = 0;
        int restar = 0;
        int multiplicar = 1;
        double dividir = 0;
        boolean divisionValida = true;
        int[] numeros = new int[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce el número : ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            suma += numeros[i];
            restar -= numeros[i];
            multiplicar *= numeros[i];

    
                       
            if (numeros[i] == 0) {
                divisionValida = false;
            } else {
                dividir /= numeros[i];

            }
        
        }

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + restar);
        System.out.println("La multiplicación de los números es: " + multiplicar);
        if (divisionValida) {
            System.out.println("La división  de los números es: " + dividir);
        } else {
            System.out.println("no se puede dividir entr 0.");
        }
        scanner.close();

    
}
}