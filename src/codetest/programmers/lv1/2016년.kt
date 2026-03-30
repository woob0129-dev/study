package codetest.programmers.lv1

fun solution12901(a: Int, b: Int): String {
    val days = intArrayOf(0, 31, 29, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31)
    val week = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

    var totalDay = -1
    for (day in 1..<a) {
        totalDay += days[day]
    }
    totalDay += b

    return week[totalDay%7]
}


/*
Kotlin better way
fun solution12901(a: Int, b: Int): String {
    val days = intArrayOf(0, 31, 29, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31)
    val week = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
    val totalDay = (1 until a).sumOf { days[it] } + b
    return week[totalDay%7]
}
*/
