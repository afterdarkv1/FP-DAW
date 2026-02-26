public class PruebaEmpleados {
    /*¿Por qué es mejor usar abstracción en este ejercicio?
1️⃣ Porque no existe un “Empleado” genérico real

En el problema no sabemos cómo cobra un empleado genérico.
Solo sabemos cómo cobran:

Empleado por comisión

Empleado base + comisión

Entonces, crear un objeto Empleado normal permitiría hacer algo que no tiene sentido conceptual. */

    public static void main(String[] args) {

        Empleado e1 = new EmpleadoPorComision("Juan", "Pérez", "111A", 5000, 0.10);
        Empleado e2 = new EmpleadoPorComision("Ana", "López", "222B", 3000, 0.15);

        Empleado e3 = new EmpleadoBaseMasComision("Carlos", "Gómez", "333C",
                                                  1000, 4000, 0.05);
        Empleado e4 = new EmpleadoBaseMasComision("Laura", "Martínez", "444D",
                                                  1200, 2000, 0.08);

        Empleado[] empleados = {e1, e2, e3, e4};

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e +
                               " | Salario: " + e.calcularSalario());
        }
    }
}