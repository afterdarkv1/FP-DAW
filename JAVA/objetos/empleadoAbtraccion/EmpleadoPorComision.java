public class EmpleadoPorComision extends Empleado {

    private double ventas;
    private double comision;

    public EmpleadoPorComision(String nombre, String apellido, String nss,
                                double ventas, double comision) {
        super(nombre, apellido, nss);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return ventas * comision;
    }
}