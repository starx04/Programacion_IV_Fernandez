@file:JvmName("App")

fun main() {

    println("Expedicion interdimesional")
    println("¿Nombre del viajero")
    val viajero = readLine()!!
    println("Cantidad de portales")
    val portales = readLine()!!.toInt()
    println("Costo por portal")
    val costo = readLine()!!.toDouble()
    println("Creditos disponibles:")
    val creditos = readLine()!!.toDouble()
    val totalCosto = portales * costo
    val saldo = creditos - totalCosto
    println("Reporte")
    println("Viajero: $viajero")
    println("Portales: $portales")
    println("Costo por portal: $costo")
    println("Total Costo: $totalCosto")
    println("Creditos disponibles: $creditos")
    println("Saldo restante: $saldo")
}