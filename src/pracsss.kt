fun main(){
    val map = mapOf(
        "Haz" to "car",
        "Haezel" to "motorbike",
        "Dcee" to "bicycle",

    )

    for ((person, vehicle) in map){
        println("$person is driving a $vehicle")
    }

}