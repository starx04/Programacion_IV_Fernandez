fun iniciarSistemaVentas() {
    println("Iniciando sistema de punto de venta")
    println("Cargando inventario")
    println("3")
    println("2")
    println("1")
    println("Antoni Fernández inició la caja registradora")
}

fun venderEquipos(modelo: String, cantidad: Int, precioUnitario: Int) {
    println("Procesando venta del modelo $modelo")
    val total = cantidad * precioUnitario
    println("¡El total a pagar es de: $$total!")
}

fun calcularDescuento(precio: Double): Double {
    var descuento: Double = 0.0
    if (precio >= 100) {
        descuento = precio * 0.15
    }
    return descuento
}

fun calcularStockTotal(lotes: Array<Int>): Int {
    var total = 0
    for (cantidad in lotes) {
        total += cantidad
        if (cantidad >= 100) {
            println("Lote mayorista detectado: $cantidad unidades")
        }
    }
    return total
}

fun main() {
    iniciarSistemaVentas()
    iniciarSistemaVentas()
    venderEquipos("Samsung S24", 5, 600)
    venderEquipos("iPhone 15", 7, 800)
    
    val descuentoCliente = calcularDescuento(120.7)
    println("El cliente Antoni tiene un descuento de: $$descuentoCliente")
    
    val lotesInventario = arrayOf(30, 50, 60, 80, 90)
    val stockTotal = calcularStockTotal(lotesInventario)
    println("Stock total de equipos: $stockTotal")
}