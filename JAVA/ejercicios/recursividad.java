package JAVA.ejercicios;
// Que muestre por pantalla los números del 1 al 100, utilizar recursividad
public class recursividad {
 
    public static void main(String[] args) {
            int n = 1;
            mostrarNumeros(n);


    }
       public static void mostrarNumeros(int n)  { 
                if (n==100) {
                    System.out.println("hemos terminado");
        }
        else {
            System.out.println(n);
            mostrarNumeros(n+1);
        }
    }
}
     