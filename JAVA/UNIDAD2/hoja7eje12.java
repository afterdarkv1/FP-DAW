package UNIDAD2;

import java.util.Scanner;


public class hoja7eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Máximo 10 productos
        String[] nombres = new String[10];
        double[] precios = new double[10];
        int[] stocks = new int[10];
        int cantidadProductos = 0;

        int opcion;

        do {
            System.out.println("\n--- MENU TIENDA ---");
            System.out.println("1. Dar de alta producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Modificar stock y precio");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    if (cantidadProductos == 10) {
                        System.out.println("No se pueden añadir más productos (límite 10).");
                        break;
                    }

                    System.out.print("Introduce nombre del producto: ");
                    String nombre = sc.nextLine();

                    // comprobar si existe ya
                    boolean existe = false;
                    for (int i = 0; i < cantidadProductos; i++) {
                        if (nombres[i].equalsIgnoreCase(nombre)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("ERROR: Ese producto ya existe.");
                    } else {
                        System.out.print("Introduce precio: ");
                        double precio = sc.nextDouble();

                        System.out.print("Introduce stock: ");
                        int stock = sc.nextInt();
                        sc.nextLine();

                        // Guardar datos
                        nombres[cantidadProductos] = nombre;
                        precios[cantidadProductos] = precio;
                        stocks[cantidadProductos] = stock;
                        cantidadProductos++;

                        System.out.println("Producto añadido correctamente.");
                    }
                    break;

                case 2:
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < cantidadProductos; i++) {
                        if (nombres[i].equalsIgnoreCase(buscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Precio: " + precios[i]);
                            System.out.println("Stock: " + stocks[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Producto NO encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce el nombre del producto a modificar: ");
                    String modificar = sc.nextLine();
                    boolean modificado = false;

                    for (int i = 0; i < cantidadProductos; i++) {
                        if (nombres[i].equalsIgnoreCase(modificar)) {
                            System.out.print("Nuevo precio: ");
                            precios[i] = sc.nextDouble();

                            System.out.print("Nuevo stock: ");
                            stocks[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Producto modificado correctamente.");
                            modificado = true;
                            break;
                        }
                    }

                    if (!modificado) {
                        System.out.println("Producto NO encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}
