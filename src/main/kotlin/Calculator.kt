package org.example

class Calculator(
    private val operator: String,
    private val num1: Int,
    private val num2: Int
) {
    fun operate(): Int {
        return when(operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw IllegalArgumentException("유효하지 않은 연산자입니다.")
        }
    }
}