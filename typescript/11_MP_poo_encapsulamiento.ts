class Inventario {
    private stock: number = 10;

    vender(cantidad: number): void {
        if (cantidad > 0) {
            this.stock = Math.max(0, this.stock - cantidad);
        }
    }

    consultarStock(): number {
        return this.stock;
    }
}

const inventario = new Inventario();
inventario.vender(15);
console.log(inventario.consultarStock());
inventario.vender(5);
console.log(inventario.consultarStock());
