package HELADERIA;

import java.util.ArrayList;
import java.util.List;

public class BackEndHeladeria {
    private List<Helado> helados = new ArrayList<>();

    public void agregarHelado(String sabor, String receta, String complemento) {
        helados.add(new Helado(sabor, receta, complemento));
    }

    public void mostrarHelados() {
        if (helados.isEmpty()) {
            System.out.println("⚠️ No hay helados registrados");
        } else {
            for (int i = 0; i < helados.size(); i++) {
                System.out.println((i + 1) + ". " + helados.get(i));
            }
        }
    }

    public void actualizarHelado(int index, String sabor, String receta, String complemento) {
        if (index >= 0 && index < helados.size()) {
            helados.set(index, new Helado(sabor, receta, complemento));
        }
    }

    public void borrarHelado(int index) {
        if (index >= 0 && index < helados.size()) {
            helados.remove(index);
        }
    }
}
