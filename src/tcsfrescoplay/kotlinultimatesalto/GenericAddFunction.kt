package tcsfrescoplay.kotlinultimatesalto

//All test cases passed
fun <T> add(a: T, b: T): T {
    when (a) {
        is Int -> {
            if (b is Int) return a.toInt().plus(b as Int) as T
            if (b is Double) {
                return "%.2f".format(a.toInt().plus(b as Double) as T) as T
            }
        }

        is Double -> {
            if (b is Int) return "%.2f".format(a.toDouble().plus(b as Int) as T) as T
            if (b is Double) return "%.2f".format(a.toDouble().plus(b as Double) as T) as T
        }

        is String -> {
            if (b is Int) return ("$a $b") as T
            if (b is Double) return return ("$a $b") as T
            if (b is String) return return ("$a $b") as T
        }
    }
    return "" as T
}

fun main(args: Array<String>) {
    var ip1: String = readLine()!!
    var ip2: String = readLine()!!
    var a: Any = ip1
    var b: Any = ip2
    if (ip1.toIntOrNull() != null) {
        a = ip1.toInt()
    } else if (ip1.toDoubleOrNull() != null) {
        a = ip1.toDouble()
    }

    if (ip2.toIntOrNull() != null) {
        b = ip2.toInt()
    } else if (ip2.toDoubleOrNull() != null) {
        b = ip2.toDouble()
    }
    val result = add(a, b)

    println(result)
}
