package BasicKotlin1.BasicKotlin1_Chapter5

//for(요소 변수 in 컬렉션 혹은 범위){
//    반복한 구문
//}
fun main() {
    var sum = 0

    // 기본적으로 kotlin 반복문에서는 값이 오르는 경우만 존재(i++)
    for (x in 1..10) sum += x
    println("BasicKotlin1_Chapter4.sum: $sum")

    // 하행하려면 downTo 사용
    print("하행 반복문(i--): ")
    for (x in 5 downTo 1) print("$x ")
    println()

    // 일정 step에 따라 증가
    print("특정 step에 따라 증가(i = i + 2): ")
    for (x in 1..5 step 2) print("$x ")
    println()

    // 혼합 사용
    print("i--와 i = i - 2 혼합 사용: ")
    for (x in 5 downTo 1 step 2) print("$x ")
    println()

    var total1 = 0
    for (num in 1..100 step 2) {  // 이때는 홀수들의 합
        total1 += num
    }
    println("total 홀수들의 합: $total1")

    var total2 = 0
    for (num in 0..99 step 2) {  // 이때는 짝수들의 합
        total2 += num
    }
    println("total 짝수들의 합: $total2")
}