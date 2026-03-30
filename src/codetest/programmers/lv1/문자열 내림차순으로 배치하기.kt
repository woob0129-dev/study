package codetest.programmers.lv1

fun solution12917(s: String): String {
    return s.map { it }.sortedDescending().joinToString("")
}

// Kotlin better way
// fun solution12917(s: String): String = String(s.toCharArray().sortedArrayDescending())