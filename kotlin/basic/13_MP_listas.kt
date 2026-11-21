fun calcularTotal(precios: List<Int>): Int {
    var total = 0
    for (precio in precios) {
        total += precio
        if (precio > 150) {
            println("Equipo móvil de gama alta: $$precio")
        }
    }
    return total
}

fun main() {
    val marcas = listOf("Samsung", "Apple", "Xiaomi")
    var iteracion: Int = 1
    for (marca in marcas) {
        println("Marca $iteracion : $marca")
        iteracion++
    }
    
    val preciosEquipos = listOf(100, 200, 150, 20, 60)
    val total = calcularTotal(preciosEquipos)
    println("Costo total de los equipos de Antoni Fernández: $$total")
}