package codetest.programmers.lv1

fun solution12948(phone_number: String): String {

    var str = ""
    for (i in 0 until phone_number.length - 4) {
        str += "*"
    }
    str += phone_number.substring(phone_number.length - 4)
//    str += phone_number.takeLast(phone_number.length - 4)

    return str
}
