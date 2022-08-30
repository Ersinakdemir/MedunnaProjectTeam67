package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room1Post;

import static io.restassured.RestAssured.given;
import static utilities.Autentication67.genereatToken;

public class Api3Utills {


    public static Response postrequest (String endPoind, Room1Post data){

    Response response=given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(data).contentType(ContentType.JSON).when().post(endPoind);

    return response;
    }
}
