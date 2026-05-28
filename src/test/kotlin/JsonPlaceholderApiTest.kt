import io.restassured.RestAssured
import io.restassured.RestAssured.given
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class JsonPlaceholderApiTest {
    companion object {
        @Test
        fun test() {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
        }
    }
@Test
fun testPost() {
    given()
        .get("/posts")
    .then()
    .statusCode(200)
}


    }