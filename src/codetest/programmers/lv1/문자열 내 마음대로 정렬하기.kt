package codetest.programmers.lv1

import java.util.TreeMap

fun solution12915(strings: Array<String>, n: Int): Array<String> {
    return strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
}