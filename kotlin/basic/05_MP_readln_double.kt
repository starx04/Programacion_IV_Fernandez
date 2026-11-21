@file:JvmName("App")

fun main() {
    println("Cotización de Equipos Móviles")
    println("¿Nombre del cliente?")
    val cliente = readLine()!!
    println("Cantidad de equipos:")
    val equipos = readLine()!!.toInt()
    println("Precio por equipo:")
    val precio = readLine()!!.toDouble()
    println("Presupuesto disponible:")
    val presupuesto = readLine()!!.toDouble()

    val totalCompra = equipos * precio
    val saldo = presupuesto - totalCompra

    println("Reporte de Venta")
    println("Cliente: $cliente")
    println("Equipos: $equipos")
    println("Precio por equipo: $precio")
    println("Total a pagar: $totalCompra")
    println("Presupuesto disponible: $presupuesto")
    println("Saldo restante: $saldo")
}