package stepdefinitions.apiSteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static utilities.Autentication67.genereatToken;

public class US028_ApiSteps {
    Response response;
    JsonPath json;
    Country country = new Country();
    Country[] countryarr;
    Country1 coutrpost=new Country1();
    State stat = new State();
    State1[] statarr;
    StatPost stpost=new StatPost();

    @Given("Kullanici ulkeler icin get request yapar")
    public void kullanici_ulkeler_icin_get_request_yapar() {
        response = given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/countries");


        response.prettyPrint();
    }

    @Given("Kullanici gelen ulkeler datasini de-serealisation yapar")
    public void kullanici_gelen_ulkeler_datasini_de_serealisation_yapar() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        response.then().assertThat().statusCode(200);
        countryarr = obj.readValue(response.asString(), Country[].class);

    }

    @Then("Kullanici eklenen ulkeleri ulkeler datasindan valide eder")
    public void kullanici_eklenen_ulkeleri_ulkeler_datasindan_valide_eder() {
        List<String> name = new ArrayList<>();
        for (int i = 0; i < countryarr.length; i++) {
            name.add(countryarr[i].getName());

        }
        name.stream().filter(t -> t.equalsIgnoreCase("Malta"));


    }

    @Given("Kullanici eklenecek ulke icin post request yapar")
    public void kullanici_eklenecek_ulke_icin_post_request_yapar() {

        coutrpost.setName("yenni");
        response = given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(coutrpost).contentType(ContentType.JSON).when().post("https://medunna.com/api/countries");


    }


    @Then("Kullanici post request validasyonu yapar")
    public void kullanici_post_request_validasyonu_yapar() {
        JsonPath jsp=response.jsonPath();
        assertEquals(coutrpost.getName(),jsp.getString("name"));

    }

    @Given("Kullanici eyalet icin get request yapar")
    public void kullanici_eyalet_icin_get_request_yapar() {
        response = given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/c-states");


        //response.prettyPrint();
    }


    @Given("Kullanici gelen eyalet datasini de-serealisation yapar")
    public void kullanici_gelen_eyalet_datasini_de_serealisation_yapar() throws IOException {

        ObjectMapper obj=new ObjectMapper();
        statarr=obj.readValue(response.asString(), State1[].class);


    }

    @Then("Kullanici eklenen eyaleti eyaletler  datasindan valide eder")
    public void kullanici_eklenen_eyaleti_eyaletler_datasindan_valide_eder() {
        for (int i = 0; i < statarr.length; i++) {
            hasItems("Magoudichaux",statarr[i].getName());

        }


    }

    @Given("Kullanici eklenecek eyalet icin post request yapar")
    public void kullanici_eklenecek_eyalet_icin_post_request_yapar() {
        stpost.setName("yenni");
        //stpost.getCountry().setName("yennii");
        response = given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + genereatToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(stpost).contentType(ContentType.JSON).when().post("https://medunna.com/api/c-states");

    }

    @Then("Kullanici eyalet icin post request validasyonu yapar")
    public void kullaniciEyaletIcinPostRequestValidasyonuYapar() {
        response.prettyPrint();
        JsonPath jsn=response.jsonPath();
       // assertEquals(stpost.getName(),jsn.getString("name"));
    }
}
