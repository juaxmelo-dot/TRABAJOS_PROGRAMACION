const Helado = require("./Helado");

class BackEndHeladeria {
    constructor() {
        this.helados = [];
    }

    agregarHelado(sabor, receta, complemento) {
        this.helados.push(new Helado(sabor, receta, complemento));
    }

    mostrarHelados() {
        if (this.helados.length === 0) {
            console.log("⚠️ No hay helados registrados");
        } else {
            this.helados.forEach((h, i) => {
                console.log(`${i + 1}. ${h.toString()}`);
            });
        }
    }

    actualizarHelado(index, sabor, receta, complemento) {
        if (index >= 0 && index < this.helados.length) {
            this.helados[index] = new Helado(sabor, receta, complemento);
        } else {
            console.log("⚠️ Índice inválido");
        }
    }

    borrarHelado(index) {
        if (index >= 0 && index < this.helados.length) {
            this.helados.splice(index, 1);
        } else {
            console.log("⚠️ Índice inválido");
        }
    }
}

module.exports = BackEndHeladeria;
