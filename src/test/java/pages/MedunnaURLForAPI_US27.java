package pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaURLForAPI_US27 {

    protected RequestSpecification spec;
    public void setUrl(){
        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
    }
}
