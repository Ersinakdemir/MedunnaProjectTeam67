package stepdefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.HashMap;
import java.util.Map;

import static utilities.ReadToTxt18.readAllRegistrantInDBDataMap;
import static utilities.WriteToTxt18.saveRegistrantDataDB;

public class US018_DBSteps {
    Map<String, Object> registrantMap = new HashMap<String, Object>();

    @Given("AD user sends the query to db and gets the user data with ssn number {string}")
    public void ad_user_sends_the_query_to_db_and_gets_the_user_data_with_ssn_number(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);


    }
    @Then("AD validates db registrant data  {string}")
    public void adValidatesDbRegistrantData(String ssn) {
        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("ssn", ssn);
        try {
            readAllRegistrantInDBDataMap(expectedData);
            saveRegistrantDataDB(registrantMap);
        }catch (Exception e) {
            System.out.println("data is already in the list");
        }
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));

    }
}