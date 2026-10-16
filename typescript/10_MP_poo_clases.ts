class EquipoMovil {
    public modelo: string;
    public precio: number;
    public stock: number;

    constructor(
        modelo: string,
        precio: number,
        stock: number,
    ) {
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    vender(): void {
        if (this.stock > 0) {
            this.stock -= 1;
            console.log(`Se vendió un ${this.modelo}.`);
        }
    }

    reabastecer(): void {
        this.stock += 10;
        console.log(`Se reabasteció el inventario de ${this.modelo}.`);
    }
}

const samsung = new EquipoMovil("Samsung Galaxy S24", 18000, 10);
const iphone = new EquipoMovil("iPhone 15", 22000, 8);

samsung.vender();
console.log(iphone.precio);
iphone.reabastecer();
console.log(iphone.stock);
iphone.vender();
console.log(iphone.stock);
