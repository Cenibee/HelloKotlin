package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val line = readLine()
    for (i in 2 downTo 0) {
        if (line[i] > line[i + 4]) {
            println("${line[2]}${line[1]}${line[0]}")
            return
        } else if (line[i] < line[i + 4]) {
            println("${line[6]}${line[5]}${line[4]}")
            return
        }
    }
}