package BasicKotlin1.Chapter5

fun main() {
    retFunc1()
    retFunc2()
    retFunc3()
    retFunc4()
}

// 람다식에서 return 사용하기
inline fun inlineLambda1(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}
fun retFunc1() {
    println("start of retFunc1")             // 1번
    inlineLambda1(13, 3) { a, b ->     // 2번
        val result = a + b
        if (result > 10) return             // 3번 10보다 크면 이 함수를 빠져 나감. 비지역 반환으로 retFunc 함수 자체가 끝난다.
        println("result: $result")          // 4번 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc1")               // 5번
}
// -------------------------------------------------------------------------------------------------
// 람다식에서 라벨 사용
inline fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}
fun retFunc2() {
    println("start of retFunc2")
    inlineLambda2(13, 3) lit@{ a, b ->  // 1번 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if (result > 10) return@lit           // 2번 라벨을 사용한 블록의 끝부분으로 반환(3번)
        println("result: $result")
    }                                         // 3번
    println("end of retFunc2")                 // 4번 이 부분이 실행됨
}

// 암묵적 라벨
fun retFunc3() {
    println("start of retFunc3")
    inlineLambda2(13, 3) { a, b ->        // 1번 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if (result > 10) return@inlineLambda2   // 2번 라벨을 사용한 블록의 끝부분으로 반환(3번)
        println("result: $result")
    }                                         // 3번
    println("end of retFunc3")                 // 4번 이 부분이 실행됨
}

// 익명함수의 사용
fun retFunc4() {
    println("start of retFunc4")
    inlineLambda2(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) return
        println("result: $result")
    })  // inlineLambda() 함수의 끝
    println("end of retFunc4")
}
// 람다식 대신에 일반적인 익명함수를 넣어줌. a,b를 받고 구현부는 람다식과 동일
// 이 함수 내에서 return 하게 되면 비지역 반환이 일어나지 않는다. 라벨을 사용하지 않아도 됨.
// -------------------------------------------------------------------------------------------------
fun add(a: Int, b: Int): Int {
    return a + b
    println("이 코드는 실행되지 않는다.")
}

// 1. Unit을 명시적으로 반환
fun hello1(name: String): Unit {     // 특정 데이터가 반환되는게 없는 경우. Unit은 생략 가능
    println(name)
    return Unit     // Unit이라는 특수한 자료형을 반환하는 것인데 이는 어떠한 데이터 형으로도 반환하지 않는다는 특수한 키워드
}

// 2. Unit 이름을 생략한 반환
fun hello2(name: String): Unit {
    println(name)
    return
}

// 3. return 문 자체를 생략
fun hello3(name: String) {
    println(name)
}