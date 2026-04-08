package codetest.programmers.lv1

fun solution42840(answers: IntArray): IntArray {
    var answer = intArrayOf()

    val s1 = intArrayOf(1, 2, 3, 4, 5)
    val s2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val s3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    var a1 = 0
    var a2 = 0
    var a3 = 0
    answers.forEachIndexed { index, i ->
        if (s1[index % s1.size] == i) a1++
        if (s2[index % s2.size] == i) a2++
        if (s3[index % s3.size] == i) a3++
    }

    val max = maxOf(a1, a2, a3)
    if (a1 == max) answer += 1
    if (a2 == max) answer += 2
    if (a3 == max) answer += 3

    return answer
}