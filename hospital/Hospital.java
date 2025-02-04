package hospital;

import java.util.List;

/*class Hospital is given to you. Implement the following features in the class.
Variables : 
private : hospitalCode int, hospitalName String,
 listOfTreatments List<String>,contactPerson String,
 contactNumber String,location String
public : Constructors:
Parameterized Constructor with arguments in the order of 
hospitalName,listOfTreatments,
 contactPerson,contactNumber,location
Methods : public
 Generate All Getters & Setters 
 Generate toString() to return a formatted string as per the below example.
Hospital [hospitalCode=101, hospitalName=YASHODA, listOfTreatments=[Cardiac, ENT, 
Ortho, Pediatric, Gastro], 
contactPerson=MATHEWS, contactNumber=9848222222, location=Sec]*/

public class Hospital {
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    // Parameterized constructor
    public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
        this.hospitalCode = 100; // Initialize hospitalCode with default value of 100 (will be updated in HospitalService)
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    // Getters and Setters
    public int getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(int hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public void setListOfTreatments(List<String> listOfTreatments) {
        this.listOfTreatments = listOfTreatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString method for formatted output
    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
                + listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
                + ", location=" + location + "]";
    }
}
