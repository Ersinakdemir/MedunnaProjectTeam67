package stepdefinitions.apiSteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Test1;
import pojos.TestItemsPost;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static utilities.Authentication.generateToken;

public class US17_Api_TestItems {
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
    Faker faker = new Faker();
    Response response;
    TestItemsPost testItemsPost = new TestItemsPost();
    Test1[] testItemsGet;
    int price = 75;
    String name = faker.name().name();

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
        testItemsPost.setCreatedBy("team67");
        testItemsPost.setPrice(price);
        testItemsPost.setDefaultValMax("86");
        testItemsPost.setDefaultValMin("56");
        testItemsPost.setName(name);
        testItemsPost.setDescription("olur ins");
        testItemsPost.setCreatedDate("2022-08-29T00:00:00Z");
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
            response.then().assertThat().statusCode(201);
            response.then().assertThat().body("price", equalTo(price))
                    .body("createdBy", equalTo("team67"))
                    .body("description", equalTo("olur ins"))
                    .body("name", equalTo(name));
        }
    Test1 test1put = new Test1();

    @Given("kullanici test items icin put request yapar")
    public void kullanici_test_items_icin_put_request_yapar() {
        //test1put.setCreatedBy("era");
        test1put.getId(30199);
        test1put.setPrice(86);
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(test1put).contentType(ContentType.JSON).when()
                .put(ConfigurationReader.getProperty("test_items_endpoint"));


    }
    @Then("kullanici test items icin put request validation yapar")
    public void kullanici_test_items_icin_put_request_validation_yapar() throws IOException {
        ObjectMapper obj =new ObjectMapper();
        //testItemsGet =obj.readValue(response.asString(),Test1[].class);
        test1put =obj.readValue(response.asString(),Test1.class);
        System.out.println(test1put.getId(30199));
        response.then().assertThat().statusCode(200);

    }

}
