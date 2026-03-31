package codetest.programmers.lv1

fun solution12932(n: Long): IntArray = n.toString().reversed().map{it.code - '0'.code}.toIntArray()