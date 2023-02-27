fun main() {
    val result: Int
    val multi = { a: Int, b: Int -> a * b }
    val multi2: (a: Int, b: Int) -> Int = { a, b -> a * b }
    val multi3: (Int, Int) -> Int = { x: Int, y: Int -> x * y }     // 람다식의 선언 자료형은 람다식 매개변수에 자료형이 명시된 경우 생략 가능
    val multi4: (Int, Int) -> Int = { x, y -> x * y }               // 선언 자료형이 명시되어 있으면 생략 가능

    result = multi(10, 20)
    println(result)

    val multi5: (Int, Int) -> Int = { x: Int, y: Int ->
        println("x: $x, y: $y, x * y: ${x * y}")
        x * y       // 반환값
    }
    println(multi5(20, 40))
}