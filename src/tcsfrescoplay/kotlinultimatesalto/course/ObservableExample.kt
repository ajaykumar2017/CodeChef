package tcsfrescoplay.kotlinultimatesalto.course

import kotlin.properties.Delegates

class Learner {
    var name: String by Delegates.observable("init val") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val learner = Learner()
    learner.name = "first"
    learner.name = "second"
}