fun main() {
    val portales = mutableListOf("Tierra", "Marte", "Saturno")
    var option: Int

    do {
        println("\n--- Laboratorio de Fernandez Antoni ---")
        println("1. Agregar Portal")
        println("2. Mostrar Portales")
        println("3. Modificar Portal")
        println("4. Eliminar Portal")
        println("5. Salir")
        print("Elige una opción: ")
        option = readLine()!!.toInt()

        when (option) {
            1 -> {
                print("Ingresa el nombre del nuevo portal: ")
                val nombre = readLine()!!
                portales.add(nombre)
                println("Portal incluido.")
            }
            2 -> {
                println("\nLista de Portales:")
                for (i in portales.indices) {
                    println("$i -> ${portales[i]}")
                }
            }
            3 -> {
                print("Ingresa el índice del portal a modificar (0 a ${portales.size - 1}): ")
                val indice = readLine()!!.toInt()
                if (indice in portales.indices) {
                    print("Ingresa el nuevo nombre: ")
                    val nuevoNombre = readLine()!!
                    portales[indice] = nuevoNombre
                    println("Portal modificado correctamente.")
                } else {
                    println("Índice inválido.")
                }
            }
            4 -> {
                print("Ingresa el índice del portal a eliminar (0 a ${portales.size - 1}): ")
                val indice = readLine()!!.toInt()
                if (indice in portales.indices) {
                    val eliminado = portales.removeAt(indice)
                    println("Portal '$eliminado' eliminado.")
                } else {
                    println("Índice inválido.")
                }
            }
            5 -> println("Saliendo del programa...")
            else -> println("Opción no válida.")
        }
    } while (option != 5)
}