package `Chapter5-If,When,For,FlowControl`

fun main() {
    basicTryCatch()
    arithmeticExceptionTryCatch()
    stackTraceTryCatch()

    // throw를 사용해서 예외 발생시키기
    var amount = 600
    try {
        amount-=100
        checkAmount(amount)
    }catch (e:Exception){
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount:Int){
    if(amount<1000){
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
    }
}

fun basicTryCatch(){
    val a = 6
    val b = 0
    var c: Int
    try {
        c = a / b
        println("After Calculation")
    } catch (e: Exception) {
        println("Exception")
    } finally {
        println("Finally")
    }
}

// 산술 연산에 대한 예외를 따로 특정해서 잡을 때
fun arithmeticExceptionTryCatch(){
    val a = 6
    val b = 0
    var c: Int
    try {
        c = a / b
        println("After Calculation using ArithmeticException")
    } catch (e: ArithmeticException) {
        println("Exception using ArithmeticException")
    } finally {
        println("Finally using ArithmeticException")
    }
}

fun stackTraceTryCatch(){
    val a = 6
    val b = 0
    var c: Int
    // 스택의 추적
    try {
        c = a / b
        println("After Calculation using printStackTrace")
    } catch (e: Exception) {
        e.printStackTrace()
        println("Exception using printStackTrace")
    } finally {
        println("Finally using printStackTrace")
    }
}