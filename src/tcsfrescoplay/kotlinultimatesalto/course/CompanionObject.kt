package tcsfrescoplay.kotlinultimatesalto.course

fun main(args: Array<String>) {
    println(Test2.a)
    Test2.a = 10
    println(Test2.a)
}

class Test2 {
    var b: Int = 1

    companion object {
        var a: Int = 1
    }
}