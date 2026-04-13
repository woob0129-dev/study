import codetest.programmers.lv1.*
import java.io.File
import java.util.Scanner

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val scanner = Scanner(File("src/input"))

    println("\n=======================\n")
    while (scanner.hasNext()) {

        val token = scanner.nextLine()
        if (token == "---") {
            println("\n=== 다음 테스트 케이스 ===\n")
            continue
        }

        val input = token
//        val input2 = scanner.nextLine()
//        val input3 = scanner.nextLine()

//        val answer = solution12901(input.toInt(), input2.toInt())
//        val answer = solution12903(input)
//        val answer = solution12910(convertIntArray(input), input2.toInt())
//        val answer = solution12912(input.toInt(), input2.toInt())
//        val answer = solution12915(convertStringArray(input), input2.toInt())
//        val answer = solution12917(input)
//        val answer = solution12918(input)
//        val answer = solution12919(convertStringArray(input))
//        val answer = solution12922(input.toInt())
//        val answer = solution12925(input)
//        val answer = solution12926(input, input2.toInt())
//        val answer = solution12928(input.toInt())
//        val answer = solution12930(input)
//        val answer = solution12931(input.toInt())
//        val answer = solution12932(input.toLong())
//        val answer = solution12933(input.toLong())
//        val answer = solution12934(input.toLong())
//        val answer = solution12935(convertIntArray(input))
//        val answer = solution12937(input.toInt())
//        val answer = solution12940(input.toInt(), input2.toInt())
//        val answer = solution12943(input.toInt())
//        val answer = solution12944(convertIntArray(input))
//        val answer = solution12947(input.toInt())
//        val answer = solution12948(input)
//        val answer = solution12950(convertTwoIntArray(input), convertTwoIntArray(input2))
//        val answer = solution12954(input.toInt(), input2.toInt())
//        val answer = solution12969(input.toInt(), input2.toInt())
//        val answer = solution12977(convertIntArray(input))
//        val answer = solution42748(convertIntArray(input), convertTwoIntArray(input2))
//        val answer = solution42840(convertIntArray(input))
//        val answer = solution42862(input.toInt(), convertIntArray(input2), convertIntArray(input3))
//        val answer = solution42889(input.toInt(), convertIntArray(input2))
//        val answer = solution64061(convertTwoIntArray(input), convertIntArray(input2))
//        val answer = solution67256(convertIntArray(input), input2)
        val answer = solution68644(convertIntArray(input))



        println("answer")

//        println(answer)
        println(answer.joinToString(" "))
//        println(answer.joinToString("\n") { it.joinToString(" ") })

    }
}

fun convertIntArray(input: String): IntArray {
    return input.split(",").map { it.toInt() }.toIntArray()
}

fun convertStringArray(input: String): Array<String> {
    return input.split(",").map { it }.toTypedArray()
}

fun convertTwoIntArray(input: String): Array<IntArray> {
    return input.removePrefix("[[")
        .removeSuffix("]]")
        .split("],[")
        .map { row ->
            row.split(",").map { it.toInt() }.toIntArray()
        }
        .toTypedArray()
}