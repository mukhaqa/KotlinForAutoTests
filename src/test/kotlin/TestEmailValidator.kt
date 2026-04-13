import Task2_EmailValidator.EmailValidator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestEmailValidator {
    @Test
    fun testEmailValidator1() {
        val emailValidator = EmailValidator()
        val email = String
        assertEquals(true, emailValidator.isValid("m.ryslan99@mail.ru"))
    }
    @Test
    fun testEmailValidator2() {
        val emailValidator = EmailValidator()
        val email = String
        assertEquals(false, emailValidator.isValid ("m.ryslan99mail.ru"))
    }
    @Test
    fun testEmailValidator3() {
        val emailValidator = EmailValidator()
        val email = String
        assertEquals(false, emailValidator.isValid(".m.ryslan99@mail.ru"))
    }
    @Test
    fun testEmailValidator4() {
        val emailValidator = EmailValidator()
        val email = String
        assertEquals(false, emailValidator.isValid("m.ryslan99@mail.ru."))
    }
    @Test
    fun testEmailValidator5() {
        val emailValidator = EmailValidator()
        val email = String
        assertEquals(false, emailValidator.isValid("mryslan99@mailru"))
    }
}
