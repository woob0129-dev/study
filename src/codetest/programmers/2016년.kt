package codetest.programmers

/*
문제
2016년 1월 1일은 금요일
2016년 a월 b일은 무슨 요일
SUN,MON,TUE,WED,THU,FRI,SAT
a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
a	b	result
5	24	"TUE"
*/

fun solution12901(a: Int, b: Int): String {
    val days = intArrayOf(0, 31, 29, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31)
    val week = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

    var totalDay = 1
    for (day in 1..<a) {
        totalDay += days[day]
    }
    totalDay += b

    return week[totalDay%7]
}