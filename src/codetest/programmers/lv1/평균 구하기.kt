package codetest.programmers.lv1

fun solution12944(arr: IntArray): Double {
    var sum = 0.0
    arr.forEach {
        sum += it
    }
    return sum / arr.size
}