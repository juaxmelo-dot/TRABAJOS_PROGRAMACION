package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENU CRUD EMPLEADOS =====");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Salir");
            System.out.println("6. Organizar nombres alfabéticamente");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (empleados.size() < 30) {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Género: ");
                        String genero = sc.nextLine();
                        System.out.print("Salario: ");
                        double salario = sc.nextDouble();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        empleados.add(new Empleado(nombre, cargo, genero, salario, edad));
                        System.out.println("Empleado agregado correctamente.");

                        OrganizadorNombres.ordenarEmpleados(empleados);

                    } else {
                        System.out.println("No se pueden agregar más empleados (máximo 30).");
                    }
                    break;

                case 2:
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("\n--- Lista de Empleados ---");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i+1) + ". " + empleados.get(i));
                        }
                    }
                    break;

                case 3:
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados para actualizar.");
                        break;
                    }
                    System.out.println("\n--- Lista de Empleados ---");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i+1) + ". " + empleados.get(i));
                    }
                    System.out.print("Ingrese el número del empleado a actualizar: ");
                    int pos = sc.nextInt() - 1;
                    sc.nextLine();

                    if (pos >= 0 && pos < empleados.size()) {
                        System.out.print("Nuevo nombre: ");
                        String nNombre = sc.nextLine();
                        System.out.print("Nuevo cargo: ");
                        String nCargo = sc.nextLine();
                        System.out.print("Nuevo género: ");
                        String nGenero = sc.nextLine();
                        System.out.print("Nuevo salario: ");
                        double nSalario = sc.nextDouble();
                        System.out.print("Nueva edad: ");
                        int nEdad = sc.nextInt();
                        sc.nextLine();

                        empleados.set(pos, new Empleado(nNombre, nCargo, nGenero, nSalario, nEdad));
                        System.out.println("Empleado actualizado correctamente.");
                        OrganizadorNombres.ordenarEmpleados(empleados);
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4:
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados para eliminar.");
                        break;
                    }
                    System.out.println("\n--- Lista de Empleados ---");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i+1) + ". " + empleados.get(i));
                    }
                    System.out.print("Ingrese el número del empleado a eliminar: ");
                    int posEliminar = sc.nextInt() - 1;
                    sc.nextLine();

                    if (posEliminar >= 0 && posEliminar < empleados.size()) {
                        empleados.remove(posEliminar);
                        System.out.println("Empleado eliminado correctamente.");
                        OrganizadorNombres.ordenarEmpleados(empleados);

                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                case 6:
                    OrganizadorNombres.ordenarEmpleados(empleados);

                    break;


                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
