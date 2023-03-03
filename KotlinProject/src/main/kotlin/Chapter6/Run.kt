package Chapter6

fun main() {
    var skills = "Kotlin"
    println(skills)     // Kotlin

    val a = 10
    skills = run{
        val level = "Kotlin Level:" + a
        level       // 마지막 표현식이 반환됨
    }
    println(skills)     // Kotlin Level: 10
    println()

    // apply()와 run() 비교해보기
    data class Person(var name:String, var skills: String)
    var person = Person("Kildong","Kotlin")
    val returnObj1 = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "Success"       // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj1")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "Success"
    }
    println(person)
    println("returnObj: $returnObj2")
}