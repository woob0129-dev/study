package codetest.programmers.lv1

fun solution12926(s: String, n: Int): String {
    var answer = ""

    s.forEach { c ->
        if (c == ' ') {
            answer += c
        } else {
            var temp = c + n
            if (temp > 'z') temp -= 26
            else if (c < 'a' && temp > 'Z') temp -= 26
            answer += temp
        }
    }

    return answer
}