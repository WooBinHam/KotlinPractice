package Chapter6

fun main() {
    var m = 1
    m = m.also { it + 3 }
    println(m)
    println()

    // let 과 also 비교해 보기
    data class Person(var name: String, var skills: String)

    var person = Person("kildong", "kotlin")

    val a = person.let {
        it.skills = "Android"
        "Success"       // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a")    // string
    val b = person.also {
        it.skills = "Java"
        "Success"           // 마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b")    // Person의 객체 b
}

// 기존의 디렉터리 생성 함수
fun makeDir(path: String): File {
    val result = File(path)
    result.mkdirs()
    return result
}

// let과 also를 이용한 개선된 함수
fun makeDir2(path: String) = path.let { File(it) }.also { it.mkdirs() }