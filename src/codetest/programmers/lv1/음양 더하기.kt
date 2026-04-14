package codetest.programmers.lv1

fun solution76501(absolutes: IntArray, signs: BooleanArray): Int {
    return absolutes.mapIndexed { index, i ->
        if (signs[index]) i else i * -1
    }.sum()
}

// fun solution(absolutes: IntArray, signs: BooleanArray) =
//        absolutes.foldIndexed(0) { idx, acc, num -> acc + if (signs[idx]) num else -num }