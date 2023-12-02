fun main() {
    print("Enter Numbers:")
    val userInput : String = readln()
    val arrayString = userInput.split(" ").toTypedArray()
    val arrayNumbers = arrayString.map { it.toInt() }
    val uniqueNumbers = arrayNumbers.distinct()
    var numberOfUnique = 0
    for(i in uniqueNumbers.indices){
        numberOfUnique += 1
    }
    println(numberOfUnique)



}