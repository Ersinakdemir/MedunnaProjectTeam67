package stepdefinitions.dbSteps;


import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.WriteToTxt;

import java.sql.ResultSet;
import java.util.List;

import static utilities.DBUtils.executeQuery;
import static utilities.DBUtils.getColumnData;

public class US028_DbSteps {
    List<Object> name;


    @Given("Kullanici DB ye baglanir")
    public void kullanici_db_ye_baglanir() {
        DBUtils.createConnection();
    }

    @Given("Kullanici DB den ulkeler tablosunu alir")
    public void kullanici_db_den_ulkeler_tablosunu_alir() {
        String query = "select * from country";
        name = DBUtils.getColumnData(query, "name");


    }

    @Then("Kullanici gelen tablodan ulkenin eklendigini test eder")
    public void kullanici_gelen_tablodan_ulkenin_eklendigini_test_eder() {
        boolean flag = false;
        for (Object w :name ) {
            if (w.toString().equals("SOMALIY")) {
                flag = true;
                String ulke=w.toString();
                break;
            }
        }
        System.out.println(name.toString());

        Assert.assertTrue(flag);

        String dosyaYolu = "src/test/resources/testdata/CountryDB.txt";
        WriteToTxt.saveAppointmentDataBaseList(dosyaYolu,name);


    }

    @Given("Kullanici DB den ulkeler tablosunu yeni bir ulke creat eder")
    public void kullanici_db_den_ulkeler_tablosunu_yeni_bir_ulke_creat_eder() {

        String queryCreatCountry="insert into country values (null ,'yannni')";


    }

    @Given("Kullanici DB den eyalet tablosunu alir")
    public void kullanici_db_den_eyalet_tablosunu_alir() {

    }

    @Then("Kullanici gelen tablodan eyalet eklendigini test eder")
    public void kullanici_gelen_tablodan_eyalet_eklendigini_test_eder() {

    }

    @Given("Kullanici DB den eyalet tablosunu yeni bir ulke creat eder")
    public void kullanici_db_den_eyalet_tablosunu_yeni_bir_ulke_creat_eder() {

    }

    @Then("Kullanici gelen tablodan eyaletin eklendigini test eder")
    public void kullanici_gelen_tablodan_eyaletin_eklendigini_test_eder() {

    }
}
