package codetest.programmers.lv1

fun solution12930(s: String): String {
    var answer = ""

    s.split(" ").forEach { word ->
        word.forEachIndexed { index, c ->
            answer += if (index % 2 == 0) {
                c.uppercase()
            } else {
                c.lowercase()
            }
        }
        answer += " "
    }

    return answer.dropLast(1)
}

/*
fun solution(s: String) =
        s.split(" ").joinToString(" ") { word ->
            word
                .mapIndexed { index, char ->
                    if (index % 2 == 0) char.toUpperCase() else char.toLowerCase()
                }
                .joinToString("")
        }
 */