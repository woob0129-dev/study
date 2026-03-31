package codetest.programmers.lv1

fun solution12922(n: Int): String {
    var answer = ""

    for (i in 1..n/2) {
        answer += "수박"
    }
    if (n%2 == 1) {
        answer += "수"
    }

    return answer
}

//
// fun solution(n: Int): String {
//     return "수박".repeat(n / 2) + if (n % 2 != 0) "수" else ""
// }

// fun solution(n: Int): String = String(CharArray(n,{i-> if(i%2==0) '수' else '박'}))