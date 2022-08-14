package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    /*
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

    private  int id;
    private String login;
    private String firstname;
    private String lastname;
    private  String email;
    private String ssn;


}
