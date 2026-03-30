package codetest.programmers.lv1

fun solution12912(a: Int, b: Int): Long {
    var answer: Long = 0

    if (a < b) {
        for (i in a..b) {
            answer += i.toLong()
        }
    } else {
        for (i in b..a) {
            answer += i.toLong()
        }
    }

    return answer
}