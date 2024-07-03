import java.util.Scanner

fun main() {
    var  x = Scanner(System.`in`)

    print("Enter firstnumber :")
    var first = x.nextInt()

    print("Enter secondnumber :")
    var second = x.nextInt()

    print("Enter thirdnumber :")
    var third = x.nextInt()

    if (first < second && first < third){
        println("$first is the smallest number")
    }
    else if (second < first && second <third){
        println("$second is the smallest number")
    }
    else{
        println("$third is the smallest number")
    }


}