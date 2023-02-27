fun main() {
    val result1 = callByValue(Lambda())
    println(result1)
    println()

    val result2 = callByName(otherLambda)
    println(result2)
    println()

    val result3 = funcParam(3, 2, ::sum2)      // 참조방식
    println(result3)
}

// 값에 의한 호출
fun callByValue(b: Boolean): Boolean {
    println("callByValue Function")
    return b
}

val Lambda: () -> Boolean = {
    println("lambda Function")
    true
}

// 이름에 의한 호출
fun callByName(b: () -> Boolean): Boolean {   // 이 경우에는 람다식 전체가 들어감.
    println("callByName Function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLabda Function")
    true
}

// 참조방식
fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun sum2(x: Int, y: Int) = x + y