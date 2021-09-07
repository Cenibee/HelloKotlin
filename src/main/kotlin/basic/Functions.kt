package basic

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    println(sum(3, 5))
    println("sum of 19 and 23 is ${sum(19, 23)}")
    println(printSum(-1, 8))
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun lambdaSum(a: Int, b: Int) = a + b

// Java 에서 void 는 Kotlin 에서 Unit 으로 사용할 수 있다.
// Unit 은 단 하나 존재하는 싱글톤 객체로, void 의 없음을 객체로 대체하기 존재한다.
//fun printSum(a: Int, b: Int): Unit
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

