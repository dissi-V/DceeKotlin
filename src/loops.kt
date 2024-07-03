fun main() {
    //While loop
    var number = 6
    while (number <= 10){
        println("Number is $number")
        number++
    }

    //Decrementing a value
    var num1 = 25
    while (num1 >= 20){
        println("Number is $num1")
        num1--
    }

    // Do...while loop
    var counter = 100
    do {
        println("Number is $counter")
        counter++
    }while (counter <= 110)

    //For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (y in furniture){
        println(y)
    }

    var marks = arrayOf(12, 45, 34)
    
}