package codetest.programmers.lv1

import kotlin.math.abs

fun solution67256(numbers: IntArray, hand: String): String {

    val result = StringBuilder()

    var left = 10
    var right = 12

    fun getDistance(from: Int, to: Int): Int {
        val f = if (from == 0) 11 else from
        val t = if (to == 0) 11 else to

        val fx = (f - 1) / 3
        val fy = (f - 1) % 3
        val tx = (t - 1) / 3
        val ty = (t - 1) % 3

        return abs(fx - tx) + abs(fy - ty)
    }

    for (num in numbers) {
        when (num) {
            1, 4, 7 -> {
                result.append("L")
                left = num
            }
            3, 6, 9 -> {
                result.append("R")
                right = num
            }
            else -> {
                val leftDist = getDistance(left, num)
                val rightDist = getDistance(right, num)

                if (leftDist < rightDist) {
                    result.append("L")
                    left = num
                } else if (leftDist > rightDist) {
                    result.append("R")
                    right = num
                } else {
                    if (hand == "left") {
                        result.append("L")
                        left = num
                    } else {
                        result.append("R")
                        right = num
                    }
                }
            }
        }
    }

    return result.toString()
}