let almacenamientoDisponible = 1024;
let almacenamientoMaximo = 2048;
while (almacenamientoDisponible < almacenamientoMaximo) {
    console.log(`Almacenamiento disponible: ${almacenamientoDisponible} GB`);
    almacenamientoDisponible += 256;
}

let nivelCliente = 1;
while (nivelCliente <= 10) {
    console.log(`Nivel del cliente: ${nivelCliente}`);
    nivelCliente++;
}

let ventasProcesadas = 0;
let ventasAprobadas = 0;
while (ventasProcesadas < 10) {
    ventasProcesadas++;
    let ventaAprobada = Math.random() < 0.5;
    if (ventaAprobada) {
        ventasAprobadas++;
        console.log(`Venta ${ventasProcesadas}: Aprobada. Total aprobadas: ${ventasAprobadas}`);
    } else {
        console.log(`Venta ${ventasProcesadas}: Rechazada. Total aprobadas: ${ventasAprobadas}`);
    }
}

let pedidosAtendidos = 0;
do {
    pedidosAtendidos++;
    console.log(`Pedidos atendidos: ${pedidosAtendidos}`);
} while (pedidosAtendidos < 5);

interface EquipoMovil {
    modelo: string;
    tipo: string;
    precio: number;
}

const equiposEnInventario: EquipoMovil[] = [
    { modelo: "Samsung Galaxy S24", tipo: "Premium", precio: 18000 },
    { modelo: "iPhone 15", tipo: "Premium", precio: 22000 },
    { modelo: "Xiaomi Redmi Note 13", tipo: "Gama media", precio: 6500 },
    { modelo: "Motorola Edge", tipo: "Gama media", precio: 9500 },
    { modelo: "Nokia C32", tipo: "Básico", precio: 3000 }
];

let indice = 0;
while (indice < equiposEnInventario.length) {
    const equipo = equiposEnInventario[indice];
    if (equipo?.tipo === "Premium") {
        indice++;
        continue;
    }
    if (equipo?.precio < 4000) {
        console.log(`El equipo ${equipo.modelo} requiere revisar su precio.`);
        break;
    }
    if (equipo) {
        console.log(`Modelo: ${equipo.modelo}, Tipo: ${equipo.tipo}, Precio: ${equipo.precio}`);
    }
    indice++;
}
