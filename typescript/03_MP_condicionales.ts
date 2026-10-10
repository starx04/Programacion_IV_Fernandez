let nivelCliente: number = 5;

if (nivelCliente < 5) {
    console.log("El cliente puede acceder a un descuento del 10%.");
}

if (nivelCliente < 5) {
    console.log("El cliente puede participar en la promoción del mes.");
} else {
    console.log("El cliente no aplica para la promoción del mes.");
}

if (nivelCliente >= 16) {
    console.log("El cliente es premium y recibe atención especial.");
} else if (nivelCliente >= 8) {
    console.log("El cliente tiene prioridad en ventas.");
} else {
    console.log("El cliente necesita más compras para obtener beneficios.");
}

nivelCliente = 20;
let montoCompra: number = 2500;

if (nivelCliente >= 8 && nivelCliente < 16 && montoCompra >= 2000) {
    console.log("El cliente aplica a descuento por compra mayor.");
} else if (nivelCliente >= 8) {
    console.log("El cliente tiene acceso a beneficios de nivel.");
} else {
    console.log("El cliente no cumple los requisitos.");
}

nivelCliente = 25;
montoCompra = 1200;

if (nivelCliente >= 8 || montoCompra >= 2000) {
    console.log("El cliente puede participar en una promoción especial.");
} else if (nivelCliente >= 8) {
    console.log("El cliente es preferente.");
} else {
    console.log("El cliente no cumple las condiciones.");
}
