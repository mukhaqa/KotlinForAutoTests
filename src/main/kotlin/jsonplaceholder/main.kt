package jsonplaceholder

import User
import okhttp3.OkHttpClient
import okhttp3.Request
import com.google.gson.Gson

fun main() {
    val client = OkHttpClient()
    val request = Request.Builder()
        .url("https://jsonplaceholder.typicode.com/comments/1")
        .build()

    val response = client.newCall(request).execute()
    val json = response.body?.string()

    val gson = Gson()
    val user = gson.fromJson(json, Comment::class.java)

    println(user)
}