package tcsfrescoplay.kotlinultimatesalto.course

import kotlin.properties.Delegates

var someData: Int by Delegates.vetoable(0) {
    property, oldValue, newValue ->
    println("${property.name}: $oldValue -> $newValue")
    newValue >= 0
}

fun main(args: Array<String>) {
    someData = -1
    println("someData = $someData")
    someData = 1
    println("someData = $someData")
}
/**
 * Output:
 * someData: 0 -> -1
 * someData = 0
 * someData: 0 -> 1
 * someData = 1
 */