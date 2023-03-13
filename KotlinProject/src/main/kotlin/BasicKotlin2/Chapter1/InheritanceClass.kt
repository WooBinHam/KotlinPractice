package BasicKotlin2.Chapter1

open class BirdClass(var name: String, var wing: Int, var beak: String) {   // 주 생성자 및 프로퍼티 선언
    fun fly() {
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : BirdClass(name, wing, beak) {
    fun singHitone() {
        println("sing Hitone")
    }
}

class Parrot : BirdClass {      // 반드시 부모 클래스가 가지는 생성자의 내용이 주 혹은 부 생성자에 정의되어야 한다.
    var language: String

    // 부 생성자에서는 프로퍼티와 같이 직접 선언할 수 없다.따라서 상위에 선언해야한다.
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language
    }

    fun speak() {
        println("Speak: $language")
    }
}

fun main() {
    val lark = Lark("myLark", 2, "short")
    val parrot = Parrot("myParrot", 2, "long", "English")
    println("lark - name: ${lark.name}")
    println("parrot - name: ${parrot.name}, lang: ${parrot.language}")
    lark.singHitone()
    lark.fly()

    parrot.speak()
    parrot.fly()
}