package ejercicios;



import java.util.Scanner;



public class Capicua {



    static Scanner scanner = new Scanner(System.in);

    static String numero;



        public static void main(String[] args) {

            String numero = esNumerico();



   

            String numeroInvertido = invertirCadena(numero);



            if (numero.equals(numeroInvertido)) {

                System.out.println("El número " + numero + " es capicúa.");

            } else {

                System.out.println("El número " + numero + " no es capicúa.");

            }



            scanner.close();

        }



        public static String esNumerico() {

            while (true) {

                System.out.println("Introduce un número:");

                if (scanner.hasNextInt()) {

                    int numero = scanner.nextInt();

                    return String.valueOf(numero);

                } else {

                    System.out.println("El valor introducido no es un número entero");

                    scanner.next();

                }

            }

        }

        

        

        public static String invertirCadena1(String texto) {

            String cadenaInvertida= "";

            for(int i = numero.length()-1; i>0; i++) {

            	cadenaInvertida += numero.charAt(i);

            }

            return cadenaInvertida;

        }
        public static String invertirCadena(String texto) {

            return new StringBuilder(texto).reverse().toString();

        }

    }

