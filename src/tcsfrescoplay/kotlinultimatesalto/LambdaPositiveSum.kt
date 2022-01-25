package tcsfrescoplay.kotlinultimatesalto

fun sum(nums: Array<Int>, add: (acc: Int, ele: Int) -> Int): Int {
    var res = 0
    for (i in nums) {
        if (i > 0)
            res = add(res, i)
    }
    return res
}

fun getLambda(): (acc: Int, ele: Int) -> Int {
    val lambda = { acc: Int, ele: Int -> acc + ele }
    return lambda
}

fun main() {
    val nums = arrayOf(1, 2, 3, 4)
    val result = sum(nums, getLambda())
    println(result)
}