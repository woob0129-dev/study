package codetest.programmers.lv1

fun solution12903(s: String): String {
    val len = s.length
    return if (len % 2 != 0) s[len/2].toString()
        else s.substring(len/2-1 .. len/2)
}

// Kotlin better way
//fun solution12903(s: String): String = s.slice(((s.length - 1) / 2)..(s.length / 2))