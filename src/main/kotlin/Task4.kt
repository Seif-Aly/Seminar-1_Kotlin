fun main() {
    print("Enter array dimension:")
    val userInput: Int = readln().toInt()
    val twoDArray = Array(userInput) { Array<Int>(userInput) { 0 } }
    for (i in 0..<userInput) {
        for (j in 0..<userInput) {
            twoDArray[i][j] = (0..<10).random()
            print("${twoDArray[i][j]} ")
        }
        println()
    }
    var sum: Int = 0
    for (i in 1..<twoDArray.size) {
        for (j in userInput - 1 downTo twoDArray.size - i) {
            sum += twoDArray[i][j]
        }
    }
    println("Sum of numbers below the side diagonal = $sum ")
}
