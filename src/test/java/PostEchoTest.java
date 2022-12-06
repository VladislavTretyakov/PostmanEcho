import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

    public class PostEchoTest {
        @Test
        void shouldReturnBody() {
            // Given - When - Then

            given()
                    .baseUri("https://postman-echo.com")
                    .body("name")

                    .when()
                    .post("/post")
                    .then()
                    .statusCode(200)
                    .body("data", equalTo("name"))
            ;
        }
    }
