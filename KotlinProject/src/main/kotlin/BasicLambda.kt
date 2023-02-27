fun main() {
    val result: Int
    val multi = { a: Int, b: Int -> a * b }
    val multi2: (a: Int, b: Int) -> Int = { a, b -> a * b }

    result = multi2(10,20)
    println(result)
}