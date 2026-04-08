package codetest.programmers.lv1

fun solution42862(n: Int, lost: IntArray, reserve: IntArray): Int {

    val duplication = lost.filter { reserve.contains(it) }
    val newLost = lost.filter { !duplication.contains(it) }.toMutableSet()
    val newReserve = reserve.filter { !duplication.contains(it) }.toMutableSet()

    newReserve.sorted().forEach {
        if (newLost.contains(it - 1)) {
            newLost.remove(it - 1)
        } else if (newLost.contains(it + 1)) {
            newLost.remove(it + 1)
        }
    }

    return n - newLost.size
}