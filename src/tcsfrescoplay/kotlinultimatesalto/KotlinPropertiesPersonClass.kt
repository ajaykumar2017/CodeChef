package tcsfrescoplay.kotlinultimatesalto

// All test cases passed
class Person {
    var firstName: String? = null
    var lastName: String? = null

    val fullName
        get() = "$firstName $lastName"
}

fun main(args: Array<String>) {
    val fName: String = readLine() ?: ""
    val lName: String = readLine() ?: ""
    val p = Person()
    p.firstName = fName
    p.lastName = lName
    println(p.fullName)
}