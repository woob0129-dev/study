package codetest.programmers.lv1

fun solution12954(x: Int, n: Int): LongArray {
    var answer = longArrayOf()
    for (i in 1..n) {
        answer += x.toLong() * i
    }
    return answer
}