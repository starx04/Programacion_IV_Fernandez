data class EquipoMovil(
    val stock: Int,
    val disponible: Boolean
)

fun main() {
    println("Ciclo for con rango")
    for (i in 1..5) {
        println("Revisando el lote de celulares #$i")
    }
    
    println("Ciclo for en Kotlin con downTo")
    for (i in 10 downTo 2) {
        println("Equipos restantes en vitrina: $i")
    }

    println("Ciclo for en Kotlin con step")
    for (i in 1..20 step 2) {
        println("Registrando código de IMEI #$i")
    }

    println("Ciclo for en Kotlin con variables")
    val precioUnitario = 300
    for (i in 1..10) {
        val total = precioUnitario * i
        println("$precioUnitario * $i = $total")
        println("Total por $i equipos: $${i * precioUnitario}")
    }
}