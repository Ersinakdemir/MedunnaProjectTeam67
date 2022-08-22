package stepdefinitions.apiSteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Test1;
import pojos.TestItemsPost;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.Timer;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAppointmentData;

public class US17_TestItems {
    //{
    //  "createdBy": "string",
    //  "createdDate": "2022-08-20T13:24:51.270Z",
    //  "defaultValMax": "string",
    //  "defaultValMin": "string",
    //  "description": "string",
    //  "id": 0,
    //  "name": "string",
    //  "price": 0
    //}

    Response response;
    TestItemsPost testItemsPost = new TestItemsPost();
    Test1[] testItemsGet;

    @Given("Ad kulanici test items icin get riquest olusturur")
    public void ad_kulanici_test_items_icin_get_riquest_olusturur() {
        response = given().headers(
                        "Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON
                ).contentType(ContentType.JSON).when()
                .get(ConfigurationReader.getProperty("test_items_endpoint"));


    }
    @Given("Ad kullanici test items icin validation yapar")
    public void ad_kullanici_test_items_icin_validation_yapar() throws IOException {
        ObjectMapper obj =new ObjectMapper();
        testItemsGet =obj.readValue(response.asString(),Test1[].class);
        System.out.println(testItemsGet.length);
        for (int i = 0; i < testItemsGet.length; i++) {
            System.out.println(testItemsGet[i]);
        }
        response.then().assertThat().statusCode(200);
        Assert.assertTrue(testItemsGet.length>0);




    }


    @Given("kullanici test items icin post request yapar")
    public void kullanici_test_items_icin_post_request_yapar() {
        //Set the ecpected data
        testItemsPost.setCreatedBy("Eraa");
        testItemsPost.setPrice(25);
        testItemsPost.setDefaultValMax("76");
        testItemsPost.setDefaultValMin("56");
        testItemsPost.setName("Ali");
        testItemsPost.setDescription("olur ins");
        testItemsPost.setCreatedDate("2023-01-07T00:00:00Z");
        System.out.println(generateToken());
        response = given().headers(
                        "Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON
                ).body(testItemsPost).contentType(ContentType.JSON).when()
                .post(ConfigurationReader.getProperty("test_items_endpoint"));


    }
        @Then("kullanici test items icin post request validation yapar")
        public void kullanici_test_items_icin_post_request_validation_yapar () {

            //1. validation
           //response.then().assertThat().statusCode(20);
            response.then().assertThat().body("price", equalTo(25.0))
                    .body("createdBy", equalTo("Eraa"))
                    .body("description", equalTo("olur ins"))
                    .body("name", equalTo("Ali"));
        }


}
