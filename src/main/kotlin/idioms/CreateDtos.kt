package idioms

data class Customer(val name: String, var email: String)

object Resource {
    const val name = "Name"
}

fun main() {
    val customer = Customer("name", "mail")

    println(customer.email)
    println(customer.name)
    println(customer.toString())

    val list = listOf(1, 2, 3, 4, 5, -1, 0, -5)
    list.filter { it > 0 }
    list.filter { x -> x > 0 }

    val p: String by lazy {
        val a = "att"
        val b = "att2"
        println("lazy execute")
        a + b
    }
    println("before print")
    println(p)
    println("after print")
    println("aaaabbbb".test())

    println(Resource.name)
}

fun String.test(): String {
    return this.substring(0, this.length / 2)
}