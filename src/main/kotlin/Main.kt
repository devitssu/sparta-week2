fun main() {
    while (true) {
        try {
            val operator: String = getOperator()
            if(operator == "exit") return

            val (num1, num2) = getNumbers()

            val result = Calculator(operator, num1, num2).operate()

            println("$num1 $operator $num2 = $result 입니다.\n=================== \n")

        } catch (e: NumberFormatException) {
            println("입력값이 숫자가 아니거나 숫자 범위에 맞지 않습니다.\n=================== \n")
        } catch (e: IllegalArgumentException) {
            println(e.message)
            println("\n=================== \n")
        }

    }
}

fun getOperator(): String {
    println("연산자를 선택해주세요.")
    println("1. + 2. - 3. * 4. / 5. % 6. 종료")

    val operatorInput: Int? = readLine()?.toInt()

    return when (operatorInput) {
        1 -> "+"
        2 -> "-"
        3 -> "*"
        4 -> "/"
        5 -> "%"
        6 -> "exit"
        else -> throw IllegalArgumentException("유효하지 않은 연산자입니다.")
    }
}


fun getNumbers(): Pair<Int, Int> {
    println("첫번쨰 숫자를 입력해주세요.")
    val num1: Int = readLine()?.toInt() ?: 0

    println("두번쨰 숫자를 입력해주세요.")
    val num2: Int = readLine()?.toInt() ?: 0

    return Pair(num1, num2)
}
