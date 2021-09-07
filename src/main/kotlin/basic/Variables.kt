package basic

val PI = 3.14
var x2 = 0

fun incrementX2() {
    x2 += 1
}

fun main() {
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    println("a = $a, b = $b, c = $c")

    //======

    var x = 5
    x += 1

    println("x = $x")

    //======

    println("x2 = $x2; PI = $PI")
    incrementX2()
    println("incrementX2()")
    println("x2 = $x2; PI = $PI")

    //======

    var d = 1
    val s1 = "d is $d"

    d = 2
    val s2 = "${s1.replace("is", "was")}, but now is $d"
    println(s2)
}