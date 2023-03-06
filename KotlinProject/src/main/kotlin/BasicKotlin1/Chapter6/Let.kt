package BasicKotlin1.BasicKotlin1_Chapter6

fun main() {
    val score: Int? = 32
//    var score2 = null

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let을 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $score") }    // 1번
        val str = score.let { it.toString() }      // 2번
        println(str)
    }
    checkScore()
    checkScoreLet()
    println()

    // let 함수의 체이닝(chaining)
    var a = 1
    val b = 2
    a = a.let { it + 2 }.let {      // it+2 = 3
        println("a = $a")
        val i = it + b        // 3+2
        i       // 이게 반환되어 a에 할당됨.
    }
    println(a)      // 5
    println()

    // let의 중첩 사용
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")    // 이때는 it을 사용하지 않고 명시적 이름을 사용
        }
    }
    println()
    // 반환값은 바깥쪽의 람다식에만 적용
    var y = "Kotlin!"
    y = y.let { outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer")
            "Inner String"      // 이것은 반환되지 않는다
        }
        "Outer String"      // 이 문자열이 반환되어 y에 할당된다.
    }
    print(y)

//    // let의 활용
//    val padding = TypedValue.applyDimension(
//        TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()
//    setPadding(padding, 0, padding, 0)      // 왼쪽, 오른쪽 padding 설정
//
//    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt().let { padding ->
//        setPadding(padding, 0, padding, 0)      // 계산된 값을 padding이라는 이름의 인자로 받음
//    }
//
//    TypedValye.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt().let {
//        setPadding(it, 0, it, 0)        // padding 대신 it 사용
//    }

//    // null 가능성 있는 객체에서 let() 활용하기
//    var obj: String?    // null일 수 있는 변수 obj
//    if(null != obj){    // obj가 null이 아닐 경우 작업 수행(기존 방식)
//        Toast.makeText(applicationContext, obj, Toast.LENGTH_LONG).show()
//    }
//
//    obj?.let {  // obj가 null이 아닐 경우 작업 수행 (Safe calls + let 사용)
//        Toast.makeText(applicationContext, it, Toast.LENGTH_LONG).show()
//    }

//    // else 문이 포함된 문장 대체
//    val firstName: String?
//    var lastName: String?
//    // if문을 사용한 경우
//    if(null != firstName){
//        println("$firstName $lastName")
//    }else{
//        println("$lastName")
//    }
//    // let을 사용한 경우
//    firstName?.let { print("$it $lastName") } ?: print("$lastName")
}