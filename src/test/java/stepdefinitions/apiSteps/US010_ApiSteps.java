package stepdefinitions.apiSteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Appointment;
import pojos.Appointments;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt3.saveAppointData;

//5

public class US010_ApiSteps {

    Appointments[] appointments;
    Response response;





    @Given("Doktor  GET request gonderir appointments icin")
    public void doktorGETRequestGonderirAppointmentsIcin() {

        response=given().headers(//headers olacak bu onemli
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigurationReader.getProperty("api_appointments"));
    }

    @When("Doktor status codu {int} ile yanit alir dogrular")






    public void doktorStatusCoduIleYanitAlirDogrular(int arg0) throws Exception {


        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());





        ObjectMapper obj=new ObjectMapper();

        appointments=obj.readValue(response.asString(),Appointments[].class);
        
    }

    @Then("Doktor kendi ID ile mevcut Appointments'lari dogrular")
    public void doktorKendiIDIleMevcutAppointmentsLariDogrular() {

/*
        JsonPath jsonPath = response.jsonPath();

        List<Integer> physicianId = jsonPath.getList("physician.id");
        List<Integer> appointmentId = jsonPath.getList("id");


        System.out.println("Number of appointments : " +appointmentId.size());
        System.out.println("Number of physicians : " +physicianId.size());


        assertTrue(physicianId.contains(164034));
        assertTrue(appointmentId.contains(189210));


*/


        System.out.println(appointments.length);


        for (int i = 0; i < appointments.length ; i++) {

            System.out.println(appointments[i].toString());
            
        }

        saveAppointData(appointments);
        
        
    }
}
