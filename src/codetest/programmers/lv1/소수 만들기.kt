package codetest.programmers.lv1

fun solution12977(nums: IntArray): Int {
    var answer = 0

    for (i in 0 until nums.size - 2) {
        for (j in i + 1 until nums.size - 1) {
            for (k in j + 1 until nums.size) {
                val sum = nums[i] + nums[j] + nums[k]
                if(isPrime(sum)) answer++
            }
        }
    }

    return answer
}
fun isPrime(num: Int): Boolean{
    if (num < 2) return false
    for (i in 2..num/2) {
        if (num%i == 0) return false
    }
    return true
}