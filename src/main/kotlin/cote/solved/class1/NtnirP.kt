package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    for (i in readLine().toInt() downTo 1) sb.append(i).append('\n')
    println(sb)
}