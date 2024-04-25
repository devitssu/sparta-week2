import operation.*

class Calculator(
    private val operator: String,
    private val num1: Int,
    private val num2: Int
) {
    fun operate(): Long {
        return when (operator) {
            "+" -> operation(AddOperation(), num1, num2)
            "-" -> operation(SubtractOperation(), num1, num2)
            "*" -> operation(MultiplyOperation(), num1, num2)
            "/" -> operation(DivideOperation(), num1, num2)
            "%" -> operation(RemainderOperation(), num1, num2)
            else -> throw IllegalArgumentException("유효하지 않은 연산자입니다.")
        }
    }

    private fun operation(operation: AbstractOperation, num1: Int, num2: Int): Long {
        return operation.operate(num1, num2)
    }
}