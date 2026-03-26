import codetest.backjoon.*
import codetest.programmers.*

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val input = readln()
    println("input $input")

    val input2 = readln()
    println("input2 $input2")

    val answer = solution12901(input.toInt(), input2.toInt())
    println("answer $answer")
}