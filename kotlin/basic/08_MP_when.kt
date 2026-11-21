fun main() {
    val marca = 2
    when (marca) {
        1 -> println("Marca: Samsung")
        2 -> println("Marca: Apple")
        3 -> println("Marca: Xiaomi")
        else -> println("Marca no disponible")
    }

    println("Inclusión de los días de la semana")
    val dia = readLine()!!.toInt()
    when (dia) {
        1, 2, 3, 4, 5 -> println("Día de atención regular en tienda")
        6, 7 -> println("Día de promociones de fin de semana")
        else -> println("Día no válido")
    }

    println("Ingrese el porcentaje de batería del equipo")
    val bateria = readLine()!!.toInt()
    when (bateria) {
        in 0..39 -> println("Batería baja")
        in 40..79 -> println("Batería media")
        in 80..100 -> println("Batería alta")
        else -> println("Porcentaje no válido")
    }

    // trabajo con when
    val presupuestoCliente = 800
    val equipoDisponible = true
    val precioCelular = 400
    /*
    Trabajo con condicionales y comentarios
    con when 
    */
    when {
        presupuestoCliente >= precioCelular && equipoDisponible -> {
            val cambio = presupuestoCliente - precioCelular
            println("Venta Autorizada")
            println("Saldo restante del cliente: $cambio")
        }
        presupuestoCliente < precioCelular && equipoDisponible -> {
            println("Presupuesto insuficiente para comprar el equipo")
        }
        presupuestoCliente >= precioCelular && !equipoDisponible -> {
            println("Equipo agotado en inventario")
        }
        else -> {
            println("Venta no autorizada")
        }
    }
}