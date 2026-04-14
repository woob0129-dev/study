package codetest.programmers.lv1

fun solution70128(a: IntArray, b: IntArray): Int {
    var answer: Int = 0

    for (i in a.indices) {
        answer += a[i] * b[i]
    }

    return answer
}

// fun solution(a: IntArray, b: IntArray) = a.zip(b).sumOf { it.first * it.second }