fun main() {
    val manager = UserManager()
    val user1 = User("Ruslan", 27, "ruslan@gmail.com")
    val user2 = User("Adelina", 22, "adelina@gmail.com")
    val user3 = User("Cheremsha", 10, "cheremsha1@gmail.com")

    manager.addUser(user1)
    manager.addUser(user2)
    manager.addUser(user3)
    println(manager.findUserByEmail("ruslan@gmail.com"))
}