package codetest.programmers.lv1

fun solution81301(s: String): Int {
    return loop(s).toInt()
}
tailrec fun loop(s: String): String {
    return when {
        s.contains("zero") -> loop(s.replace("zero", "0"))
        s.contains("one") -> loop(s.replace("one", "1"))
        s.contains("two") -> loop(s.replace("two", "2"))
        s.contains("three") -> loop(s.replace("three", "3"))
        s.contains("four") -> loop(s.replace("four", "4"))
        s.contains("five") -> loop(s.replace("five", "5"))
        s.contains("six") -> loop(s.replace("six", "6"))
        s.contains("seven") -> loop(s.replace("seven", "7"))
        s.contains("eight") -> loop(s.replace("eight", "8"))
        s.contains("nine") -> loop(s.replace("nine", "9"))
        else -> s
    }
}

//fun solution(s: String): Int = s
//    .replace("one", "1")
//    .replace("two", "2")
//    .replace("three", "3")
//    .replace("four", "4")
//    .replace("five", "5")
//    .replace("six", "6")
//    .replace("seven", "7")
//    .replace("eight", "8")
//    .replace("nine", "9")
//    .replace("zero", "0")
//    .toInt()