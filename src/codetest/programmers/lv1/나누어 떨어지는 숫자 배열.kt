package codetest.programmers.lv1

fun solution12910(arr: IntArray, divisor: Int): IntArray {
    var answer = mutableListOf<Int>()
    arr.forEach {
        if (it % divisor == 0) {
            answer.add(it)
        }
    }
    arr.filter { it % divisor == 0 }.map { it }.sorted()
    if (answer.isEmpty()) answer.add(-1)
    return answer.sorted().toIntArray()
}