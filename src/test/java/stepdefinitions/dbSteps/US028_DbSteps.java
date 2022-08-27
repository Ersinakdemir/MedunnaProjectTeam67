package stepdefinitions.dbSteps;


import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US028_DbSteps {


    public static void main(String[] args) {
        String querh="select * from jhi_user";
     List<Object>list= getColumnData(querh,"login");

    }
}
