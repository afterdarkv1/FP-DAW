package empleadosAbstraccion;

public class EmpleadoBaseMasComision extends Empleado {

    private double salarioBase;
    private double ventas;
    private double comision;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss,
                                   double salarioBase, double ventas, double comision) {
        super(nombre, apellido, nss);
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.comision = comision;
    }
   // public EmpleadoBaseMasComision(String nombre, String apellido, String nss,double salarioBase, double ventas, double comision) {
    //	super(nombre, apellido, nss, salarioBase);
    //	this.salarioBase = salarioBase;
    //	this.ventas = ventas;
    //	this.comision = comision;
    //	}

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * comision);
    }

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [salarioBase=" + salarioBase + ", ventas=" + ventas + ", comision=" + comision
				+ "]";
	}
}