package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import java.lang.Math

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val hour = st.nextToken().toInt()
    val min = st.nextToken().toInt()
    println("${if (min < 45) if (hour >= 1) hour - 1 else 23 else hour} ${Math.floorMod(min - 45, 60)}")
}
