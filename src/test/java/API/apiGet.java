package API;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class apiGet {


        public static void main(String[] args) {
            RestAssured.baseURI = "https://api.example.com";
            Response response = given().get("/endpoint");

            // Validate status code
            if (response.getStatusCode() == 200) {
                System.out.println("Status Code is 200: Test Passed");
            } else {
                System.out.println("Status Code is not 200: Test Failed");
            }

            // Validate a field in the JSON response
            String value = response.jsonPath().getString("fieldName");
            if (value.equals("expectedValue")) {
                System.out.println("Field Validation Passed");
            } else {
                System.out.println("Field Validation Failed");
            }
        }
    }


