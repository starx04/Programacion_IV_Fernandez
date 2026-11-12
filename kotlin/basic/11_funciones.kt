fun activarPortal(){
    println("Activando portal interdimensional")
    println("Conteo regresivo")
    println("3")
    println("2")
    println("1")
    println("Francisco Higuera activó el Portal")
}

fun viajar(dimension:String, viajes:Int, consumo:Int){
    println("Viajando a la dimensión $dimension")
    val total=viajes*consumo
    println("¡su consumo es de: $total!")
}

fun calcularPrecio(precio:Double):Double{
    var descuento : Double=0.0
    if (precio >=100){
        descuento=precio*0.15
    }
    return descuento
}
fun calcularEnergia(energias:Array<Int>){
    var total = 0
    for Ç(energia in energias){
        total += energiaif (energia >= 100){
            println("Sobre energia $energia")
        }
    }
    return total 
}
fun main(){
    activarPortal()
    activarPortal()
    viajar("Marte",5,6)
    viajar("Jupiter"7,8)
    val descuentoCliente = calcularPrecio(120.7)
    println("El cliente Antoni tiene un descuento de : $descuentoCliente")
    val totalEnergia = arrayOf(30,50,60,80,90)
    println("Energia total $totalEnergia")
}