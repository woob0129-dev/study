package codetest.programmers.lv1

fun solution68644(numbers: IntArray): IntArray {
    val answer = mutableSetOf<Int>()

    for (n1 in numbers.indices) {
        for (n2 in numbers.indices) {
            if (n1 == n2) continue
            answer.add(numbers[n1] + numbers[n2])
        }
    }

    return answer.sorted().toIntArray()
}