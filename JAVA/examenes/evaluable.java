package examenes;
/*Ejercicio 3. Diseñe un algoritmo mediante pseudocódigo o diagramas
de flujo (especifique las variables a usar, para qué sirven y su tipo de
dato) que pida dos números entre 0 y 100. Se debe controlar que los
valores son correctos (mostrando en caso contrario un mensaje de
error), es decir: que están comprendidos entre 0 y 100, y que los
números no son iguales. Se deben considerar los siguientes casos (2.5
puntos):
- En caso de que el primer número (A) sea menor que el
segundo (B) se mostrarán todos los números que van desde A
hasta B en orden creciente (Por ejemplo si los números leídos
son A=2 y B=5, se mostrará: 2,3,4,5).
- En caso de que el primer número (A) sea mayor que el segundo
(B) se mostrarán todos los números que van desde A hasta B
en orden decreciente (Por ejemplo si los números leídos son
A=5 y B=1, se mostrará: 5,4,3,2,1). */

import java.util.Scanner;

public class evaluable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
             System.out.print("Introduce un numero ");
             int numero1 = scanner.nextInt();
            System.out.print("Introduce un numero ");
             int numero2 = scanner.nextInt();

               if (numero1 < numero2) {
                for (int i = numero1; i <= numero2; i++) {
                    System.out.println(i);

              }
                
            } else {
                  for (int i = numero1; i >= numero2; i--) {
                    System.out.println(i);
         
             }
                         
            scanner.close();
                }
                
             }


    

        
    }
    

