package facultadObjetos;

public class PersonalServicioService {
	   public static PersonalServicio crearPersonaServicio() {

	        System.out.println("Nombre:");
	        String nombre = Main.scanner.nextLine();
	        System.out.println("Apellido:");
	        String apellido = Main.scanner.nextLine();

	        System.out.println("DNI:");
	        String dni = Main.scanner.nextLine();

	        System.out.println("Estado civil:");
	        String estadoCivil = Main.scanner.nextLine();

	        System.out.println("Año incorporación:");
	        String añoIncorporacion = Main.scanner.nextLine();

	        System.out.println("Número despacho:");
	        int numeroDespacho = Main.scanner.nextInt();

	        System.out.println("Seccion:");
	        String seccion = Main.scanner.nextLine();

	        return new PersonalServicio(nombre, apellido, dni, estadoCivil,
	                            añoIncorporacion, numeroDespacho, seccion);
	    }

}
