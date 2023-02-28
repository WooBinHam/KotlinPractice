// 중위 표현법: 클래스의 멤버 호출 시 사용하는 점을 생략하고 함수 이름 뒤에 소괄호를 생략해 직관적인 이름을 사용할 수 있는 표현법
// 중위함수의 조건: 멤버 메소드 또는 확장함수여야 한다, 하나의 매개변수를 가져야 한다, infix 키워드를 사용하여 정의한다.
fun main() {
    // 일반 표현법
    val multi1 = 3.multiply(10)

    // 중위 표현법
    val multi2 = 3 multiply 10
    println("multi1: $multi1")
    println("multi2: $multi2")
    println()
    val num = 3
    val str1 = num.strPlus("Kotlin")
    val str2 = num strPlus "Kotlin"
    println(str1)
    println(str2)
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}

infix fun Int.strPlus(x: String): String {
    return "$x version $this"
}