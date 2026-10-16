abstract class Producto {
    abstract vender(): void;

    mostrarDisponibilidad(): void {
        console.log("Producto disponible para la venta.");
    }
}

class Smartphone extends Producto {
    vender(): void {
        console.log("Smartphone vendido.");
    }
}

class Tablet extends Producto {
    vender(): void {
        console.log("Tablet vendida.");
    }
}

const productos: Producto[] = [
    new Smartphone(),
    new Tablet()
];

console.log(productos);
productos.forEach(producto => producto.vender());

abstract class Accesorio {
    abstract describir(): void;

    consultarStock(): void {
        console.log("Consultando el stock del accesorio.");
    }
}

class Audifonos extends Accesorio {
    describir(): void {
        console.log("Audífonos inalámbricos para equipos móviles.");
    }
}

class Cargador extends Accesorio {
    describir(): void {
        console.log("Cargador rápido para equipos móviles.");
    }
}

const accesorios: Accesorio[] = [
    new Audifonos(),
    new Cargador()
];

console.log(accesorios);
accesorios.forEach(accesorio => accesorio.describir());
