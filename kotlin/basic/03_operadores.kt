fun  main(){
    println("OPERADORES EN KOTLIN")

    //SUMA
    var n1:double =10.50
    var n2:double =20.50
    var suma : double = n1+n2
    println("suma + :${n1+n2}")
    println("suma + : ${suma}")

    //RESTA
    var resta : double = n1-n2
    println("resta - : ${n1-n2}")
    println("resta - : ${resta}")

    //MULTIPLICACION
    var multiplicacion : double = n1*n2
    println("multiplicacion * : ${n1*n2}")
    println("multiplicacion * : ${multiplicacion}")

    //DIVISION
    var division : double = n1/n2
    println("divisioon / :${n1/n2}")
    println("divisioon / : ${division}")

    //RESIDUO
    var residuo : double = n1%n2
    println("residuo % : ${n1%n2}")
    println("residuo % : ${residuo}")

    //PRIORIDAD DE LOS OPERADORES ARITMETICOS
    println("prioridad de los operadores aritmeticos")
    println("1 : ()")
    println("2 : *, /, %")
    println("3 : +, -")

    val cristales = 10+5*6+4
    println("Cristales: $cristales")

    val energia = 3/5*5
    println("Energia: $energia")

    val combustible = 100+20/4*3-10%3
    println("Combustible: $combustible")

    //OPERADOPRES DE COMPARACION
    println("OPERADORES DE COMPARACION")
    println("Igual a == ${10==10}")
    println("Igual a == ${10==11}")
    println("Diferente a != ${10!=10}")
    println("Diferente a != ${10!=11}")
    println("Mayor que > ${10>11}")
    println("Mayor que > ${10>9}")
    println("Menor que < ${10<11}")
    println("Menor que < ${10<9}")  
    println("Mayor igual que >= ${10>=10}")
    println("Mayor igual que >= ${10>=9}")
    println("Menor igual que <= ${10<=10}")
    println("Menor igual que <= ${10<=11}")

}