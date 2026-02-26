package empleadosAbstraccion;

public class EmpleadoPorComision extends Empleado {

    private double ventas;
    private double comision;

    public EmpleadoPorComision(String nombre, String apellido, String nss,
                                double ventas, double comision) {
        super(nombre, apellido, nss);
        this.ventas = ventas;
        this.comision = comision;
    }
  /*  public EmpleadoPorComision(String nombre, String apellido, String nss,
            double ventas, double comision, double salarioBase) {
    	super(nombre, apellido, nss);
    	this.ventas = ventas;
    	this.comision = comision;
    	this.salarioBase = 0;
    }
*/

    @Override
    public double calcularSalario() {
        return ventas * comision;
    }

	@Override
	public String toString() {
		return "EmpleadoPorComision [ventas=" + ventas + ", comision=" + comision + "]";
	}
}