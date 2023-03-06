package BasicKotlin1.Chapter4

fun main() {
    //fun(x: Int, y: Int): Int = x + y 형태. 함수 이름이 생략된 익명 함수
    val add: (Int, Int) -> Int = fun(x, y) = x + y     // 익명 함수를 사용한 Add 선언
    val result = add(10, 2)     // add의 사용
    println(result)

    // 익명함수
    val add1 = fun(x: Int, y: Int) = x + y
    // 람다식
    val add2 = { x: Int, y: Int -> x + y }  // 둘이 매우 비슷하게 생김
}