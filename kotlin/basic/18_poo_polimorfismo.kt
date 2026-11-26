open class RobotGeneral{
    open fun EjecutarMision{
        println("Ejecutando mision general")
    }
}

class RobotCombate:RobotGeneral(){
        override fun EjecutarMision{
            println("Defendiendo el laboratorio")
        }
}

class RobotExplorador:RobotGeneral(){
        override fun EjecutarMision{
            println("Explorando nuevos planetas")
        }
}

fun main(){
    val robot1 = RobotCombate
    val robot2 = RobotExplorador
    robot1.EjecutarMision()
    robot2.EjecutarMision()

}