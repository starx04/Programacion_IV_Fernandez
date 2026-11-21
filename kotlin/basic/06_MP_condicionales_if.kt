fun main() {
    println("Condicionales if en Kotlin - Ventas de Equipos Móviles")
    println("Condicionales simples o un camino")
    var stock = 80
    if (stock >= 50) {
        println("La tienda puede realizar ventas al por mayor")
    } 

    println("Condicionales if - else o dos caminos")
    stock = 90
    if (stock >= 50) {
        println("La tienda puede realizar ventas al por mayor")
    } else {
        println("Stock insuficiente para ventas al por mayor")
    }

    println("Condicionales múltiples")
    stock = 70
    if (stock >= 100) {
        println("Stock óptimo: se aplican descuentos especiales en equipos")
    } else if (stock >= 50) {
        println("Stock moderado: venta disponible sin descuentos")
    } else {
        println("Stock bajo: es necesario reabastecer inventario")
    }

    println("Condicionales anidados")
    stock = 70
    val sistemaFacturacionActivo = true
    if (stock >= 100) {
        println("Stock óptimo: se aplican descuentos especiales en equipos")
        if (sistemaFacturacionActivo) {
            println("El sistema de facturación está activo")
        } else {
            println("El sistema de facturación está inactivo")
        }
    } else if (stock >= 50) {
        println("Stock moderado: venta disponible sin descuentos")
    } else {
        println("Stock bajo: es necesario reabastecer inventario")
    }
}