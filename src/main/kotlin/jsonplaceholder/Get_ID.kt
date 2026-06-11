package jsonplaceholder
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Retrofit
import kotlinx.coroutines.runBlocking
import retrofit2.converter.gson.GsonConverterFactory

data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String
)

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

data class Comment(
    val postId: Int,
    val id: Int,
    val name: String,
    val email: String,
    val body: String
)

interface Api {
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: Int): User
}

