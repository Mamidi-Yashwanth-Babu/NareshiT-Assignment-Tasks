package hospital;

import java.util.Arrays;

/*A class HospitalFinder is given to you with a main method. 
Create multiple Hospital objects and test with the methods of HospitalService class here*/

public class HospitalFinder {
    public static void main(String[] args) {
        // Create an instance of HospitalService
        HospitalService hospitalService = new HospitalService();

        // Add hospitals
        int hospitalCode1 = hospitalService.addHospital("YASHODA", Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"), "MATHEWS", "9848222222", "Sec");
        int hospitalCode2 = hospitalService.addHospital("APOLLO", Arrays.asList("Neurology", "Orthopedics", "Cardiology"), "JOHN", "9899222233", "NY");
        
        // Display all hospitals
        System.out.println("Hospitals: " + hospitalService.getHospitals());

        // Get and display details of a hospital by code
        Hospital hospital1 = hospitalService.getHospitalDetails(hospitalCode1);
        if (hospital1 != null) {
            System.out.println("Hospital details for code " + hospitalCode1 + ": " + hospital1);
        } else {
            System.out.println("Hospital not found for code " + hospitalCode1);
        }

        Hospital hospital2 = hospitalService.getHospitalDetails(hospitalCode2);
        if (hospital2 != null) {
            System.out.println("Hospital details for code " + hospitalCode2 + ": " + hospital2);
        } else {
            System.out.println("Hospital not found for code " + hospitalCode2);
        }
    }
}

