package stepdefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;


public class US007_DBSteps {
    public static void main(String[] args) {
        DBUtils.createConnection();
        String query = "select * from appointment";
        List<Object> id = DBUtils.getColumnData(query, "id");

        System.out.println("id = " + id);

    }

    static List<Object> id = new ArrayList<>();

    @Given("ADuser creates a connection with DB")
    public void a_duser_creates_a_connection_with_db() {
        DBUtils.createConnection();

    }

    @Given("ADuser gets the {string} from {string} table")
    public void a_duser_gets_the_from_table(String column, String table) {
        String myDynamicQuery = "Select * from " + table;
        id = DBUtils.getColumnData(myDynamicQuery, column);
        DBUtils.executeQuery(myDynamicQuery);
    }

    @Given("ADuser verify {string} table   {string} column contains {string}")
    public void a_duser_verify_table_column_contains(String table, String column, String data) {
        boolean flag = false;
        for (Object w : id) {
            if (w.toString().equals(data)) {
                flag = true;
                break;
            }
        }
        System.out.println(id.toString());

        Assert.assertTrue(flag);

        String dosyaYolu = "src/test/resources/testdata/AppointmentDB.txt";
        WriteToTxt.saveAppointmentDataBaseList(dosyaYolu,id);
    }

    @Then("ADuser close DB connection")
    public void a_duser_close_db_connection() {
        DBUtils.closeConnection();
    }


}
