// 확장함수: 클래스의 멤버 함수를 외부에서 더 추가할 수 있음
// 형태 -> fun 확장대상.함수명(매개변수..):반환값{ ... 리턴값 }
fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// String을 확장해 getLongString 추가
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target