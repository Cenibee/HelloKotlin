package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.pow

fun main() {
    val st = StringTokenizer(BufferedReader(InputStreamReader(System.`in`)).readLine())
    var sum = 0
    for (i in 1..5) sum += st.nextToken().toFloat().pow(2).toInt()
    println(sum % 10)
}