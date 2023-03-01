package `Chapter5-If,When,For,FlowControl`

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) {
        factorial *= number
        --number
    }
    println("Factorial: $factorial")

    // 5를 입력. 1,2,3,4,5를 순환 출력하는 예제 12345 23451 34512..
    do {
        print("Endter the number: ")
        val input = readLine()!!.toInt()

        for (i in 0..(input - 1)) {
            for (j in 0 until input) {  // until 키워드: 이상 ~ 미만
                print((i + j) % input + 1)
            }
            println()
        }
    } while (input != 0)
}