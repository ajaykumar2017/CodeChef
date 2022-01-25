package tcsfrescoplay.kotlinultimatesalto.course

fun main(args: Array<String>) {
    printer.print();
}

open class Printer {
    open fun print() {
        println("default print")
    }
}

var printer: Printer = object : Printer() {
    override fun print() {
        println("custom impl")
    }
}