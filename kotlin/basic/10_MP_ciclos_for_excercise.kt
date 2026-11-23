data class Sucursal(
    val nombre: String,
    val stock: Int
)

fun main() {
    var totalVentas = 0.0
    println("Cotización de Lotes de Equipos Móviles")
    
    for (lote in 1..4) {
        val precioOriginal = lote * 250.0
        var descuento = 0.0
        if (precioOriginal >= 1000.0) {
            descuento = precioOriginal * 0.20
        }
        val precioFinal = precioOriginal - descuento
        println("Lote $lote")
        println("Precio Original: $$precioOriginal")
        println("Descuento aplicado: $$descuento")
        println("Precio Final: $$precioFinal")
        totalVentas += precioFinal
    }
    println("Total de Ventas en los 4 lotes: $%.2f".format(totalVentas))

    val sucursales = arrayOf(
        Sucursal("Norte", 30),
        Sucursal("Centro", 65),
        Sucursal("Sur", 95),
        Sucursal("Valle", 130),
        Sucursal("Cumbayá", 45),
        Sucursal("Carapungo", 89),
        Sucursal("Recreo", 75)
    )

    val pedidoMinimo = 50
    for (sucursal in sucursales) {
        println("\nSucursal: ${sucursal.nombre}")
        println("Stock disponible: ${sucursal.stock}")
        when {
            sucursal.stock < 50 -> {
                println("Estado: Stock Crítico")
                println("No se puede despachar pedido desde esta sucursal")
            }
            sucursal.stock < 80 -> {
                println("Estado: Stock Moderado")
            }
            sucursal.stock < 120 -> {
                println("Estado: Stock Óptimo")
            }
            else -> {
                println("Estado: Sobrestock")
            }
        }
        if (sucursal.stock >= pedidoMinimo) {
            val stockRestante = sucursal.stock - pedidoMinimo
            println("Despacho autorizado")
            println("Stock restante: $stockRestante")
        }
    }
}