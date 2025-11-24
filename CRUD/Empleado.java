package CRUD;

public class Empleado {
    String nombre;
    String cargo;
    String genero;
    double salario;
    int edad;

    public Empleado(String nombre, String cargo, String genero, double salario, int edad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.genero = genero;
        this.salario = salario;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Cargo: " + cargo +
               ", Género: " + genero +
               ", Salario: " + salario +
               ", Edad: " + edad;
    }
}
