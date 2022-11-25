package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void displayEmployeeDetails() {
        Date hire = new Date(23,12,2008);
        Date birth = new Date(10,5,2002);
        Employee employee = new Employee("Samuel", "Shola", hire, birth);

        System.out.println(employee);
    }

}