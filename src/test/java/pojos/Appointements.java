package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//JsonIgnogePropertice bir api testinde butun datayi degilde sadece
                                           // belirili criterleri test edeceksek kullanoiriz. pjo olusutururjkn hepsini olusturmaya gerek yok
public class Appointements {
    /*

    {
        "createdBy": "anonymousUser",
        "createdDate": "2022-01-01T19:38:40.606890Z",
        "id": 4692,
        "startDate": "2022-12-20T00:00:00Z",
        "endDate": "2022-12-20T01:00:00Z",
        "status": "UNAPPROVED",
        "anamnesis": null,
        "treatment": null,
        "diagnosis": null,
        "prescription": null,
        "description": null,
        "physician": null,
        "patient": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-01-01T14:07:54.214041Z",
            "id": 4861,
            "firstName": "emir",
            "lastName": "ihsan",
            "birthDate": null,
            "phone": "5355556600",
            "gender": null,
            "bloodGroup": null,
            "adress": null,
            "email": "emir@gmail.com",
            "description": null,
            "user": {
                "createdBy": "anonymousUser",
                "createdDate": "2022-01-01T17:37:45.448161Z",
                "id": 4378,
                "login": "emirha",
                "firstName": "ihsan",
                "lastName": "emir",
                "email": "emir@gmail.com",
                "activated": true,
                "langKey": "en",
                "imageUrl": null,
                "resetDate": null,
                "ssn": "333-02-2233"
            },
            "inPatients": null,
            "country": null,
            "cstate": null
        },
        "ctests": null
    }
     */

    private String createdBy;
    private String createdDate;
    private int id;
    private  String startDate;
    private String anamnesis;
    private String treatment;


}
