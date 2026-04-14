package codetest.programmers.lv1

fun solution77884(left: Int, right: Int): Int {

    var yaksu = mutableMapOf<Int, Int>()
    for (i in left..right) {
        var count = 0
        for (j in 1..i) {
            if (i % j == 0) count++
        }
        yaksu[i] = count
    }

    return yaksu.keys.fold(0) { acc, i -> if (yaksu[i]!! % 2 == 0) acc + i else acc - i }
}

//fun solution(left: Int, right: Int)
//    = (left..right).sumOf { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }