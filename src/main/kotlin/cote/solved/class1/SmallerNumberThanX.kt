package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val firstLineTokens = StringTokenizer(readLine())
    firstLineTokens.nextToken()
    val x = firstLineTokens.nextToken().toInt()

    val answer = StringBuilder()
    val aTokens = StringTokenizer(readLine())

    while (aTokens.hasMoreTokens())
        aTokens.nextToken().toInt().let { if (it < x) answer.append(it).append(' ') }

    println(answer)
}