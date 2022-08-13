package stepdefinitions.apiSteps;

import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Room1;
import pojos.Room1Post;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Autentication67.genereatToken;

public class RoomApiGet {
    Response response;
    String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNjciLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY2MDMxODE5OH0.ZFGsSx7A94ANsMaiUowlmeJv0B73uXwdk_2kfwTqZpclFoeo_CtE24Th9cnT8GSpRJlkBERn25IQ086WqlZ3_Q";
    Room1 [] rooms;
    Room1Post room1Post =new Room1Post();
    Room1 roomput=new Room1();

    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {
       response=given().headers(//headers olacak bu onemli
               "Authorization",
               "Bearer " + genereatToken(),
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


    //post request

    @Given("Kullanici Roomlar icin post request yapar")
    public void kullanici_roomlar_icin_post_request_yapar() {
        //post request icin id siz bir pojo olmasi lazim



        //set the expected data
        room1Post.setRoomType("TWIN");
        room1Post.setPrice(1071);
        room1Post.setRoomNumber(44545);
        room1Post.setStatus(true);
        room1Post.setDescription("String");

        response=given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(room1Post).contentType(ContentType.JSON).when().post(ConfigurationReader.getProperty("room_post"));


    }
    @Then("kullanici post request validation yapar")
    public void kullanici_post_request_validation_yapar() throws JsonProcessingException {

        //1. validation
                            //post yaptigimizda status code 201 olur
        response.then().assertThat().statusCode(201);
        response.then().assertThat().body("price",equalTo(1071)).
                                    body("roomNumber",equalTo(44545)).
                                    body("roomType",equalTo("TWIN"));

        //2. validation
        JsonPath json=response.jsonPath();

        assertEquals(room1Post.getRoomType(),json.getString("roomType"));
        assertEquals(room1Post.getRoomNumber(),json.getInt("roomNumber"));
        assertEquals(room1Post.getPrice(),(int)json.getInt("price"));


        //3.validation

        Map<String,Object> actaulMapData=response.as(HashMap.class);
        assertEquals(room1Post.getRoomType(),actaulMapData.get("roomType"));
        assertEquals(room1Post.getRoomNumber(),actaulMapData.get("roomNumber"));
        assertEquals(room1Post.getPrice(),actaulMapData.get("price"));

        //4.validation

        Room1 room1actualdata=response.as(Room1.class);

        assertEquals(room1Post.getRoomType(),room1actualdata.getRoomType());
        assertEquals(room1Post.getRoomNumber(),room1actualdata.getRoomNumber());
        assertEquals(room1Post.getPrice(),room1actualdata.getPrice());

        //5. Validation

        ObjectMapper obj=new ObjectMapper();
        Room1 room2ActualData=obj.readValue(response.asString(),Room1.class);

        assertEquals(room1Post.getPrice(),room2ActualData.getPrice());
        assertEquals(room1Post.getRoomType(),room2ActualData.getRoomType());
        assertEquals(room1Post.getRoomNumber(),room2ActualData.getRoomNumber());

        //6. validation
        Gson gson=new Gson();

        Room1 room3ActualData=gson.fromJson(response.asString(),Room1.class);

        assertEquals(room1Post.getPrice(),room3ActualData.getPrice());
        assertEquals(room1Post.getRoomType(),room3ActualData.getRoomType());
        assertEquals(room1Post.getRoomNumber(),room3ActualData.getRoomNumber());


    }

    //put request


    @Given("kullanici roomlar icin put request yapar")
    public void kullanici_roomlar_icin_put_request_yapar() {
        roomput.setId(166549);
        roomput.setRoomType("TWIN");
        roomput.setRoomNumber(1071);
        roomput.setPrice(1071);
        roomput.setStatus(true);

        response=given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(roomput).contentType(ContentType.JSON).when().put(ConfigurationReader.getProperty("room_post"));
    }

    @Then("kullanici put request validation yapar")
    public void kullanici_put_request_validation_yapar() throws JsonProcessingException {
//1. validation
        //post yaptigimizda status code 201 olur
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("price", equalTo(1071)).
                body("roomNumber", equalTo(1071)).
                body("roomType", equalTo("TWIN"));

        //2. validation
        JsonPath json = response.jsonPath();

        assertEquals(roomput.getRoomType(), json.getString("roomType"));
        assertEquals(roomput.getRoomNumber(), json.getInt("roomNumber"));
        assertEquals(roomput.getPrice(), (int) json.getInt("price"));


        //3.validation

        Map<String, Object> actaulMapData = response.as(HashMap.class);
        assertEquals(roomput.getRoomType(), actaulMapData.get("roomType"));
        assertEquals(roomput.getRoomNumber(), actaulMapData.get("roomNumber"));
        assertEquals(roomput.getPrice(), actaulMapData.get("price"));

        //4.validation

        Room1 room1actualdata = response.as(Room1.class);

        assertEquals(roomput.getRoomType(), room1actualdata.getRoomType());
        assertEquals(roomput.getRoomNumber(), room1actualdata.getRoomNumber());
        assertEquals(roomput.getPrice(), room1actualdata.getPrice());

        //5. Validation

        ObjectMapper obj = new ObjectMapper();
        Room1 room2ActualData = obj.readValue(response.asString(), Room1.class);

        assertEquals(roomput.getPrice(), room2ActualData.getPrice());
        assertEquals(roomput.getRoomType(), room2ActualData.getRoomType());
        assertEquals(roomput.getRoomNumber(), room2ActualData.getRoomNumber());

        //6. validation
        Gson gson = new Gson();
        Room1 room3ActualData = gson.fromJson(response.asString(), Room1.class);

        assertEquals(roomput.getPrice(), room3ActualData.getPrice());
        assertEquals(roomput.getRoomType(), room3ActualData.getRoomType());
        assertEquals(roomput.getRoomNumber(), room3ActualData.getRoomNumber());


    }
    @Given("kullanici silinecek roomlar icin {string} ile delet request ister")
    public void kullanici_silinecek_roomlar_icin_ile_delet_request_ister(String id) {
       response=given().headers(//headers olacak bu onemli
              "Authorization",
              "Bearer " + genereatToken(),
              "Content-Type",
              ContentType.JSON,
              "Accept",
              ContentType.JSON).when().delete(ConfigurationReader.getProperty("room_post")+"/"+id);
    }

    @Then("kullanici delet requesti validation yapar")
    public void kullanici_delet_requesti_validation_yapar() {
        response.prettyPrint();
        response.then().assertThat().statusCode(204);
    }

}
