package funciones;

public class dosarray5pocisionesylasumasealmeceneenelprimero {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        sumarArraysYGuardarEnPrimero(a,b);

        System.out.println("suma en el array a: ");
        for ( int i = 0; i < a.length; i++ ) {
            System.out.println( a[i] + " " );
        }
    }

    public static void sumarArraysYGuardarEnPrimero(int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            a[i] = a[i] + b[i];
        }
    }   
    
}
