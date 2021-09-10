package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var mult = readLine().toInt() * readLine().toInt() * readLine().toInt()

    val answer: Array<Int> = Array(10) { 0 }

    while (mult != 0) {
        answer[mult % 10]++
        mult /= 10
    }

    val sb = StringBuilder()
    for (count in answer)
        sb.append(count).append('\n')

    println(sb)
}
