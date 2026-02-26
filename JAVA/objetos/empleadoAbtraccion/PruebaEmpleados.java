package empleadosAbstraccion;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class PruebaEmpleados {

    /*Porque no existe un “Empleado” genérico real
En el problema no sabemos cómo cobra un empleado genérico.
Solo sabemos cómo cobran:
Empleado por comisión
Empleado base + comisión
Entonces, crear un objeto Empleado normal permitiría hacer algo que no tiene sentido conceptual. */
    public static void main(String[] args) {
  
    	Scanner scanner = new Scanner(System.in);

        Empleado e1 = new EmpleadoPorComision("Juan", "Pérez", "111A", 5000, 0.10);
        Empleado e2 = new EmpleadoPorComision("Ana", "López", "222B", 3000, 0.15);

        Empleado e3 = new EmpleadoBaseMasComision("Carlos", "Gómez", "333C",
                                                  1000, 4000, 0.05);
        Empleado e4 = new EmpleadoBaseMasComision("Laura", "Martínez", "444D",
                                                  1200, 2000, 0.08);

        Empleado[] empleados = {e1, e2, e3, e4};
        System.out.println("1. empleado base mas comision");
        System.out.println("2. empleado base mas EmpleadoPorComision");
        System.out.println("3. dar de alta un EmpleadoPorComision");
        System.out.println("4. dar de alta un EmpleadoBaseMasComision");
        String opcion = scanner.nextLine();
        if(opcion.equalsIgnoreCase("1")) {
        	for (int i = 0; i < empleados.length; i++) {
        		if (empleados[i] instanceof EmpleadoPorComision) {
        		   System.out.println(empleados[i].toString());
				}
        		}
        }
        else if (opcion.equalsIgnoreCase("2")) {
        	for (int i = 0; i < empleados.length; i++) {
        		if (empleados[i] instanceof EmpleadoBaseMasComision) {
        		   System.out.println(empleados[i].toString());
				}
        		}
        	
        }
        else if (opcion.equalsIgnoreCase("3")) {

        			System.out.println("introduce nombre");
        			String nombre = scanner.nextLine();
        			System.out.println("introduce apellido");
        			String apellido = scanner.nextLine();
        			System.out.println("introduce numerod de seguridad social");
        			String nss = scanner.nextLine();
        			System.out.println("ventas");
        			double nrventas = scanner.nextDouble();
        			System.out.println("comision");
        			double comision = scanner.nextDouble();
        			
        	
        }
        else

        for (Empleado empleado: empleados) {
            System.out.println("Empleado: " + empleado +
                               " | Salario: " + empleado.calcularSalario()+ "$");
        }
    }
}