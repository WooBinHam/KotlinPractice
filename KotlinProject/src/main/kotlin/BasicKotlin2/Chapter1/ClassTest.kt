package BasicKotlin2.Chapter1

// 클래스 정의
class Car {
    val wheel: Int = 4

    fun start() {
        println("Engine Start!")
    }
}

// 객체 정의
fun main(){
    val sonata: Car = Car()
    println(sonata.wheel)
    sonata.start()
}