package idioms

import java.io.File
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun main() {
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            TODO("Not yet implemented")
        }

        override fun sleep() {
            TODO("Not yet implemented")
        }
    }
//    myObject.sleep()

    val files = File("Test").listFiles()

    println(files?.size)
    println(files?.size ?: "empty")
    val values = mapOf("email" to "asdf", "a" to "qwer")
    val email = values["email"]
    println(email)

    email?.let { println("hi!") }


}

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}