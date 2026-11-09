fun main() {
    println("OPERADORES EN MOVITECH")

    val precioEquipo: Double = 899.99
    val precioFunda: Double = 19.99

    val suma = precioEquipo + precioFunda
    println("Total de equipo y funda: $suma")

    val diferencia = precioEquipo - precioFunda
    println("Diferencia entre los precios: $diferencia")

    val totalDosEquipos = precioEquipo * 2
    println("Precio de dos equipos: $totalDosEquipos")

    val precioPorCuota = precioEquipo / 3
    println("Precio por cuota (3 cuotas): $precioPorCuota")

    val equiposEnCaja = 17
    val equiposPorEstante = 5
    val equiposRestantes = equiposEnCaja % equiposPorEstante
    println("Equipos restantes al organizar el inventario: $equiposRestantes")

    println("Prioridad de los operadores aritméticos")
    println("1: ()")
    println("2: *, /, %")
    println("3: +, -")

    val totalConAccesorio = precioEquipo + precioFunda * 2
    println("Equipo más dos fundas: $totalConAccesorio")

    println("OPERADORES DE COMPARACIÓN")
    println("Precios iguales: ${precioEquipo == precioFunda}")
    println("Precios diferentes: ${precioEquipo != precioFunda}")
    println("Equipo más caro que la funda: ${precioEquipo > precioFunda}")
    println("Equipo cuesta al menos 800: ${precioEquipo >= 800}")
    println("Funda cuesta menos de 25: ${precioFunda < 25}")
    println("Funda cuesta máximo 20: ${precioFunda <= 20}")
}
