package stepdefinitions.apiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointment;
import pojos.AppointmentRequest;
import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.WriteToTxt.saveAppointData;
import static utilities.WriteToTxt.saveAppointmentData;


public class US007_ApiSteps {
    static Faker faker = new Faker();
    static Response response;
    static AppointmentRequest appointmentCreate =new AppointmentRequest();

  //  public static void main(String[] args) throws IOException {
  //      spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
  //      spec.pathParams("1", "api", "2", "appointments","3","request");
  //      String FirstName = faker.name().firstName();
  //      String LastName=faker.name().lastName();
  //      String SSN=faker.idNumber().ssnValid();
  //      String Email =faker.internet().emailAddress();
  //      String Phone = "8572658343";
  //      String Date = "2023-01-07T00:00:00Z";
  //      appointmentCreate.setFirstName(FirstName);
  //      appointmentCreate.setLastName(LastName);
  //      appointmentCreate.setSsn(SSN);
  //      appointmentCreate.setEmail(Email);
  //      appointmentCreate.setPhone(Phone);
  //      appointmentCreate.setStartDate(Date);
  //      appointmentCreate.setAppoSpeciality("string");
  //      appointmentCreate.setBirthDate("2022-04-16T12:52:30.875Z");
  //      appointmentCreate.setGender("string");
  //      appointmentCreate.setSnumber("string");
  //      response = given().spec(spec)
  //              .contentType(ContentType.JSON)
  //              .body(appointmentCreate)
  //              .when()
  //              .post("/{1}/{2}/{3}");
  //      response.prettyPrint();
  //      response.then().statusCode(201);
  //      ObjectMapper obj = new ObjectMapper();
  //      Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
  //      saveAppointData(actualAppointment);
//
  //      System.out.println("Actual Data: " + actualAppointment);
  //      Assert.assertEquals(appointmentCreate.getFirstName(),actualAppointment.getPatient().getFirstName());
  //      Assert.assertEquals(appointmentCreate.getLastName(),actualAppointment.getPatient().getLastName());
  //      Assert.assertEquals(appointmentCreate.getEmail(),actualAppointment.getPatient().getEmail());
  //      Assert.assertEquals(appointmentCreate.getPhone(),actualAppointment.getPatient().getPhone());
  //      Assert.assertEquals(appointmentCreate.getStartDate(),actualAppointment.getStartDate());
//
//
  //  }

    @Given("AD user set path params")
    public void ad_user_set_path_params() {

        spec.pathParams("1", "api", "2", "appointments","3","request");
    }
    @Given("AD user enter expected data FirstName LastName SSN Email Phone Date")
    public void adUserEnterExpectedDataFirstNameLastNameSSNEmailPhoneDate() {
        String FirstName = faker.name().firstName();
        String LastName=faker.name().lastName();
        String SSN=faker.idNumber().ssnValid();
        String Email =faker.internet().emailAddress();
        String Phone = "8572658343";
        String Date = "2023-01-07T00:00:00Z";
        appointmentCreate.setFirstName(FirstName);
        appointmentCreate.setLastName(LastName);
        appointmentCreate.setSsn(SSN);
        appointmentCreate.setEmail(Email);
        appointmentCreate.setPhone(Phone);
        appointmentCreate.setStartDate(Date);
        appointmentCreate.setAppoSpeciality("string");
        appointmentCreate.setBirthDate("2022-04-16T12:52:30.875Z");
        appointmentCreate.setGender("string");
        appointmentCreate.setSnumber("string");

    }
    @Given("AD user send request and get response")
    public void ad_user_send_request_and_get_response() {
        response = given().spec(spec)
                .contentType(ContentType.JSON)
                .body(appointmentCreate)
                .when()
                .post("/{1}/{2}/{3}");
        response.prettyPrint();

    }
    @Then("AD user save API data to file")
    public void ad_user_save_api_data_to_file() {
        try {
            response.then().statusCode(201);
            saveAppointmentData(appointmentCreate);
            System.out.println(appointmentCreate.toString());
        } catch (Exception e) {

        }

    }
    @Then("AD user verify  API data")
    public void ad_user_verify_api_data() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
        saveAppointData(actualAppointment);

        System.out.println("Actual Data: " + actualAppointment);
        Assert.assertEquals(appointmentCreate.getFirstName(),actualAppointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentCreate.getLastName(),actualAppointment.getPatient().getLastName());
        Assert.assertEquals(appointmentCreate.getEmail(),actualAppointment.getPatient().getEmail());
        Assert.assertEquals(appointmentCreate.getPhone(),actualAppointment.getPatient().getPhone());
        Assert.assertEquals(appointmentCreate.getStartDate(),actualAppointment.getStartDate());
    }



}
