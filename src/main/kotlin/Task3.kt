fun main() {
    val userInput : String = readln()
    val names = userInput.split(" ").toTypedArray()
    val lastElement = names.last()
    println(lastElement)
    println()
}