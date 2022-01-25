package tcsfrescoplay.kotlinultimatesalto.course

import kotlin.reflect.KProperty

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        //super special logic
        return "$thisRef, is delegating '${property.name}' to MyDelegate!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        //super special logic
        println("$value is being assigned to '${property.name}' in $thisRef.")
    }
}

/**
 * thisRef refers to the class that delegates propety to MyDelegate.
 * property refers to the property being delegated.
 * value is the new value assigned to the property.
 */

class Test {
    var p: String by MyDelegate()
}

fun main(args: Array<String>) {
    val t = Test()
    t.p = "new value"
    print(t.p)
}

/**
 * Output:
 * new value is being assigned to 'p' in tcsfrescoplay.kotlinultimatesalto.course.Test@179d3b25.
 * tcsfrescoplay.kotlinultimatesalto.course.Test@179d3b25, is delegating 'p' to MyDelegate!
 */