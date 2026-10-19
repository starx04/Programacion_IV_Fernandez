class EquipoMovil {
    vender(): void {
        console.log("Venta de equipo móvil registrada.");
    }
}

class SmartphonePremium extends EquipoMovil {
    activarGarantia(): void {
        console.log("Garantía del smartphone premium activada.");
    }
}

class SmartphoneBasico extends EquipoMovil {
    configurarEquipo(): void {
        console.log("Smartphone básico configurado.");
    }
}

const premium = new SmartphonePremium();
premium.vender();
premium.activarGarantia();

const basico = new SmartphoneBasico();
basico.vender();
basico.configurarEquipo();

class Accesorio {
    vender(): void {
        console.log("Venta de accesorio registrada.");
    }
}

class Audifonos extends Accesorio {
    conectarBluetooth(): void {
        console.log("Audífonos conectados por Bluetooth.");
    }
}

class Cargador extends Accesorio {
    cargarEquipo(): void {
        console.log("Equipo conectado al cargador.");
    }
}

const audifonos = new Audifonos();
audifonos.vender();
audifonos.conectarBluetooth();

const cargador = new Cargador();
cargador.vender();
cargador.cargarEquipo();
