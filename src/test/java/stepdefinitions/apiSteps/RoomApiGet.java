package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room1;
import utilities.Authentication;
import utilities.ConfigurationReader;
import utilities.Driver;

import static io.restassured.RestAssured.given;

public class RoomApiGet {
    Response response;
    String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNjciLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY2MDMxODE5OH0.ZFGsSx7A94ANsMaiUowlmeJv0B73uXwdk_2kfwTqZpclFoeo_CtE24Th9cnT8GSpRJlkBERn25IQ086WqlZ3_Q";
    Room1 [] rooms;

    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {
       response=given().headers(//headers olacak bu onemli
               "Authorization",
               "Bearer " +Authentication.generateToken(),
               "Content-Type",
               ContentType.JSON,
               "Accept",
               ContentType.JSON).when().get(ConfigurationReader.getProperty("registrant_put_endpoint"));

      response.then().assertThat().statusCode(200);
      // response.prettyPrint();


    }
    @Given("kullanici gelen room datayi serealisation yapar")
    public void kullanici_gelen_room_datayi_serealisation_yapar() throws JsonProcessingException {

        ObjectMapper obj=new ObjectMapper();

        rooms=obj.readValue(response.asString(),Room1[].class);//nerden alacam neye donusturecem bunu belirleriz

        System.out.println("kactane room objesi var : "+rooms.length);

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].getDescription());
            System.out.println(rooms[i].getRoomNumber());

        }
    }
    @Then("kullanici room datasini valide eder")
    public void kullanici_room_datasini_valide_eder() {

    }
}
