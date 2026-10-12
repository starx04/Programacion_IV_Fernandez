let cliente = prompt("Ingrese el nombre del cliente:");
let equipo = Number(prompt("Ingrese el precio del equipo móvil:"));
let cuotas = Number(prompt("Ingrese cuántas cuotas desea pagar:"));

if (cliente === "Ana" || cliente === "Luis" || cliente === "Carlos" || cliente === "María" || cliente === "Sofía") {
    if (equipo >= 5000 && equipo <= 50000) {
        if (cuotas >= 1 && cuotas <= 24) {
            console.log(`Cliente: ${cliente}, Equipo: ${equipo}, Cuotas: ${cuotas}`);
        } else {
            console.log("Número de cuotas inválido. Debe estar entre 1 y 24.");
        }
    } else {
        console.log("Precio del equipo inválido. Debe estar entre 5000 y 50000.");
    }
} else {
    console.log("Cliente no registrado. Ingrese un nombre válido.");
}
