package Task1_Calculator

class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Double {
        if (b == 0) throw IllegalArgumentException("Деление на ноль невозможно")
        return a.toDouble() / b
    }
}