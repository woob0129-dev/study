package codetest.programmers.lv1

fun solution77484(lottos: IntArray, win_nums: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    val zero = lottos.count { it == 0 }
    val eq = win_nums.count { lottos.contains(it) }

    answer += (7 - eq - zero).takeIf { it != 7 } ?: 6
    answer += (7 - eq).takeIf { it != 7 } ?: 6

    return answer
}