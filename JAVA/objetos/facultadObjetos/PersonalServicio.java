package facultadObjetos;

public class PersonalServicio extends EmpleadosFacultad{
	private String seccion;
	public PersonalServicio(String nombre, String apellido,String dni,  String estadoCivil, String añoIncorporacion, int numeroDespacho) {
		super(nombre, apellido,dni, estadoCivil, añoIncorporacion, numeroDespacho);
		this.seccion = "a";
	}
	public PersonalServicio(String nombre, String apellido,String dni,  String estadoCivil, String añoIncorporacion, int numeroDespacho, String seccion) {
		super(nombre, apellido,dni, estadoCivil, añoIncorporacion, numeroDespacho);
		this.seccion = seccion;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	@Override
	public String toString() {
		return super.toString() + "[seccion=" + seccion + "]";
	}



}
