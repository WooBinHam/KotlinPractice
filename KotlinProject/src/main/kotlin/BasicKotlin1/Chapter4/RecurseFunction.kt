package BasicKotlin1.BasicKotlin1_Chapter4

fun main() {
    normalFactorial()
    println()
    tailRecFactorial()
}

// 일반적인 factorial의 재귀함수 만들기
fun normalFactorial() {
    val number = 4
    val result: Long

    result = factorial1(number)
    println("Factorial: $number -> $result")
}

fun factorial1(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial1(n - 1)
}

// 꼬리 재귀로 스택 오버플로 방지하기
fun tailRecFactorial() {
    val number = 5
    println("Factorial: $number -> ${factorial2(number)}")
}

// 매개변수의 변화: 받아들일 값인 n, 실행할 run, 기본값은 1.
tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n - 1, run * n)
}