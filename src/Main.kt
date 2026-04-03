import codetest.programmers.lv1.solution12903
import codetest.programmers.lv1.solution12910
import java.io.File
import java.util.Scanner

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val scanner = Scanner(File("src/input"))

    println("\n=== === === === === ===\n")
    while (scanner.hasNext()) {

        val token = scanner.nextLine()
        if (token == "---") {
            println("\n=== 다음 테스트 케이스 ===\n")
            continue
        }

        val input = token
        val input2 = scanner.nextLine()

//        val answer = solution12901(input.toInt(), input2.toInt())
//        val answer = solution12903(input)
        val answer = solution12910(input.split(", ").map { it.toInt() }.toIntArray(), input2.toInt())

    //    println("answer $answer")
        println("answer ${answer.joinToString()}")

    }
}