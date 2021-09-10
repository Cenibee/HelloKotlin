package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val line = readLine()

    var answer = if (line[0] == ' ') 0 else 1
    for (c in line)
        if (c == ' ') answer += 1
    if (line[line.lastIndex] == ' ') answer -= 1

    println(answer)
}