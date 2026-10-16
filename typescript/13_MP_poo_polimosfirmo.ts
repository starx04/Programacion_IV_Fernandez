class EquipoMovil {
    vender(): void {
        console.log("Venta de equipo móvil a precio regular.");
    }
}

class SmartphonePremium extends EquipoMovil {
    override vender(): void {
        console.log("Venta de smartphone premium con garantía extendida.");
    }
}

class SmartphoneEconomico extends EquipoMovil {
    override vender(): void {
        console.log("Venta de smartphone económico con promoción.");
    }
}

const equipos: EquipoMovil[] = [
    new SmartphonePremium(),
    new SmartphoneEconomico()
];

console.log(equipos);
equipos.forEach(equipo => equipo.vender());
