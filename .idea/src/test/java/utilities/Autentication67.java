package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Autentication67 {

    /*
    {
  "password": "string",
  "rememberMe": true,
  "username": "string"
}
     */
    public static String genereatToken() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();

        //Set the url
        spec.pathParams("1", "api", "2", "authenticate");

        //Set the expected data

        Map<String, Object> data = new HashMap<>();
        data.put("username","team67");
        data.put("password","team67..");
        data.put("rememberMe","true");


        //Send the request get the respons

        Response respons = given().spec(spec).contentType(ContentType.JSON).body(data).when().post("/{1}/{2}");


        JsonPath jsonpath=respons.jsonPath();


return jsonpath.getString("id_token");
    }
}
