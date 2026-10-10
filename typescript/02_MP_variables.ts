const IVA: number = 0.16;
const COMISION_VENDEDOR: number = 5;
const NOMBRE_TIENDA: string = "MoviTech Store";
const ESTADO_TIENDA: boolean = true;

console.log("Tienda:", NOMBRE_TIENDA);
console.log("IVA:", IVA);
console.log("Comisión del vendedor:", COMISION_VENDEDOR, "%");
console.log("Estado de la tienda:", ESTADO_TIENDA);

let cantidadVentas: number = 0;
console.log(cantidadVentas);

cantidadVentas++;
console.log(cantidadVentas);

cantidadVentas += 3;
console.log(cantidadVentas);

cantidadVentas = cantidadVentas + 2;
console.log(cantidadVentas);

let vendedor: string = "Ana López";
let hayPromocion: boolean = false;
console.log(vendedor);
console.log(hayPromocion);

let equipos: string[] = ["Samsung Galaxy S24", "iPhone 15", "Xiaomi Redmi Note 13"];
console.log(equipos);

let equipoSeleccionado: string | null = null;
let modeloDestacado: string | undefined;

let stockTotal: bigint = 987654321n;

let equipo1: symbol = Symbol("Samsung");
console.log(equipo1.description);

let equipo2: symbol = Symbol("Samsung");
console.log(equipo2.description);
console.log(equipo1 === equipo2);

let celular: {
    modelo: string;
    precio: number;
    stock: number;
    esPremium: boolean;
} = {
    modelo: "iPhone 15",
    precio: 18999,
    stock: 12,
    esPremium: true
};

console.log(celular);
