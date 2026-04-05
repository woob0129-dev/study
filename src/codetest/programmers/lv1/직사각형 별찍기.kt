package codetest.programmers.lv1

fun solution12969(a: Int, b: Int): Array<Array<String>> {
    return Array(b) { row ->
        Array(a) { col ->
            "*"
        }
    }
}