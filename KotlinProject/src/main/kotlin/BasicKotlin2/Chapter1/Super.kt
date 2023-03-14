package BasicKotlin2.Chapter1

open class Person1 {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {      // 3번
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer : Person1 {
    constructor(firstName: String) : this(firstName, 10) {      // 1번
        println("[Developer] $firstName")
    }

    constructor(firstName: String, age: Int) : super(firstName, age) {      // 2번
        println("[Developer] $firstName, $age")
    }
}

class Person2(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {
    val frame = println("[Property] Person fName: $firstName")

    init {
        println("[init] Person init block")
    }

    constructor(
        firstName: String,
        age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
    println()
    val p1 = Person2("Kildong", 30)
    println()
    val p2 = Person2("Dooly")
}