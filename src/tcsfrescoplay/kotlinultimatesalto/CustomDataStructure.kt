package tcsfrescoplay.kotlinultimatesalto

// All test cases Passed
class DS{
    var count = 0
    var arr = arrayListOf<Int>()
    fun insert(a : Int) : Int {
        var cnt = 0
        arr.add(a)
        count++
        for (i in arr) {
            if (i == a) cnt++
        }
        return cnt
    }

    fun delete(a : Int) : Int {
        var cnt = 0
        if (arr.remove(a)) count--
        for (i in arr) {
            if (i == a) cnt++
        }
        return cnt
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()
    val ds:DS=DS();
    for (i in 0 until t) {
        val op = readLine()!!
        when(op){
            "i"-> println(ds.insert(readLine()!!.trim().toInt()))
            "d"-> println(ds.delete(readLine()!!.trim().toInt()))
            else->println(ds.count)
        }
    }
}
