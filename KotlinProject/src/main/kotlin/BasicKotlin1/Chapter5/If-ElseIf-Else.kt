package BasicKotlin1.Chapter5

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }
    println("score: $score, grade: $grade")
}