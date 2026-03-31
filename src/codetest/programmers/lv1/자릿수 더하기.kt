package codetest.programmers.lv1


fun solution12931(n: Int): Int {
    var answer = 0
    n.toString().forEach { c ->
        answer += c.code - '0'.code
    }
    return answer
}