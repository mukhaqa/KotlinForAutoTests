

data class User (
    val name: String,
    val age: Int,
    val email: String
)

class UserManager {
    private val users = mutableListOf<User>()
    fun addUser(user: User) {
        users.add(user)
    }
    fun removeUser(email: String) {
        users.removeIf {email == it.email}
    }
    fun findUserByEmail(email: String): User? {
        return users.find { it.email == email }
    }
    fun showAllUsers() {
        if (users.isEmpty()) {println("No users found")}
        else {users.forEach {println(it)} }
    }
    fun getAllUsers(): List<User> = users
    }



