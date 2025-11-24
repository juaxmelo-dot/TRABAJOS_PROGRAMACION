package HELADERIA;

import java.util.*;

class Helado {
    private String sabor;
    private String receta;
    private String complemento;

    public Helado(String sabor, String receta, String complemento) {
        this.sabor = sabor;
        this.receta = receta;
        this.complemento = complemento;
    }

    public String getSabor() { return sabor; }
    public String getReceta() { return receta; }
    public String getComplemento() { return complemento; }

    @Override
    public String toString() {
        return "Helado de " + sabor + " | Receta: " + receta + " | Complemento: " + complemento;
    }
}

// --- Clase BackEnd ---
class BackEndHeladeria {
    private List<Helado> helados = new ArrayList<>();

    // Crear
    public void agregarHelado(String sabor, String receta, String complemento) {
        helados.add(new Helado(sabor, receta, complemento));
    }

    // Leer
    public void mostrarHelados() {
        if (helados.isEmpty()) {
            System.out.println("⚠️ No hay helados registrados");
        } else {
            for (int i = 0; i < helados.size(); i++) {
                System.out.println((i + 1) + ". " + helados.get(i));
            }
        }
    }

    // Actualizar
    public void actualizarHelado(int index, String sabor, String receta, String complemento) {
        if (index >= 0 && index < helados.size()) {
            helados.set(index, new Helado(sabor, receta, complemento));
        }
    }

    // Borrar
    public void borrarHelado(int index) {
        if (index >= 0 && index < helados.size()) {
            helados.remove(index);
        }
    }
}

