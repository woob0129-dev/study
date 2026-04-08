package codetest.programmers.lv1

import java.util.Stack

fun solution64061(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    val copy = board.map { it.clone() }.toTypedArray()
    val stack = Stack<Int>()
    stack.push(0)
    moves.forEach { move ->
        for (i in board.indices) {
            if (copy[i][move-1] > 0) {
                if (stack.peek() == copy[i][move-1]) {
                    stack.pop()
                    answer += 2
                } else {
                    stack.push(copy[i][move-1])
                }
                copy[i][move-1] = 0
                break
            }
        }
    }
    return answer
}