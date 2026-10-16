function sumarPrecios(precio1: number, precio2: number): number {
    return precio1 + precio2;
}

const totalCompra = sumarPrecios(1000, 2000);
console.log(`Total de la compra: ${totalCompra}`);

function mostrarSucursal(nombre: string, ubicacion: string): void {
    console.log(`Sucursal: ${nombre}, Ubicación: ${ubicacion}`);
    const equipos: string[] = ["Samsung Galaxy S24", "iPhone 15", "Xiaomi Redmi Note 13"];
    for (const equipo of equipos) {
        console.log(`Equipo disponible: ${equipo}`);
    }
}

mostrarSucursal("MoviTech Centro", "Quito");

function consultarVendedor(nombre: string, ventas?: number): void {
    console.log(`Vendedor: ${nombre}, Ventas del mes: ${ventas}`);
    if (ventas) {
        console.log(`${nombre} tiene ventas registradas.`);
    } else {
        console.log(`${nombre} aún no registra ventas.`);
        ventas = 0;
        console.log(`Ventas iniciales: ${ventas}.`);
    }
}

consultarVendedor("Ana López", 12);
consultarVendedor("Luis Pérez");

function consultarVendedor2(nombre: string, ventas: number = 0): void {
    console.log(`El vendedor ${nombre} tiene ${ventas} ventas.`);
}

consultarVendedor2("Ana López", 12);
consultarVendedor2("Luis Pérez");

function aplicarDescuento(precio: number): number {
    return precio * 0.9;
}

const aplicarDescuentoFlecha = (precio: number): number => precio * 0.9;

const precioOriginal = 1000;
const precioConDescuento = aplicarDescuento(precioOriginal);
console.log(`Precio original: ${precioOriginal}, precio con descuento: ${precioConDescuento}`);

const precioConDescuentoFlecha = aplicarDescuentoFlecha(precioOriginal);
console.log(`Precio original: ${precioOriginal}, precio con descuento (flecha): ${precioConDescuentoFlecha}`);

function formatear(valor: number): string;
function formatear(valor: string): string;
function formatear(valor: boolean): string;
function formatear(valor: number | string | boolean): string {
    if (typeof valor === "number") {
        return valor.toLocaleString("es-MX", { minimumFractionDigits: 2 });
    } else if (typeof valor === "boolean") {
        return `Disponible: ${valor ? "sí" : "no"}`;
    }
    return `"${valor}"`;
}

console.log(formatear(123456.789));
console.log(formatear("Samsung Galaxy S24"));
console.log(formatear(true));
console.log(formatear(false));

function crearContadorVentas(inicio: number = 0) {
    let cuenta = inicio;
    return {
        incrementar: () => ++cuenta,
        decrementar: () => --cuenta,
        valor: () => cuenta,
        resetear: () => { cuenta = inicio; }
    };
}

const contador1 = crearContadorVentas();
const contador2 = crearContadorVentas(10);

contador1.incrementar();
contador1.incrementar();
contador1.incrementar();
contador2.decrementar();

console.log(`Contador 1: ${contador1.valor()}`);
console.log(`Contador 2: ${contador2.valor()}`);

contador1.resetear();
console.log(contador1.valor());
