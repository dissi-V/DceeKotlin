import java.util.Scanner

fun main() {
    var x = Scanner(System.`in`)

    print("Enter number :")
    var number = x.nextInt()

    if (number % 2 == 0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }
}