package tcsfrescoplay.kotlinultimatesalto.course

fun main(args: Array<String>) {
    val stringList: ArrayList<String> = arrayListOf<String>("Aman", "Ashish")
    stringList.printValue()
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f, 5.0f, 25.5f)
    floatList.printValue()
}

fun <T> ArrayList<T>.printValue() {
    for (element in this) {
        println(element)
    }
}