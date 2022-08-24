package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    /* "createdBy": "anonymousUser",
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


    private int id;
    private String firstname;
    private String lastname;
    private  String birthDate;
    private  String phone;
    private  String adress;
    private  String email;
    private  String gender;
    private User user;
    private Country country;
    private State cstate;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getCstate() {
        return cstate;
    }

    public void setCstate(State cstate) {
        this.cstate = cstate;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", user=" + user +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
