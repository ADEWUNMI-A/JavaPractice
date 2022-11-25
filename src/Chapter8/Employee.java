package Chapter8;

public class Employee {
    private String firstName;
    private String lastName;
    private Date hireDate;
    private Date birthDay;

    public Employee (String firstName,String lastName, Date hireDate, Date birthDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.birthDay = birthDay;
    }
    public String toString() {
        return String.format("%s %s, Hired: %s, Birthday: %s", firstName, lastName, hireDate, birthDay);
    }

}