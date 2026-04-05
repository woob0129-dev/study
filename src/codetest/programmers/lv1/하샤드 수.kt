package codetest.programmers.lv1

fun solution12947(x: Int): Boolean {
    var sum = 0
    x.toString().forEach { c ->
        sum += c - '0'
    }
    return x % sum == 0
}