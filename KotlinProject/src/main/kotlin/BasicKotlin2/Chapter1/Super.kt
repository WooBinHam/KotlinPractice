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

class Person2(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {      // 2) 주 생성자
    val frame = println("[Property] Person fName: $firstName")      // 3) 프로퍼티 할당

    init {
        println("[init] Person init block")     // 4) 초기화 블록
    }
    // 1) 부 생성자
    constructor(
        firstName: String,
        age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")       // 5) 부 생성자 본문
    }
}

fun main() {
    val sean = Developer("Sean")
    println()
    val p1 = Person2("Kildong", 30)     // 1->2 호출, 3->4->5 실행
    println()
    val p2 = Person2("Dooly")       // 2 호출, 3->4 실행
}