package codetest.programmers.lv1

fun solution72410(new_id: String): String {

    var answer: String = new_id
        .lowercase()
        .filter { it.isLowerCase() ||  it.isDigit() || it in "._-" }
        .replace(Regex("\\.{2,}"), ".")
        .replace(Regex("^\\.|\\.$"), "")

    return if (answer.isEmpty()) "aaa"
        else if (answer.length >= 16) answer.substring(0, 15).replace(Regex("\\.$"), "")
        else if (answer.length == 1) answer + answer + answer
        else if (answer.length == 2) answer + answer[1]
        else answer
}