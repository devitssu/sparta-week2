class RemainderOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Long {
        return num1.toLong() % num2.toLong()
    }
}
