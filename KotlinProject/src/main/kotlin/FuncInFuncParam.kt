fun main() {
    val result1 = sum(10, 10)
    val result2 = mul(sum(10, 5), 10)     // 함수를 인자로 이용
    println("result1: $result1, result2: $result2")

    val result3 = funcFunc(2, 3)
    println("result3: $result3")
}

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int): Int {
    return a * b
}

fun funcFunc(a: Int, b: Int): Int {
    return sum(a, b)        // 함수의 반환형태로 함수 이용 가능. 함수에 함수가 들어있는 형태
}