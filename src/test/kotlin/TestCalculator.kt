import Task1_Calculator.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun test1() {
        val calculator = Calculator()
        assertEquals(3, calculator.add(1, 2))
    }
    @Test
    fun test2() {
        val calculator = Calculator()
        assertEquals(1, calculator.subtract(2, 1))
    }
    @Test
    fun test3() {
        val calculator = Calculator()
        assertEquals(75, calculator.multiply(15, 5))
    }
    @Test
    fun test4() {
        val calculator = Calculator()
        assertEquals(5.0, calculator.divide(25, 5))
    }
}