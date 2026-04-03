package codetest.programmers.lv1

fun solution12933(n: Long): Long {

    var str = ""
    n.toString().map { it }.sortedDescending().forEach {
        str += it
    }

    return str.toLong()
}


// fun solution(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()