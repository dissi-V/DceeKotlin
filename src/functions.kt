fun main() {
    //Predefined functions/Inbuilt libraryfunctions
    println("Hello Kotlin")

    var x = Math.sqrt(169.0)
    println(x)

    var y = Math.round(56.78)
    println(y)

    var z = Math.min(34,89)
    println(z)

    var number = Math.max(123,567)
    println(number)

    //Calling a function
    name()
    sum()
    details("Joe", 56)
    details("Karimi", 21)

}


//User-defined functions
fun name(){
    println("Dcee")
}

fun sum(){
    var number1 = 45
    var number2 = 60
    println(number1+number2)

}

//Parameter and arguments
fun details(name:String, age:Int){
    println("$name is $age years old")
}
