data class EquipoMovil(
    val stock: Int,
    val disponible: Boolean
)

data class Smartphone(
    val modelo: String,
    val bateria: Int
)

data class VentaMayorista(
    val cantidad: Int,
    val pagoAprobado: Boolean,
    val facturaEmitida: Boolean
)

fun main() {
    val equipo = EquipoMovil(80, true)
    if (equipo.stock >= 50 && equipo.disponible) {
        println("Se puede realizar la venta del equipo móvil")
    }

    val precios = arrayOf(150, 250, 350, 450, 550)
    if (precios[4] >= 500) {
        println("¡Atención! Equipo de gama alta")
    } else {
        println("Equipo de gama media/baja")
    }

    val ventasMensuales = arrayOf(80, 65, 90)
    val suma = ventasMensuales[0] + ventasMensuales[1] + ventasMensuales[2]
    val promedio = suma / 3
    println("Promedio de ventas: $promedio")
    if (promedio >= 70) {
        println("Meta de ventas cumplida")
    } else {
        println("Meta de ventas no alcanzada")
    }
    
    val celular = Smartphone("Galaxy S24", 80)
    if (celular.bateria >= 80) {
        println("${celular.modelo} tiene carga óptima para exhibición")
    } else if (celular.bateria >= 50) {
        println("Carga normal")
    } else if (celular.bateria >= 20) {
        println("Carga baja, conectar a cargador")
    } else {
        println("Batería crítica, equipo apagado")
    }

    val pedido = VentaMayorista(120, true, false)
    if (pedido.cantidad >= 100) {
        if (pedido.pagoAprobado) {
            if (pedido.facturaEmitida) {
                println("Despacho de equipos autorizado")
            } else {
                println("Falta emitir factura para despachar el pedido")
            }
        } else {
            println("Pago pendiente de aprobación")
        }
    } else {
        println("Cantidad insuficiente para pedido mayorista")
    }
}