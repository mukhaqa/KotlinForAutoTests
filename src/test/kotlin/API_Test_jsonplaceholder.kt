import io.restassured.RestAssured
import io.restassured.RestAssured.given
import jsonplaceholder.Post
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.jupiter.api.Test


 class API_Test_jsonplaceholder {
     /* @Test // Проверка статус кода
     fun Status_code() {
         RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
             given()
                 .get("/posts")
                 .then()
                 .statusCode(200)
}
     @Test //Проверка Заголовка
     fun Body() {
         RestAssured.baseURI="https://jsonplaceholder.typicode.com"
         given()
             .get("/posts/1")
             .then()
             .statusCode(200)
             .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))

     }

 @Test // Проверка заголовка после внесения изменений
 fun Create_post() {
     RestAssured.baseURI = "https://jsonplaceholder.typicode.com"

     val NewPost = """
     {
         "title": "Новый заголовок",
         "body": "Содержимое поста",
         "userId": 1
     }
 """.trimIndent()

     given()
         .header("Content-Type", "application/json")
         .body(NewPost)
         .post("/posts")
         .then()
         .statusCode(201)
         .body("title", equalTo("Новый заголовок"))
 }

 @Test // Удаление данных с помощью Delete-запроса
 fun `удаление поста возвращает статус 200`() {
     RestAssured.baseURI = "https://jsonplaceholder.typicode.com"

     given()
         .pathParam("id", 1)
         .delete("/posts/{id}")
         .then()
         .statusCode(200)
 }

 @ParameterizedTest // Параметризованный тест (запускает несколько раз)
 @ValueSource(ints = [1, 2, 3])
 fun Test_Headers (postId: Int) {
     RestAssured.baseURI = "https://jsonplaceholder.typicode.com"

     given()
         .pathParam("id", postId)
         .get("/posts/{id}")
         .then()
         .statusCode(200)
         .body("title", org.hamcrest.Matchers.notNullValue())
         .body("title", org.hamcrest.Matchers.not(org.hamcrest.Matchers.emptyString()))
 }

    @Test // негативный тест на поиск юзера (404 ошибка ОР)
    fun NegativeTest (){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
        given()
        .pathParam("id", 999)
            .get("/posts/{id}")
        .then()
        .statusCode(404)

    } */

     @Test
     fun 'создаем тест create/get/update/delete/post' (){



     }

    }