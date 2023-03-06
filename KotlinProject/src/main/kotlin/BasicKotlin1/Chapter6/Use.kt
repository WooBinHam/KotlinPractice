package BasicKotlin1.Chapter6

import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.FileReader
import java.io.PrintWriter

private fun readFirstLine(): String {
    BufferedReader(FileReader("test.file")).use { return it.readLine() }
}

fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}