package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Patients {



/*
    patient": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-01-01T14:31:36.539261Z",
            "id": 4862,
            "firstName": "Omer",
            "lastName": "Nadercikli",
            "birthDate": "1010-02-01T18:38:00Z",
            "phone": "4387221874",
            "gender": "FEMALE",
            "bloodGroup": "Bnegative",
            "adress": "Fettek",
            "email": "elroy.mitchell@gmail.com",
            "description": "We are conducting Medunna",
            "user": {
        "createdBy": "anonymousUser",
                "createdDate": "2021-12-25T17:00:55.695854Z",
                "id": 3314,
                "login": "apl",
                "firstName": "Pl",
                "lastName": "Ali",
                "email": "apl@email.com",
                "activated": true,
                "langKey": "en",
                "imageUrl": null,
                "resetDate": null,
                "ssn": "888-88-8766"
    },
            "inPatients": null,
            "country": {
        "id": 1201,
                "name": "Türkye"
    },



*/

    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String adress;
    private String email;
    private User user;         // inner obje
    private Country country;  //  inner obje

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                ", country=" + country +
                '}';
    }
}
