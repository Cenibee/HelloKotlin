package basic

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("max of 0 and 42 is ${maxOf(2, 42)}")
    println("max of 0 and 42 is ${maxOf2(2, 42)}")
    println()

    //======

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    println()
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println()

    //======

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println()

    //======

    val objs = listOf(1, "Hello", 1000L, 2, "other")
    for (obj in objs) {
        println(describe(obj))
    }
    println()

    //======

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (i in 1..5) {
        print(i)
    }
    println()

    for (i in 1..10 step 2) {
        print(i)
    }
    println()
    for (i in 9 downTo 3 step 3) {
        print(i)
    }
    println()
    println()

    //======

    val fruits = setOf("apple", "banana", "kiwifruit", "avocado")
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
        "banana" in fruits -> println("non-juicy")
    }
    println()

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }