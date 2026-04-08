package codetest.programmers.lv1

fun solution42748(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()

    commands.forEach { command ->
        answer += array.slice(command[0]-1 until command[1]).sorted()[command[2]-1]
    }

    return answer
}

// fun solution42748(array: IntArray, commands: Array<IntArray>) = commands.map { command -> array.slice(command[0]-1 until command[1]).sorted()[command[2]-1] }.toIntArray()