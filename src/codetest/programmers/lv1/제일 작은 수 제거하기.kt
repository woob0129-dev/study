package codetest.programmers.lv1

fun solution12935(arr: IntArray): IntArray {
    println(arr.minOf { it })
    val answer = arr.filter { it != arr.minOf { it -> it } }
    return if (answer.isEmpty()) intArrayOf(-1)
    else answer.toIntArray()
}