for (let i = 2; i < 50; i += 5) {
    console.log(`Venta de equipo móvil: ${i}`);
}

for (let i = 0; i < 10; i++) {
    console.log(`Inventario revisado: ${i}`);
}

for (let i = 40; i > 0; i -= 5) {
    if (i === 20) {
        console.log("La revisión de stock fue interrumpida.");
        break;
    }
    if (i === 30) {
        console.log("Se saltó este lote de equipos.");
        continue;
    }
    console.log(`Equipo móvil en revisión: ${i}`);
}
