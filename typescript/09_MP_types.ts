type ID = string | number;
type Apellido = string;
type CoordenadasSucursal = [number, number];
type Punto = {
    x: number;
    y: number;
};

const origen: Punto = { x: 0, y: 0 };
const idCliente: ID = 12;
const idProducto: ID = "mov-011";

 type Ubicacion3D = Punto & {
    z: number;
};

const ubicacionAlmacen: Ubicacion3D = { x: 1, y: 2, z: 3 };

interface Cliente {
    readonly id: number;
    nombre: string;
    email: string;
    telefono?: string;
}

interface Vendedor extends Cliente {
    cargo: string;
}

const cliente1: Cliente = {
    id: 1,
    nombre: "Lucía",
    email: "lucia@email.com"
};

const cliente2: Cliente = {
    id: 2,
    nombre: "Carlos",
    email: "carlos@email.com",
    telefono: "0991234567"
};

console.log(cliente1);
console.log(cliente2);

const vendedor: Vendedor = {
    id: 3,
    nombre: "Ana López",
    email: "ana@movitech.com",
    cargo: "Asesora de ventas"
};
