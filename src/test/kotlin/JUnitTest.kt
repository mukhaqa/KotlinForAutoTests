import Task1_Calculator.Calculator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

/*class JUnitTest { // простые тесты JUnit
    val a: Int=5
    val b: Int=3
    val mult = a * b
    val dlina = "Kotlin"
    @Test
    fun testMultiplication() {
        assertEquals(15, mult)
    }
    @Test
    fun lengthAssertion(){
        val assert = dlina.length
        assertEquals(6, assert)
    }
}


class calc { // Тесты на калькулятор через вызов класса
    private lateinit var calculator: Calculator
    @BeforeEach
    fun setUp() {
        calculator= Calculator()
    }
    @AfterEach
    fun tearDown() {
        println("Тест завершен")
    }
    @Test
    fun addition() {
        assertEquals(10, calculator.add(5, 5))
    }
}

class parametrizedTest{ //Параметризованный тест (несколько сразу)
    @ParameterizedTest
    @CsvSource (
        "5,5,10",
        "10,20,30",
        "20,30,50",
        "100,500,600"
    )
    fun ProverkaCalculator(a: Int, b: Int, result: Int) {
        val calculator = Calculator()
        assertEquals(result, calculator.add(a, b))
    }
} */


