package codetest.programmers.lv1

import kotlin.math.sqrt

fun solution12934(n: Long): Long {
    for (i in 1..n) {
        val xx = i * i
        if (xx == n) {
            return (i + 1) * (i + 1)
        } else if (xx > n) {
            return -1
        }
    }
    return -1
}