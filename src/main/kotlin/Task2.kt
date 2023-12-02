fun main() {
    print("Enter Name:")
    val userInput : String = readln()
    val names = userInput.split(" ").toTypedArray()
    val lastElement = names.last()
    for (i in 1..3) {
        println(lastElement)
    }

}