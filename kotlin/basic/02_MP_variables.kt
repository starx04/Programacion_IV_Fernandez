const val STOCK_MAXIMO = 100

fun main() {
    var stockGalaxy: Int = 12
    println("Stock inicial de Galaxy S24: $stockGalaxy")

    stockGalaxy = 10
    println("Stock actualizado de Galaxy S24: $stockGalaxy")

    println("Tipos de variables en MoviTech")

    val unidadesVendidas: Int = 25
    val numeroSerie: Long = 1234567890123L
    val descuento: Float = 10.5f
    val precio: Double = 899.99
    val inicialMarca: Char = 'S'
    val disponible: Boolean = true
    val modelo: String = "Galaxy S24"

    println("Unidades vendidas: $unidadesVendidas")
    println("Número de serie: $numeroSerie")
    println("Descuento: $descuento%")
    println("Precio: $precio")
    println("Inicial de la marca: $inicialMarca")
    println("Disponible: $disponible")
    println("Modelo: $modelo")

    val nombreTienda = "MoviTech"
    val stockDisponible = 8
    println("Tienda: $nombreTienda")
    println("Stock disponible: $stockDisponible")
    println("Stock máximo: $STOCK_MAXIMO")
}
