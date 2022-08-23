package stepdefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import utilities.ReadTxt3;
import utilities.WriteToTxt3;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US010_DBSteps {

    String query;
    List<Object> idList;

    String appointmentIDFile = "src/test/resources/testData/AppointmentID.txt";
    String startDateFile = "src/test/resources/testData/AppointmentStartDate.txt";
    String endDateFile = "src/test/resources/testData/AppointmentEndDate.txt";
    String statusFile = "src/test/resources/testData/AppointmentSatutus.txt";



    @Given("Database ile Connection kurulur")
    public void database_ile_connection_kurulur() {


        DBUtils.createConnection();

        query = "select * from appointment";
        System.out.println(DBUtils.getColumnNames(query));

    }

    @Given("Table tablosundan selectRow satirlari getirilir")
    public void table_tablosundan_select_row_satirlari_getirilir() {

        idList = getColumnData(query, "id");
         //  System.out.println(idList);

    }

    @Then("Appointments tablosunun column sutununun columnData icerdigi dogrulanir")
    public void appointments_tablosunun_column_sutununun_column_data_icerdigi_dogrulanir() {


        List<Object> actualAppointmentIDs = ReadTxt3.returnAppointmentIdsList(appointmentIDFile);
        List<Object> expectedAppointmentIDs = new ArrayList<>();
        expectedAppointmentIDs.add(166158);
        Assert.assertTrue(actualAppointmentIDs.containsAll(expectedAppointmentIDs));
       // Assert.assertFalse("ID UYUSMUYOR", actualAppointmentIDs.containsAll(expectedAppointmentIDs));

        List<Object> actualAppointmentStartDate = ReadTxt3.returnAppointmentStartDateList(startDateFile);
        List<Object> expectedAppointmentStartDate = new ArrayList<>();
        expectedAppointmentStartDate.add("2022-08-18T03:00:00Z");
        Assert.assertFalse("START DATE UYUSMUYOR", actualAppointmentStartDate.containsAll(expectedAppointmentStartDate));

        List<Object> actualAppointmentEndDate = ReadTxt3.returnAppointmentEndDateList(endDateFile);
        List<Object> expectedAppointmentEndDate = new ArrayList<>();
        expectedAppointmentEndDate.add("2022-08-18T04:00:00Z");
        Assert.assertFalse("END DATE UYUSMUYOR", actualAppointmentEndDate.containsAll(expectedAppointmentEndDate));

        List<Object> actualAppointmentStatus = ReadTxt3.returnAppointmentStatusList(statusFile);
        List<Object> expectedAppointmentStatus = new ArrayList<>();
        expectedAppointmentStatus.add("PENDING");
        Assert.assertTrue("STATUS UYUSMUYOR", actualAppointmentStatus.containsAll(expectedAppointmentStatus));




    }

    @Then("Kullanici bilgilerine ulasirlir ve kaydedilir")
    public void kullaniciBilgilerineUlasirlirVeKaydedilir() {


        System.out.println("=== ID ===");
        List<Object> idList = getColumnData(query,"id");
        System.out.println(idList+"\n");
        WriteToTxt3.saveAppointmentIDs(appointmentIDFile, idList);

        System.out.println("=== START DATE ===");
        List<Object> startDateList = getColumnData(query,"start_date");
        System.out.println(startDateList+"\n");
        WriteToTxt3.saveAppointmentStartDate(startDateFile, startDateList);

        System.out.println("=== END DATE ===");
        List<Object> endDateList = getColumnData(query,"end_date");
        System.out.println(endDateList+"\n");
        WriteToTxt3.saveAppointmentEndDate(endDateFile, endDateList);

        System.out.println("==== STATUS ===");
        List<Object> statusList = getColumnData(query,"status");
        System.out.println(statusList+"\n");
        WriteToTxt3.saveAppointmentStatus(statusFile, statusList);

    }



    }
