package codetest.programmers.lv1

fun solution12940(n: Int, m: Int): IntArray {
    var answer = intArrayOf()

    for (i in n downTo 1) {
        if (n % i == 0 && m % i == 0) {
            answer += i
            break
        }
    }

    for (i in 1..n) {
        val v = i * m
        if (v % n == 0) {
            answer += v
            break
        }
    }

    return answer
}