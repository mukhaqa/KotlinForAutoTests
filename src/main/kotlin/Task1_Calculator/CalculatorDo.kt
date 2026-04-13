package Task1_Calculator

fun main(args: Array<String>) {
    val calculator = Calculator()
    println("Введите число a: ")
    val a = readln().toInt()
    println("Введите число b: ")
    val b = readln().toInt()
    println(calculator.add(a,b))
    println(calculator.subtract(a,b))
    println(calculator.multiply(a,b))
    println(calculator.divide(a,b))
}
