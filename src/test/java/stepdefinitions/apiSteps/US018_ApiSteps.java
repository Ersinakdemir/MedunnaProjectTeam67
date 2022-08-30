package stepdefinitions.apiSteps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Physician;
import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US018_ApiSteps {
    static Response response;
    static Physician physician = new Physician();

    public static void main(String[] args) throws IOException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunna_login_url")).build();
        spec.pathParams("1", "api", "2", "physicians","3","10518");
        // https://www.medunna.com/api/physicians/2051

        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(),Physician.class);
        System.out.println("Actual Data: " + actualPhisician);
        Assert.assertEquals("John", actualPhisician.getFirstName());
        Assert.assertEquals("Doe", actualPhisician.getLastName());
        Assert.assertEquals(10518,actualPhisician.getId());
        Assert.assertEquals("SURGERY",actualPhisician.getSpeciality());
    }

    @Given("C User set the path params for phyisician")
    public void c_user_set_the_path_params_for_phyisician() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunna_login_url")).build();
        spec.pathParams("1", "api", "2", "physicians","3","10518");

    }
    @Given("C user enters expected data for phyisician")
    public void c_user_enters_expected_data_for_phyisician() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
    }
    @Then("C user verify API records for phyisician")
    public void c_user_verify_api_records_for_phyisician() throws IOException {
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(),Physician.class);
        Assert.assertEquals("John", actualPhisician.getFirstName());
        Assert.assertEquals("Doe", actualPhisician.getLastName());
        Assert.assertEquals(10518,actualPhisician.getId());
        Assert.assertEquals("SURGERY",actualPhisician.getSpeciality());
    }
}
