package codetest.programmers.lv1

fun solution12928(n: Int): Int {
    var answer = n

    for (i in 1..n/2) {
        if (n % i == 0) answer += i
    }

    return answer
}

//fun solution(n: Int): Int = n + (1..n/2).filter { n % it == 0 }.sum()
