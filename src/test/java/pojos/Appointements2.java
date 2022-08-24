package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)//JsonIgnogePropertice bir api testinde butun datayi degilde sadece// belirili criterleri test edeceksek kullanoiriz. pjo olusutururjkn hepsini olusturmaya gerek yok
public class Appointements2 {
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
    private String startDate;
    private String endDate;
    private String anamnesis;
    private String treatment;
    private Patient patient;
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getAnamnesis() {
        return anamnesis;
    }
    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }
    public String getTreatment() {
        return treatment;
    }
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointements2{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", patient=" + patient +
                '}';
    }
}
