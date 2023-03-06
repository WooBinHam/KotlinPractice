package BasicKotlin1.Chapter4

fun main() {
    val result: Int
    val multi = { a: Int, b: Int -> a * b }
    val multi2: (a: Int, b: Int) -> Int = { a, b -> a * b }
    val multi3: (Int, Int) -> Int = { x: Int, y: Int -> x * y }     // 람다식의 선언 자료형은 람다식 매개변수에 자료형이 명시된 경우 생략 가능
    val multi4: (Int, Int) -> Int = { x, y -> x * y }               // 선언 자료형이 명시되어 있으면 생략 가능

    result = multi(10, 20)
    println(result)
    println()
    val multi5: (Int, Int) -> Int = { x: Int, y: Int ->
        println("x: $x, y: $y, x * y: ${x * y}")
        x * y       // 반환값
    }
    println(multi5(20, 40))

    // 반환형이 없거나 매개변수가 하나 있을 때
    val greet: () -> Unit = { println("Hello World!") }
    val square: (Int) -> Int = { x -> x * x }

    // 람다식 안에 람다식이 있는 경우
    val nestedLambda: () -> () -> Unit = { { println("nested") } }  // 반환이 없는 경우 Unit

    // 선언부 자료형 생략
    val groot = { println("Hello World!") }   // 추론 가능
    val squaree = { x: Int -> x * x }   // 선언 부분을 생략하려면 x의 자료형을 명시해야 함
    val nestedLam = { { println("nested") } }   // 추론 가능
}