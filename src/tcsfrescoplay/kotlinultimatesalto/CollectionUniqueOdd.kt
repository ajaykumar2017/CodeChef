package tcsfrescoplay.kotlinultimatesalto

// All Test Cases Passed

fun filter(nums: List<Int>): List<Int> {
    val numSet = mutableSetOf<Int>()
    for (i in nums) {
        if (i % 2 != 0) numSet.add(i)
    }
    return numSet.toList()
}

fun main(args: Array<String>) {
    val aCount = readLine()!!.trim().toInt()

    val list = mutableListOf<Int>()
    for (i in 0 until aCount) {
        val item = readLine()!!.trim().toInt()
        list.add(item)
    }

    val result = filter(list)

    result.forEach { println(it) }
}
