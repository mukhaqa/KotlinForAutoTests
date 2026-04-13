package Task2_EmailValidator

fun main (args: Array<String>) {
    val emailValidator = EmailValidator()
    print("Введите email: ")
   val email =  readln()
    emailValidator.isValid(email)
}
