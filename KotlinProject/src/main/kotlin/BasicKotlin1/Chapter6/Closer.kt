package BasicKotlin1.Chapter6

// 클로저: 람다식으로 표현된 내부 함수에서 외부 범위에 선언된 변수에 접근할 수 있는 개념. 람다식 안에 있는 외부 변수는 값을 유지하기 위해 람다가 포획(Capture)한 변수
fun main() {
    val calc = Calc()
    var result = 0      // 외부의 변수
    calc.addNum(2, 3) { x, y -> result = x + y }    // 클로저
    println(result)     // 값을 유지하여 5가 출력

    filterNames(4)
}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {   // 람다식 add에는 반환값이 없음
        add(a, b)
    }
}

// 함수의 매개변수에 접근
// 길이가 일치하는 이름만 반환
// 함수 자체를 같이 포획해 해당 매개변수에 접근함
fun filterNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {       // filter는 names에 붙어있는 확장함수
        it.length == length     // 바깥의 length에 접근
    }
    println(filterResult)
}
// 이런 클러저 개념이 람다식 매개변수에 사용할 때 해당 구현부에서 특정 변수에 접근할 수 있는 개념이기에 잘 알아야 한다.