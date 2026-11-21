fun main() {
    val ventasDiarias = arrayOf(80, 5, 0, 584, 12, 12)
    println(ventasDiarias[0])
    println(ventasDiarias[1])
    println(ventasDiarias[2])
    ventasDiarias[4] = 80
    println(ventasDiarias[4])
    
    for (venta in ventasDiarias) {
        println("Equipos vendidos")
        val ventaDoble = venta * 2
        println("Proyección de venta al doble: $ventaDoble")
        if (ventaDoble >= 150) {
            val stockAjustado = ventaDoble - 70
            println("La proyección fue ajustada por límite de inventario y actualmente tienes: $stockAjustado")
        }
    }
}