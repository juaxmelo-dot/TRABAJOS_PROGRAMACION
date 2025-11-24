package HELADERIA;

import java.util.Scanner;

public class MenuHeladeria {
   
    Scanner scn = new Scanner(System.in);

    public void mostrarMenu() {
        int opc = 0;

        System.out.println("");
        System.out.println("*  Bienvenido a Heladerias el Hielo  *");
        System.out.println("*        1. Helado sencillo          *");
        System.out.println("*        2. Helado doble             *");
        System.out.println("*        3. Helado especial          *");
        System.out.println("*        4. Helado de la casa        *");
        System.out.println("*        5. Malteadas                *");
        System.out.println("*        6. Postres fríos            *");
        System.out.println("");
        System.out.println("*       Por favor digite su opción   *");
        System.out.println("");

        opc = scn.nextInt();

        mostrardescripción(opc);
    }

    public void mostrarmen1() {
        int opc1 = 0 ;
        System.out.println("");
        System.out.println("*         1. Helado de fresa         *");
        System.out.println("*         2. Helado de chocolate     *");
        System.out.println("*         3. Helado de vainilla      *");
        System.out.println("*         4. Helado de mango         *");
        System.out.println("*         5. Helado de café          *");
        System.out.println("*         6. Menú principal          *");
        System.out.println("");

        opc1 = scn.nextInt();
        switch (opc1) {
            case 1: case 2: case 3: case 4: case 5:
                mostrarmen11();
                break;
            case 6:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }

    public void mostrarmen2() {
        int opc2 = 0 ;
        System.out.println("");
        System.out.println("*     1. Doble fresa con galleta     *");
        System.out.println("*     2. Doble chocolate con chips   *");
        System.out.println("*     3. Doble vainilla con arequipe *");
        System.out.println("*     4. Doble mango con crema       *");
        System.out.println("*     5. Menú principal              *");
        System.out.println("");

        opc2 = scn.nextInt();
        switch (opc2) {
            case 1: case 2: case 3: case 4:
                mostrarmen11();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }
    
    public void mostrarmen3() {
        int opc3 = 0 ;
        System.out.println("");
        System.out.println("*   1. Copa helada con frutas        *");
        System.out.println("*   2. Helado banana split           *");
        System.out.println("*   3. Helado brownie con helado     *");
        System.out.println("*   4. Sundae con toppings           *");
        System.out.println("*   5. Menú principal                *");
        System.out.println("");

        opc3 = scn.nextInt();
        switch (opc3) {
            case 1: case 2: case 3: case 4:
                mostrarmen11();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }

    public void mostrarmen4() {
        int opc4 = 0 ;
        System.out.println("");
        System.out.println("*   1. Helado 3 sabores sorpresa     *");
        System.out.println("*   2. Helado artesanal de coco      *");
        System.out.println("*   3. Helado mixto con licor        *");
        System.out.println("*   4. Helado premium gourmet        *");
        System.out.println("*   5. Menú principal                *");
        System.out.println("");

        opc4 = scn.nextInt();
        switch (opc4) {
            case 1: case 2: case 3: case 4:
                mostrarmen11();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }

    public void mostrarmen5() {
        int opc5 = 0 ;
        System.out.println("");
        System.out.println("*   1. Malteada de fresa             *");
        System.out.println("*   2. Malteada de chocolate         *");
        System.out.println("*   3. Malteada de Oreo              *");
        System.out.println("*   4. Malteada de maní              *");
        System.out.println("*   5. Menú principal                *");
        System.out.println("");

        opc5 = scn.nextInt();
        switch (opc5) {
            case 1: case 2: case 3: case 4:
                mostrarmen11();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }

    public void mostrarmen6() {
        int opc6 = 0 ;
        System.out.println("");
        System.out.println("*   1. Brownie con helado            *");
        System.out.println("*   2. Cheesecake frío               *");
        System.out.println("*   3. Gelatina con crema            *");
        System.out.println("*   4. Banana split                  *");
        System.out.println("*   5. Menú principal                *");
        System.out.println("");

        opc6 = scn.nextInt();
        switch (opc6) {
            case 1: case 2: case 3: case 4:
                mostrarmen11();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu();
                break;
        }
    }

    public void mostrarmen11() {
    int opc11 = 0 ;

    System.out.println("");
    System.out.println("        Seleccione método de pago      ");
    System.out.println("*         1. Pago en efectivo         *");
    System.out.println("*         2. Pago con tarjeta         *");
    System.out.println("*         3. Pago con Nequi/Daviplata *");
    System.out.println("*         4. Volver al menú principal *");
    System.out.println("");

    opc11 = scn.nextInt();
    switch (opc11) {
        case 1:
            System.out.println("Pago en efectivo realizado con éxito ✅");
            mostrarmen12();
            break;
        case 2:
            System.out.println("Pago con tarjeta aprobado 💳✅");
            mostrarmen12();
            break;
        case 3:
            System.out.println("Pago con Nequi/Daviplata exitoso 📲✅");
            mostrarmen12();
            break;
        case 4:
            mostrarMenu();
            break;
        default:
            System.out.println("*           Opción no válida          *");
            mostrarMenu();
            break;
    }
}

public void mostrarmen12() {
    int opc12 = 0 ;

    System.out.println("");
    System.out.println("*   Compra finalizada con éxito       *");
    System.out.println("*   1. Volver al menú principal       *");
    System.out.println("");

    opc12 = scn.nextInt();
    switch (opc12) {
        case 1:
            mostrarMenu();
            break;
        default:
            System.out.println("*           Opción no válida          *");
            mostrarMenu();
            break;
    }
}

    
    public void mostrardescripción(int opc) {
        switch (opc) {
            case 1:
                mostrarmen1();
                break;
            case 2:
                mostrarmen2();
                break;
            case 3:
                mostrarmen3();
                break;
            case 4:
                mostrarmen4();
                break;
            case 5:
                mostrarmen5();
                break;
            case 6:
                mostrarmen6();
                break;
            default:
                System.out.println("*           Opción no válida         *");
                mostrarMenu(); 
                return;  
        }

        System.out.println("Gracias por tu compra");
        
        mostrarMenu();
    }
}
