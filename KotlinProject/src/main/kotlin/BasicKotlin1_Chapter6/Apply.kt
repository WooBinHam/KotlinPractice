package BasicKotlin1_Chapter6

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong","Kotlin")

    // 여기서 this는 person객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)
    var returnObj = person.apply {
        name = "Sean"       // 1번 this는 생략할 수 있음
        skills = "Java"     // this 없이 객체의 멤버에 여러번 접근
    }
    println(person)
    println(returnObj)

    // 레이아웃을 초기화할 때 apply() 활용하기
//    // 기존 코드
//    val param = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT)
//    param.gravity = Gravity.CENTER_HORIZONTAL
//    param.weight = 1f
//    param.topMargin = 100
//    param.bottomMargin = 100
//    //apply() 적용 후 코드
//    val param = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT).apply {
//        gravity = Gravity.CENTER_HORIZONTAL
//        weight = 1f         // param을 사용하지 않고 직접 값을 지정할 수 있다.
//        topMargin = 100
//        bottomMargin = 100
//    }
}

// 디렉토리 생성 시 apply() 활용하기
//fun makeDir(path: String): File {  // path는 생성할 경로
//    val result = File(path)
//    result.mkdirs()
//    return result
//}

// apply를 적용한 코드
//File(path).apply { mkdirs() }