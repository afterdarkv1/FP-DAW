public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String numeroSeguridadSocial;

    public Empleado(String nombre, String apellido, String numeroSeguridadSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    // Método abstracto (obliga a las clases hijas a implementarlo)
    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}