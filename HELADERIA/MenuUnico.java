package HELADERIA;

import java.util.Scanner;

public class MenuUnico {

    Scanner scn = new Scanner(System.in);

    // Función genérica para mostrar menús
    public int mostrarMenu(String titulo, String[] opciones) {
        System.out.println("");
        System.out.println("* " + titulo + " *");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println("*   " + (i + 1) + ". " + opciones[i] + "   *");
        }
        System.out.println("");

        System.out.print("👉 Digite su opción: ");
        int opc = scn.nextInt();
        return opc;
    }

    public void iniciar() {
        String[] menuPrincipal = {
            "Helado sencillo",
            "Helado doble",
            "Helado especial",
            "Helado de la casa",
            "Malteadas",
            "Postres fríos"
        };

        int opc = mostrarMenu("Bienvenido a Heladerías El Hielo", menuPrincipal);

        switch (opc) {
            case 1:
                mostrarMenu("Helados sencillos", new String[]{"Fresa", "Chocolate", "Vainilla", "Mango", "Café", "Menú principal"});
                break;
            case 2:
                mostrarMenu("Helados dobles", new String[]{"Doble fresa con galleta", "Doble chocolate con chips", "Doble vainilla con arequipe", "Doble mango con crema", "Menú principal"});
                break;
            case 3:
                mostrarMenu("Helados especiales", new String[]{"Copa helada con frutas", "Banana split", "Brownie con helado", "Sundae con toppings", "Menú principal"});
                break;
            case 4:
                mostrarMenu("Helados de la casa", new String[]{"3 sabores sorpresa", "Artesanal de coco", "Mixto con licor", "Premium gourmet", "Menú principal"});
                break;
            case 5:
                mostrarMenu("Malteadas", new String[]{"Fresa", "Chocolate", "Oreo", "Maní", "Menú principal"});
                break;
            case 6:
                mostrarMenu("Postres fríos", new String[]{"Brownie con helado", "Cheesecake frío", "Gelatina con crema", "Banana split", "Menú principal"});
                break;
            default:
                System.out.println("⚠️ Opción inválida");
                iniciar();
        }
    }
}
