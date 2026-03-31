package codetest.programmers.lv1

fun solution12918(s: String): Boolean {
    if (s.length == 4 || s.length == 6) {
        for (c in s) {
            if (c > '9') {
                return false
            }
        }
        return true
    }
    return false
}