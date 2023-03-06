package BasicKotlin1.Chapter4

fun main() {
    addNum(3, { a -> println("a: $a") })
    // 인자가 하나이기에 it으로 대체 가능
    addNum(3, { println("a: $it") })
    addNum(3) {
        println("a: $it")
    }

    sub(3) { a ->
        println("a: $a")
    }

    shortFuncCross(3) { a ->
        println("a: $a")
    }

    shortFunc(3) { a ->
        println("a: $a")
        return      // 비지역 반환. out(a) 람다식만 빠져나가는 것이 아니라 shortFunc자체가 끝남.
        // 이를 강제적으로 사용하지 않게 하려면 crossinline 키워드 사용
    }
}

// 인라인 함수: 복잡한 형태가 아니라 람다식 형태면 가장 좋음
inline fun addNum(a: Int, out: (Int) -> Unit) {
    println("메인에서 호출 시 함수 내용이 호출되고 반환되는 것이 아닌 메인에 복사되어 실행됨")
    out(a)
}

// 인라인을 제한하고 싶을 때에는 noinline 키워드 사용
inline fun sub(a: Int, noinline out2: (Int) -> Unit) {
    println("Hello")
    out2(a)
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("GoodBye")
}

// 비지역 반환 금지 키워드: crossinline
inline fun shortFuncCross(a: Int, crossinline out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("GoodBye")
}