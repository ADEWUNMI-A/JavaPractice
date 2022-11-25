package ChiefsVisit;

public class Native {
    private String nativeId;
    private String firstName;
    private String lastName;
    private static String chief = "Sam Immanuel ";


    public Native (String firstName) {
        this.firstName = firstName;
    }

    public Native (String firstName, String lastName){

    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
//
//    public static String getChief() {
//        return chief;
//    }
}
