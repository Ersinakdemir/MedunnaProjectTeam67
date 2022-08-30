package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US27_Pojo;
import utilities.Authentication;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US27_stepsApi {

    US27_Pojo expectedData;
    Response response;
    US27_Pojo actuelData;


    @Given("User goes to the URL")
    public void user_goes_to_the_url() {
        //spec.pathParams("first", "api", "second", "c-messages");
        expectedData=new US27_Pojo("ggfdgfdg","gdgfdg@emfdsf.com", "ozcan", "dsfdsf");

        //response=given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response=given().headers(//headers olacak bu onemli
                        "Authorization",
                        "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                body(expectedData).when().post(ConfigurationReader.getProperty("put_endpoint"));

        actuelData=response.as(US27_Pojo.class);
    }
    @Then("The user verifies that creating and reading the data is seccessful")
    public void the_user_verifies_that_creating_and_reading_the_data_is_seccessful() {
        assertEquals(201, response.getStatusCode());
        assertEquals(expectedData.getName(),actuelData.getName());
        assertEquals(expectedData.getEmail(),actuelData.getEmail());
        assertEquals(expectedData.getSubject(),actuelData.getSubject());
        assertEquals(expectedData.getMessage(),actuelData.getMessage());
    }
}
