package Chapter5

fun main() {
    val a = 17
    val b = 7
    val bigger = if (a > b) {
        println("a: $a")
        a
    } else {
        println("b:$b")
        b
    }
    println("max: $bigger")
}