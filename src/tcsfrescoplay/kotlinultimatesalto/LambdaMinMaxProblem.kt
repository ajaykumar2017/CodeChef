package tcsfrescoplay.kotlinultimatesalto

// All test cases passed
fun minMax(nums: Array<Int>, max: (a: Int, b: Int) -> Boolean): Int {
    var temp = nums[0]
    for (i in (0 + 1) until nums.size) {
        if (max(nums[i], temp))
            temp = nums[i]
    }
    return temp
}

fun main(args: Array<String>) {
    val numsCount = readLine()!!.trim().toInt()

    val nums = Array<Int>(numsCount, { 0 })
    for (i in 0 until numsCount) {
        val numsItem = readLine()!!.trim().toInt()
        nums[i] = numsItem
    }

    val type = readLine()!!.trim().toInt() != 0
    var lambda = { a: Int, b: Int -> a > b }
    if (!type) {
        lambda = { a: Int, b: Int -> a < b }
    }
    val result = minMax(nums, lambda)

    println(result)
}