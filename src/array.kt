fun main() {
    var languages = arrayOf("Kotlin","Python","Java")
    println(languages[1])

    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }

    if ("Kotlin" in languages){
        println("It exists")
    }else{
        println("Does not exist")
    }

}