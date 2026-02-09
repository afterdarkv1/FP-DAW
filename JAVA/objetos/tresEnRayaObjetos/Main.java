package tresEnRayaObjeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Jugadores juego = new Jugadores();
        int pos1 = 1;
        int pos2 = 2;
        do {
        	try {
        		System.out.println("introduce un numero del 1 al 9 " + juego.dameJugador1()+ " (pulsa 0 para salir)");
            	if(scanner.hasNextInt()) {
            		pos1 = scanner.nextInt();
                    juego.mueveJugador1(pos1);
            	}
            	else {
            		System.out.println("debes de introducir un numero");	
            		scanner.next();
            	}

                
                System.out.println("introduce un numero del 1 al 9 " + juego.dameJugador2() + " (pulsa 0 para salir)");
            	if(scanner.hasNextInt()) {
            		pos2 = scanner.nextInt();
            		juego.mueveJugador2(pos2);
            	}
            	else {
            		System.out.println("debes de introducir un numero");	
            		scanner.next();
            	}
      
                
				
			} catch (Exception e) {
				if(pos1 == 0 || pos2 == 0) {
					System.out.println("saliendo del programa");
				}
				else {
					System.out.println("rango incorrecto");
					
				}
			
			}
        
        } while( pos1 != 0 && pos2 !=0);



    }

}
