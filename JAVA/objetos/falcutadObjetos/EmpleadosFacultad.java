package facultadObjetos;


public class EmpleadosFacultad extends Persona{ 
	String AñoIncorporacion;
	int numeroDepacho;
	
	public EmpleadosFacultad(String nombre, String apellido,String dni,  String estadoCivil, String añoIncorporacion, int numeroDespacho) {
	super(nombre, apellido,dni, estadoCivil);
	AñoIncorporacion = añoIncorporacion;
	numeroDepacho = numeroDespacho;
	
}

	public String getAñoIncorporacion() {
		return AñoIncorporacion;
	}

	public void setAñoIncorporacion(String añoIncorporacion) {
		AñoIncorporacion = añoIncorporacion;
	}

	public int getNumeroDepacho() {
		return numeroDepacho;
	}

	public void setNumeroDepacho(int numeroDepacho) {
		this.numeroDepacho = numeroDepacho;
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadosFacultad [AñoIncorporacion=" + AñoIncorporacion + ", numeroDespacho=" + numeroDepacho + "]";
	}

	}


