type EquipoMovil =
    | "Samsung Galaxy S24"
    | "iPhone 15"
    | "Xiaomi Redmi Note 13"
    | "Motorola Edge"
    | "Google Pixel 8";

let equipoSeleccionado = "iPhone 15" as EquipoMovil;

switch (equipoSeleccionado) {
    case "Samsung Galaxy S24":
        console.log("Samsung Galaxy S24 es un equipo premium.");
        break;
    case "iPhone 15":
        console.log("iPhone 15 tiene excelente rendimiento.");
        break;
    case "Xiaomi Redmi Note 13":
        console.log("Xiaomi Redmi Note 13 es una opción accesible.");
        break;
    case "Motorola Edge":
        console.log("Motorola Edge tiene buena cámara y batería.");
        break;
    case "Google Pixel 8":
        console.log("Google Pixel 8 destaca por su calidad fotográfica.");
        break;
    default:
        console.log("Equipo móvil no reconocido.");
}

type Teléfonos = "Samsung" | "Apple" | "Xiaomi";

let marca = "Apple" as Teléfonos;
let precio = 18000;
let tieneGarantia = true;

switch (marca) {
    case "Samsung":
        if (precio > 15000 && tieneGarantia) {
            console.log("Samsung es una buena opción premium.");
        } else {
            console.log("Samsung no es la mejor opción en este momento.");
        }
        break;
    case "Apple":
        if (precio > 17000 && tieneGarantia) {
            console.log("Apple es una excelente compra premium.");
        } else {
            console.log("Apple no cumple con el presupuesto del cliente.");
        }
        break;
    case "Xiaomi":
        if (precio > 10000 && tieneGarantia) {
            console.log("Xiaomi es una compra equilibrada.");
        } else {
            console.log("Xiaomi no es la mejor elección para este cliente.");
        }
        break;
}
