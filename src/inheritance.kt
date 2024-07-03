//Parent class/Super class/Base class
open class Animal {
    var age = 13
    var gender = "Male"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Child class/Sub class/Derived class
class Duck:Animal(){
    var isMammal = true
    var color = "white"

    fun sound(){
        println("The duck is quacking")
    }
}

class Fish:Animal(){
    var hasScales = true
    var hasFins = true
    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = Animal()
    var d = Duck()
    var f = Fish()
}