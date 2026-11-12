fun main(){
    val energias = arrayOf(80,5,0,584,12,12)
    println(energias[0])
    println(energias[1])
    println(energias[2])
    energias[4]=80
    println(energias[4])    
    for (energia in energias){
        println("Energia")
        val energiaDoble = energia * 2
        println("Energia al dobel : $energiaDoble")
        if (energiaDoble>=150){
            val energiaReducida= energiaDoble-70
            println("la energia fue reducida por su exeso y actualmente tienes : $energiaReducida")
        }
    }
}