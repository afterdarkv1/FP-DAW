package funciones;

public class dosArrayde5ysumarenotrofuncion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        int [] resultado = sumarArrays(a,b);
        System.out.println("Array resultante de la suma: ");
        for ( int i = 0; i < resultado.length; i++ ) {
            System.out.println( resultado[i] + " " );
        }
        

        
    }
    public static int[] sumarArrays(int[] a, int[] b) {
        int[] resultado = new int [5];
        for (int i = 0; i < 5; i++ ) { 
           resultado[i] = a[i] + b[i]; 
        }
        return resultado;
    }

}