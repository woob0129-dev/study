package codetest.programmers.lv1

fun solution12950(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()
    for (i in arr1.indices) {
        var temp = intArrayOf()
        for (j in arr1[i].indices) {
            temp += arr1[i][j] + arr2[i][j]
        }
        answer += temp
    }
    return answer
}

//fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
//    return Array(arr1.size) { row ->
//        IntArray(arr1[0].size) { col ->
//            arr1[row][col] + arr2[row][col]
//        }
//    }
//}