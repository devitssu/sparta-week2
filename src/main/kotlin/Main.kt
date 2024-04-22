package org.example

fun main() {
    while(true){
        try {
            println("연산자를 선택해주세요.")
            println("1. + 2. - 3. * 4. / 5. 종료")

            val operatorInput: Int? = readLine()?.toInt()
            if(operatorInput == 5) return
            val operator: String = when(operatorInput) {
                1 -> "+"
                2 -> "-"
                3 -> "*"
                4 -> "/"
                else -> throw IllegalArgumentException("유효하지 않은 연산자입니다.")
            }

            println("첫번쨰 숫자를 입력해주세요.")
            val num1: Int = readLine()?.toInt() ?: 0

            println("두번쨰 숫자를 입력해주세요.")
            val num2: Int = readLine()?.toInt() ?: 0

            val result = Calculator(operator, num1, num2).operate()

            println("결과 : $result\n=================== \n")
        } catch (e: IllegalArgumentException) {
            println(e.message)
            println("\n=================== \n")
        }

    }
}