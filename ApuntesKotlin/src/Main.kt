fun main() {
    println("Hola Kotlin")

    // variables

    var myString = "Esto es una cadena de texto"
    myString = "Aqui cambio el valor de la cadena de texto"
    myString = "6"
    println(myString)

    var myString2 = "Esto es otra cadena de texto"
    println(myString2)

    var myInt = 7
    myInt = myInt + 4
    println(myInt - 1) // Mantiene siempre el myInt

    var myInt2: Int = 5
    println(myInt2)

    var myDouble = 6.5
    println(myDouble)
    // Los double siempre son decimales
    myDouble = 6.0
    println(myDouble)

    var myDouble2: Double = 6.5
    var myFloat = 6.5f

    var myBool = true
    println(myBool)

   //Constantes

   val myConst = "Mi propiedad constante"
   //Las constantes no pueden modificarse

    //Controles de flujos

    myInt = 10
    myString = "hola"

    if (myInt == 11 && myString == "hola") {
      println("Los valores coinciden")
    } else if (myInt == 10 || myString == "hola") {
        println("El valor es 10")
    } else {
        println("El valor es distinto a 11 y de 10")
    }

}
