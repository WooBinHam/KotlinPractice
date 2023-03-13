package BasicKotlin2.Chapter1

open class BirdClass2(var name: String, var wing: Int, var beak: String) {   // 주 생성자 및 프로퍼티 선언
    open fun fly() {
        println("Fly")
    }
}

class Lark2(name: String, wing: Int, beak: String) : BirdClass2(name, wing, beak) {
    override fun fly() {
        println("Quick Fly")
    }

    fun singHitone() {
        println("sing Hitone")
    }
}

class Parrot2 : BirdClass2 {      // 반드시 부모 클래스가 가지는 생성자의 내용이 주 혹은 부 생성자에 정의되어야 한다.
    var language: String

    // 부 생성자에서는 프로퍼티와 같이 직접 선언할 수 없다.따라서 상위에 선언해야한다.
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language
    }

    override fun fly() {
        println("Slow Fly")
    }

    fun speak() {
        println("Speak: $language")
    }
}

fun main() {
    // lark와 parrot의 객체는 각각 Lark2와 Parrot2
    val lark = Lark2("myLark", 2, "short")
    val parrot = Parrot2("myParrot", 2, "long", "English")
    // lark2와 parrot2의 객체는 BirdClass2. 하지만 객체를 생성할 수는 있음
    val lark2: BirdClass2 = Lark2("myLark", 2, "short")
    val parrot2: BirdClass2 = Parrot2("myParrot", 2, "long", "English")

    println("lark - name: ${lark.name}")
    println("parrot - name: ${parrot.name}, lang: ${parrot.language}")
    lark.singHitone()
    lark.fly()

    parrot.speak()
    parrot.fly()

    println("lark2 - name: ${lark2.name}")
//    println("parrot2 - name: ${parrot2.name}, lang: ${parrot2.language}")
//    lark2.singHitone()
    lark2.fly()

//    parrot2.speak()
    parrot2.fly()
}