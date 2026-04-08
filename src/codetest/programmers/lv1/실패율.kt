package codetest.programmers.lv1

fun solution42889(N: Int, stages: IntArray): IntArray {
    val fail = mutableMapOf<Int, Double>()
    var remaining = stages.size.toDouble()
    for (i in 1..N) {
        val count = stages.count { it == i }.toDouble()
        fail[i] = if (remaining > 0) count / remaining else 0.0
        remaining -= count
    }
    return fail.entries.sortedByDescending { it.value }.map { it.key }.toIntArray()
}