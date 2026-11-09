const val MAX_PORTALES = 10
fun main(){
    var energia = 100 
    println(energia)
    println("Autor: Antoni Fernandez")
    energia=90
    println("Energia")
    println(energia)
    
    // Tipos de variables
    println("Tipos de variables en Kotlin")
    //Enteros, int
    var edad: int =19
    println("Edad: $edad")

    var portales: int = 1000
    println("Portales: $portales")
  
    //long
    var edad: long =191854L
    println("Edad: $edad")
  
    //float
    var portales: float = 1000.5f
    println("Portales: $portales")
  
    //double
    var portales: double = 1000.5
    println("Portales: $portales")
    
    //char
    var nombre: char = 'A'
    println("Nombre: $nombre")

    //boolean
    var portalActivo: boolean = true
    println("Activo: $portalActivo")

    //Manejo de strings
    var nombre: String = "Rick"
    var dimension: String = "C-137"
    println("Nombre: $nombre , dimension : $dimension")

    //Manejo de constantes
    val cientifico = "Rick"
    var portalesDisponibles = 5
    println("Cientifico: $cientifico")
    println("Portales disponibles: $portalesDisponibles")
    println("Max portales: $MAX_PORTALES")
}