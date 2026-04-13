package Task2_EmailValidator

class EmailValidator {
    fun isValid(email: String): Boolean {
        if (email.startsWith(".") || email.endsWith(".")) {
            println("Email не должен начинаться или заканчиваться точкой")
            return false
        }

        if (!email.contains("@")) {
            println("Email должен содержать символ @")
            return false
        }

        val domain = email.substringAfter("@")
        if (!domain.contains(".")) {
            println("Домен должен содержать точку")
            return false
        }
        else
        println("Ваш email: $email")
        return true
    }
}