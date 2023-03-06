package BasicKotlin1.Chapter4

fun main() {
    // 매개변수 없는 람다식 함수
    noParam({ "Hello World!" })
    noParam { "Hello World!" }

    // 매개변수가 하나 있는 람다식 함수
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }   // 위와 동일한 결과. 소괄호 생략 가능
    oneParam { "Hello World! $it" }    // 위와 동일한 결과. it으로 대체 가능. it은 일종의 키워드. 앞에서 가져온 변수 하나를 지칭함. 변수가 2개 이상이면 대체할 수 없다.

    // 매개변수가 두 개 있는 람다식 함수
    moreParam { a, b -> "Hello World! $a $b" }    // 매개변수명 생략 불가
    // 매개변수를 생략할 수 있는 경우: 두 개의 매개변수중 하나만 사용하는 경우
    moreParam { _, b -> "Hello World! $b" }     // 첫 번째 문자열은 사용하지 않고 생략

    // 일반 함수와 람다식이 합쳐져 있는 경우
    // 인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })     // 1번
    // BasicKotlin1_Chapter4.withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Args1", "Args2") { a, b -> "Hello World! $a $b" }    // 2번

    // 람다식이 인자로 두개 있는 경우
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" }   // 위와 동일
}

// 매개변수가 없는 람다식 함수가 BasicKotlin1_Chapter4.noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())

// 매개변수가 하나 있는 람다식 함수가 BasicKotlin1_Chapter4.oneParam 함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 두 개 있는 람다식 함수가 BasicKotlin1_Chapter4.moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

// BasicKotlin1_Chapter4.withArgs 함수는 일반 매개변수 2개를 포함. 람다식 함수를 마지막 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

// 함수의 인자가 람다식 두개인 경우
fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}