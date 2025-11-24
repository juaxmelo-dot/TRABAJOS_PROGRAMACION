package CRUD;

import java.util.ArrayList;

public class OrganizadorNombres {

    public static void ordenarEmpleados(ArrayList<Empleado> empleados) {
        if (!empleados.isEmpty()) {
            ordenarRecursivo(empleados, 0, empleados.size() - 1);
        }
    }

    // Ordenamiento recursivo (quicksort) basado en el nombre
    private static void ordenarRecursivo(ArrayList<Empleado> lista, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int i = izquierda;
            int j = derecha;
            String pivote = lista.get((izquierda + derecha) / 2).nombre;

            while (i <= j) {
                while (lista.get(i).nombre.compareToIgnoreCase(pivote) < 0) i++;
                while (lista.get(j).nombre.compareToIgnoreCase(pivote) > 0) j--;
                if (i <= j) {
                    Empleado temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                    i++;
                    j--;
                }
            }

            ordenarRecursivo(lista, izquierda, j);
            ordenarRecursivo(lista, i, derecha);
        }
    }
}
