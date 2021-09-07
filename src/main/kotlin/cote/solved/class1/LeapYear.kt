package cote.solved.class1

fun main() {
    var year = 0
    var read = System.`in`.read()
    while (read.toChar() != '\n') {
        year = year * 10 + read - 48
        read = System.`in`.read()
    }
    println(if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0 )
}