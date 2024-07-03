//break
fun main() {
    for(letter in 'a'..'z'){
        if (letter=='h')
        { break }
        println(letter)
    }
    // continue
    for (number in 1..10)
    {if (number==6)
    { continue }
        println(number)
    }
}