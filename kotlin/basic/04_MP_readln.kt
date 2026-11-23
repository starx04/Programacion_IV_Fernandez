@file:JvmName("App")

fun main() {
    println("Sistema de Ventas de Equipos Móviles")
    println("¿Cuál es el nombre del vendedor?")
    val vendedor = readLine()!!
    println("Bienvenido al sistema de ventas, $vendedor")

    println("Equipos Samsung vendidos:")
    val equiposSamsung = readLine()!!.toInt()
    println("Equipos Xiaomi vendidos:")
    val equiposXiaomi = readLine()!!.toInt()
    val totalVendidos = equiposSamsung + equiposXiaomi
    println("Total de equipos vendidos: $totalVendidos")

    println("Control de Inventario")
    println("Stock inicial en tienda:")
    val stockInicial = readLine()!!.toInt()
    println("Equipos entregados hoy:")
    val equiposEntregados = readLine()!!.toInt()
    val stockRestante = stockInicial - equiposEntregados
    println("Stock restante en tienda: $stockRestante")
}