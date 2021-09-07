package cote.solved.class1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val size = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    for (l in 1..size) {
        for (space in l until size) print (' ')
        for (star in 1..l) print('*')
        println()
    }
}