package codetest.programmers.lv1

fun solution12943(num: Int): Int {

    fun loop(num: Long, count: Int): Int {
        if (num == 1.toLong()) return count

        if (count < 500) {
            return if (num % 2 == 0.toLong()) loop(num/2, count+1)
            else loop(num*3+1, count+1)
        }
        return -1
    }

    return loop(num.toLong(), 0)
}

//tailrec fun loop(num: Long, count: Int): Int {
//    return when {
//        num == 1L -> count
//        count > 500 -> -1
//        else -> loop(if (num%2 == 0L) num/2 else num*3+1, count+1)
//    }
//}