class Helado {
    constructor(sabor, receta, complemento) {
        this.sabor = sabor;
        this.receta = receta;
        this.complemento = complemento;
    }

    toString() {
        return `Helado de ${this.sabor} | Receta: ${this.receta} | Complemento: ${this.complemento}`;
    }
}

module.exports = Helado;
