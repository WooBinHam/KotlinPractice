package BasicKotlin1.Chapter5

fun main() {
    for (i in 1..5) {
        if (i == 3) break
        print("$i ")
    }
    println()
    println("outside")

    for (i in 1..5) {
        if (i == 3) continue
        print("$i ")
    }
    println()
    println("outside")

    labelNoBreak()
    labelYesBreak()
}

// 라벨이 없는 break와 라벨이 있는 break
fun labelNoBreak() {
    println("labelNoBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelYesBreak() {
    println("labelYesBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}