package tcsfrescoplay.kotlinultimatesalto

/**
 * Reference: [https://www.youtube.com/watch?v=rWPqjr1ZmQU](https://www.youtube.com/watch?v=rWPqjr1ZmQU)
 */
// All test cases passed
import kotlin.reflect.KProperty
var evenBig: Int by NameDelegate()

class NameDelegate {
    var newValue: Int = 0
    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: Int
    ) {
        if (value != 0 && value % 2 == 0 && value > newValue) newValue = value
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return newValue
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()
    for (i in 0 until t) {
        evenBig = readLine()!!.trim().toInt()
        println(evenBig)
    }
}