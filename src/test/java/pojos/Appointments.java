package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Appointments {





    /*

    {
        "createdBy": "anonymousUser",
            "createdDate": "2021-12-21T22:33:06.907662Z",
            "id": 3403,
            "startDate": "2021-12-22T17:00:00Z",
            "endDate": "2021-12-25T18:00:00Z",
            "status": "COMPLETED",
            "anamnesis": null,
            "treatment": null,
            "diagnosis": null,
            "prescription": "",
            "description": "cfgvhbjn",
            "physician": {
        "createdBy": "oscarlebsack",
                "createdDate": "2022-03-01T13:26:00.734890Z",
                "id": 10501,
                "firstName": "Harlan",
                "lastName": "Krajcik",
                "birthDate": "2001-12-02T23:00:00Z",
                "phone": "1234567890",
                "gender": "FEMALE",
                "bloodGroup": "ABpositive",
                "adress": "Apt. 341 12226 Dell Coves, Marcelview, VT 46426-5626",
                "description": "Patient Info",
                "user": {
            "createdBy": "anonymousUser",
                    "createdDate": "2022-03-29T10:10:27.911556Z",
                    "id": 43194,
                    "login": "user_112233445_56677889991648548627822",
                    "firstName": "a",
                    "lastName": "b",
                    "email": "cazs@asblas.com",
                    "activated": false,
                    "langKey": null,
                    "imageUrl": null,
                    "resetDate": null,
                    "ssn": "444-44-0005"
        },
        "speciality": "OPHTHALMOLOGY",
                "country": {
            "id": 80065,
                    "name": "USA"
        },
        "cstate": {
            "id": 1254,
                    "name": "Arizona",
                    "country": {
                "id": 1201,
                        "name": "Türkye"
            }
        }


         */

private String createdBy;
private  String createdDate;
private int id;
private String startDate;
private String endDate;
private String status;
private String anamnesis;
private String treatment;
private Patients patient;
private Physician physician;

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

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", patient=" + patient +
                ", physician=" + physician +
                '}';
    }
}
