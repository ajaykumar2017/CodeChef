package tcsfrescoplay.kotlinultimatesalto

// All test cases passed
operator fun String.div(other : String): String {
    var temp = ""
    for (i in other) {
        if (this.contains(i) && !temp.contains(i)) temp += i
    }
    return temp
}

fun main() {
    val a: String = readLine()!!
    val b: String = readLine()!!
    val result = a/b
    println(result)
}