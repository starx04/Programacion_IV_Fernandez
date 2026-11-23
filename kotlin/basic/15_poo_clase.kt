class Nave{
    var nombre = ""
    var energia = 0 
}

class Pistola(var tipo:string, var disparos:Int = 0){

    fun disparar(){
        println("Disparando para ir a otro universo")
    }
    fun  FernandezPuedeDespegar(var energia:Int = 0){
        var conbustible: Int= energia*disparos
        if(conbustible>=0){
            println("Pistola $tipo tiene potencia para disparar")
        }else{
            println("Pistola $tipo no tiene la potencia para disparar")
        }
    }
}


fun main {
    val nave1=Nave()
    nave1.nombre = "Nave de Rick"
    val nave2.nombre = "Nave de Morty"
    nave2.energia = 60
    println("${nave1.nombre}:${nave1.energia}")
    println("${nave2.nombre}:${nave2.energia}")

    val pistola1 = Pistola("Unidirreccional",5)
    val pistola2 = Pistola("Bidirreccional",51)
    println("${pistola1.tipo}")
    pistola1.disparar()
    println("${pistola2.tipo}")
    pistola2.disparar()
    pistola1.FernandezPuedeDespegar(4)
    pistola2.FernandezPuedeDespegar(-5)
}