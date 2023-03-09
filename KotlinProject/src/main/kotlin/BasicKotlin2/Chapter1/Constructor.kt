package BasicKotlin2.Chapter1

// 기존 코드
/*
class Bird {
    var name: String = "noname"
    val wing: Int = 2
    var beak: String = "short"
    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird()   // 이때는 생성자를 정의하지 않았기 때문에 특정 매개변수가 인자로 들어가지는 않는다.

    coco.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    coco.name = "coco"
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}
 */

// 부 생성자 이용
/*
class Bird {
    // 프로퍼티 나열

		// 부 생성자로 내열
    var name: String
    val wing: Int
    var beak: String

    // 생성자로 초기화
    constructor(name: String, _wing: Int, _beak: String){   // 부 생성자
        // 부 생성자의 매개변수와 클래스의 매개변수 이름이 같은 경우에는 this를 통해서 클래스의 매개변수와 생성자 매개변수를 연결(할당)
        this.name = name
        // 통상적으로 생성자의 매개변수에는 같은 이름으로 하되 앞에 언더바(_)를 넣어준다. 이때는 this 키워드가 필요 없다.
        wing = _wing
        beak = _beak
    }

    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco",2,"long")       // 부 생성자를 사용할 때에는 이 안에 매개변수에 값을 넣어주어야 한다.

    coco.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}
 */

// 주 생성자 이용
/*
class Bird constructor(name: String, _wing: Int, _beak: String) {
    // 프로퍼티 나열

    // 주 생성자로 나열
    var name: String = name
    val wing: Int = _wing
    var beak: String = _beak

    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")       // 생성자를 사용할 때에는 이 안에 매개변수에 값을 넣어주어야 한다.

    coco.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}
 */

// 주 생성자에서 코드 간략화
/*
class Bird(var name: String, val wing: Int, var beak: String) {
    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")       // 부 생성자를 사용할 때에는 이 안에 매개변수에 값을 넣어주어야 한다.

    coco.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}
 */

// 초기화 블록을 사용해서 간단한 코드 넣어보기
/*
class Bird(var name: String, val wing: Int, var beak: String) {
     // 생성자 내에 간단한 코드를 넣으려면?
     init {
         println("---------init start---------")
         name = name.capitalize()
         println("name: $name, wing: $wing, beak: $beak")
         println("---------init end---------")
     }
    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")       // 부 생성자를 사용할 때에는 이 안에 매개변수에 값을 넣어주어야 한다.

    coco.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}
 */

// 여러개의 부 생성자를 이용해보기
class Bird {
    var name: String
    var wing: Int
    var beak: String

    constructor(_name: String, _wing: Int, _beak: String) {     // 부 생성자
        name = _name
        wing = _wing
        beak = _beak
    }

    // 매개변수가 같은 경우에는 에러가 남. 그래서 매개변수가 다르게끔 부 생성자를 구성해야 함.
    constructor(_name: String, _beak: String) {     // 부 생성자
        name = _name
        wing = 2
        beak = _beak
    }

    // 필요한 만큼의 함수들 나열 (메소드)
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco1 = Bird("coco", 2, "long")       // 부 생성자를 사용할 때에는 이 안에 매개변수에 값을 넣어주어야 한다.
    val coco2 = Bird("coco", "long")         // 자동으로 두번째 부 생성자가 호출된다.

    coco1.fly()          // 기본적으로 자기 클래스명에 해당되는 함수를 통해서 객체가 만들어진다.
    println(coco1.name)
    println(coco1.wing)
    println(coco1.beak)

    println("coco2 name: ${coco2.name}, coco2 wing: ${coco2.wing}, coco2 beak: ${coco2.beak}")
}