fun main() {
    val equipos = mutableListOf("Samsung Galaxy S24", "iPhone 15", "Xiaomi Redmi Note 13")
    var option: Int

    do {
        println("\n--- Tienda de Móviles de Fernandez Antoni ---")
        println("1. Agregar Equipo Móvil")
        println("2. Mostrar Equipos Móviles")
        println("3. Modificar Equipo Móvil")
        println("4. Eliminar Equipo Móvil")
        println("5. Salir")
        print("Elige una opción: ")
        option = readLine()!!.toInt()

        when (option) {
            1 -> {
                print("Ingresa el modelo del nuevo equipo móvil: ")
                val modelo = readLine()!!
                equipos.add(modelo)
                println("Equipo móvil agregado al catálogo.")
            }
            2 -> {
                println("\nCatálogo de Equipos Móviles:")
                for (i in equipos.indices) {
                    println("$i -> ${equipos[i]}")
                }
            }
            3 -> {
                print("Ingresa el índice del equipo a modificar (0 a ${equipos.size - 1}): ")
                val indice = readLine()!!.toInt()
                if (indice in equipos.indices) {
                    print("Ingresa el nuevo modelo: ")
                    val nuevoModelo = readLine()!!
                    equipos[indice] = nuevoModelo
                    println("Equipo móvil modificado correctamente.")
                } else {
                    println("Índice inválido.")
                }
            }
            4 -> {
                print("Ingresa el índice del equipo a eliminar (0 a ${equipos.size - 1}): ")
                val indice = readLine()!!.toInt()
                if (indice in equipos.indices) {
                    val eliminado = equipos.removeAt(indice)
                    println("Equipo '$eliminado' eliminado del catálogo.")
                } else {
                    println("Índice inválido.")
                }
            }
            5 -> println("Saliendo del sistema...")
            else -> println("Opción no válida.")
        }
    } while (option != 5)
}