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
        println("El valor no es 10 ni 11")
    }

//Listas

    var myList = listOf<String>("Ivan", "Leon", "Alvarez")
    println(myList[1])
    //Las listas no se pueden modificar
    var myList2 = mutableListOf("Nombre", "apellido", "Nickname")
    myList2.add("31 años")
    println(myList2)

    //sets
//No admiten duplicados
    val mySet = setOf("Ivan2", "Leon2", "Alvarez2")
    println(mySet)

    //Mapas
    //Estructura no ordenada de tipo clave valor
    val myMap = mutableMapOf("Ivan" to 31)
    myMap.put("Paula" , 25)
    println(myMap["Paula"])

    //bucles
    for (value in myList){
        println(value)
    }

    for (value in mySet){
        println(value)
    }
    var myCounter = 0
    while (myCounter  < myList.count()){
        println(myList[myCounter])
        myCounter++


    }


    //Opcionales

    var myOptional:String? = null //Puede ser un texto llegado el caso, de ahi ponerle la interrogación
    println(myOptional)
    myOptional = "Ejemplo de texto"
    println(myOptional)


    //Funciones

    myFunction()
    var myClass = MyClass(name = "Ivan", age = 31)
    println(myClass.age)

}
    fun myFunction () {
        println("Esto es una funcion")

    }

//clases

class MyClass (val name: String, val age: Int){



}





