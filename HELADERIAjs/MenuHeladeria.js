const readline = require("readline");
const BackEndHeladeria = require("./BackEndHeladeria");

class MenuHeladeria {
    constructor() {
        this.backend = new BackEndHeladeria();
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    mostrarMenu() {
        console.clear();
        console.log("");
        console.log("********** HELADERÍA EL HIELO **********");
        console.log("1. Registrar helado");
        console.log("2. Ver helados");
        console.log("3. Actualizar helado");
        console.log("4. Borrar helado");
        console.log("5. Salir");
        console.log("");

        this.rl.question("👉 Digite una opción: ", (opc) => {
            switch (opc) {
                case "1":
                    this.crearHelado();
                    break;
                case "2":
                    this.backend.mostrarHelados();
                    this.volver();
                    break;
                case "3":
                    this.actualizarHelado();
                    break;
                case "4":
                    this.borrarHelado();
                    break;
                case "5":
                    console.log("¡Gracias por usar la heladería!");
                    this.rl.close();
                    break;
                default:
                    console.log("⚠️ Opción inválida");
                    this.volver();
            }
        });
    }

    crearHelado() {
        this.rl.question("Sabor: ", sabor => {
            this.rl.question("Receta: ", receta => {
                this.rl.question("Complemento: ", complemento => {
                    this.backend.agregarHelado(sabor, receta, complemento);
                    console.log("✔ Helado agregado con éxito");
                    this.volver();
                });
            });
        });
    }

    actualizarHelado() {
        this.backend.mostrarHelados();
        this.rl.question("Número del helado a actualizar: ", num => {
            let index = parseInt(num) - 1;

            this.rl.question("Nuevo sabor: ", sabor => {
                this.rl.question("Nueva receta: ", receta => {
                    this.rl.question("Nuevo complemento: ", complemento => {
                        this.backend.actualizarHelado(index, sabor, receta, complemento);
                        console.log("✔ Helado actualizado");
                        this.volver();
                    });
                });
            });
        });
    }

    borrarHelado() {
        this.backend.mostrarHelados();
        this.rl.question("Número del helado a borrar: ", num => {
            let index = parseInt(num) - 1;
            this.backend.borrarHelado(index);
            console.log("✔ Helado borrado");
            this.volver();
        });
    }

    volver() {
        this.rl.question("\nPresione ENTER para volver al menú...", () => {
            this.mostrarMenu();
        });
    }
}

module.exports = MenuHeladeria;
