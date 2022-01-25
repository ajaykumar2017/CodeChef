package tcsfrescoplay.kotlinultimatesalto.course

fun main(args: Array<String>) {
    println("a -> ${Test1.incrementA()}")
    println("b -> ${Test1.b}")
}

object Test1 {
    private var a: Int = 1
    var b: Int = 1

    fun incrementA(): Int {
        a++
        return a
    }
}

/**
 * a -> 2
 * b -> 1
 */