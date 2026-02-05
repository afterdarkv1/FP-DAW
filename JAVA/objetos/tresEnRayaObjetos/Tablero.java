package tresEnRayaObjetos;

public class Tablero {
	private int[][] tablero;
	
	public Tablero() {
		tablero = new int[3][3];
		
	}
	
	public void dibujarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				 tablero[i][j] = 0;
				 if(tablero[i][j] == 0) {
				 System.out.print("_"+ " ");
				 }
			}
			System.out.println();
		}
		
	}

}

