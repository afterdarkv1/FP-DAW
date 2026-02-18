package facultadObjetos;

public class Profesor extends EmpleadosFacultad {
	String departamento;
	public Profesor(String nombre, String apellido, String dni, String estadoCivil, String añoIncorporacion, int numeroDespacho) {
		super(nombre, apellido,dni, estadoCivil, añoIncorporacion, numeroDespacho);
		this.departamento = "departamento 2";
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return super.toString() + "Profesor [departamento=" + departamento + "]";
	}


	
	

}
