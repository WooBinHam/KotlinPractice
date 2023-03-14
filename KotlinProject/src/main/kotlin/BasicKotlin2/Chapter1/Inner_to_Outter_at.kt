package BasicKotlin2.Chapter1

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Chile Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f()     // 1) 현재 이너 클래스의 f() 접근
            Child().f()     // 2) 바로 바깥 클래스 f()의 접근
            super@Child.f()     // 3) Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@Child.x: ${super@Child.x}")     // 4) Base의 x 접근
        }
    }
}

// 앵글브라켓을 사용한 이름 중복 해결
open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()")        // 인터페이스는 기본적으로 open이다
    fun b() = println("B Interface b()")
}

class C : A(), B {      // 1) 콤마(,)를 이용해 클래스와 인터페이스를 지정
    // 컴파일 되려면 f()가 오버라이딩 되어야 한다
    override fun f() = println("C Class f()")
    fun test() {
        f()     // 2) 현재 클래스의 f()
        b()     // 3) 인터페이스 B의 b()
        super<A>.f()        // 4) A 클래스의 f()
        super<B>.f()        // 5) B 클래스의 f()
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()      // 이너 클래스 Inside의 메서드 test() 실행
    println()
    val c = C()
    c.test()
}