package stepdefinitions.apiSteps;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointements2;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.Autentication67.genereatToken;
import static utilities.WriteToTxt2.saveAppointementData;

public class Appointements {
    Appointements2[] appointements;
    Response response;

    @Given("Kullanici appointement icin get request yapar")
    public void kullanici_appointement_icin_get_request_yapar() {
        response = given().headers(//headers olacak bu onemli
                        "Authorization",
                        "Bearer " + genereatToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                get(ConfigurationReader.getProperty("api_appointments"));


    }

    @Given("Kullanici appointement bilgileri de-serialisation eder")
    public void kullanici_appointement_bilgileri_de_serialisation_eder() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        //obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);//****bu manual jsonignore yapiyor
        appointements = obj.readValue(response.asString(), Appointements2[].class);


    }

    @Then("Kullanici appointment bilgilerini valide eder")
    public void kullanici_appointment_bilgilerini_valide_eder() {
        //response.then().assertThat().statusCode(200);
        /*
        for (int i = 0; i < appointements.length; i++) {
            System.out.println("id " + appointements[i].getId());

            if (appointements[i].getPatient() != null) {
                System.out.println(appointements[i].getPatient().getFirstname());
                System.out.println(appointements[i].getPatient().getLastname());
                if (appointements[i].getPatient().getCountry() != null) {
                    System.out.println(appointements[i].getPatient().getCountry().getId());
                    System.out.println(appointements[i].getPatient().getCountry().getName());
                }

                if (appointements[i].getPatient().getUser() != null) {
                    System.out.println(appointements[i].getPatient().getUser().getSsn());

                }
            }


        }
*/
        for (int i = 0; i < appointements.length; i++) {
            System.out.println(appointements[i].toString());

        }
        saveAppointementData(appointements);
    }


}


