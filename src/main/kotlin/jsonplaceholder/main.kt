package jsonplaceholder
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Retrofit
import kotlinx.coroutines.runBlocking
import retrofit2.converter.gson.GsonConverterFactory

    fun main() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(Api::class.java)

    }
}