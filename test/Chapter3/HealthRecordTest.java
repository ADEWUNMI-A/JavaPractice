package Chapter3;

import static org.junit.jupiter.api.Assertions.*;

class HealthRecordTest {
    public static void main(String[] args) {
        HealthRecord healthRecord = new HealthRecord("Adeola", "Adekunle",
                            "MALE", 9,15, 2004, 6.3, 60);

        System.out.println("HEALTH PROFILE");
        System.out.printf("First name:  %s", healthRecord.getFirstName());
        System.out.printf("%nLast name:  %s", healthRecord.getLastName());
        System.out.printf("%nGender:  %s", healthRecord.getGender());
        System.out.printf("%nDate of birth:  %d-%d-%d", healthRecord.getDayOfBirth(),
                healthRecord.getMonthOfBirth(), healthRecord.getYearOfBirth());
        System.out.printf("%nAge:  %d", healthRecord.age());
        System.out.printf("%nHeight:  %.2f", healthRecord.getHeight());
        System.out.printf("%nWeight:  %.2f",healthRecord.getWeight());
        System.out.printf("%nThe BMI is:  %.2f", healthRecord.getBmi());
        System.out.printf("%nThe maximum heart rate: %2f", healthRecord.getMaximumHeartRate());
        healthRecord.getTargetHeartRate();
    }

}