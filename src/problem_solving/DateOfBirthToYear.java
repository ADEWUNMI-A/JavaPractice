package problem_solving;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateOfBirthToYear {
    public int dateOfBirth2Token(String year) {
        Period period;
//        StringTokenizer st = new StringTokenizer(year);
//        String[] tokens = new String[st.countTokens()];
//        int i = 0;
//        while (st.hasMoreTokens()) {
//            tokens[i] = st.nextToken();
//            i++;

//        }

//            for (int count = 0; i <= tokens.length; i++) {
//                for (int counter = 0; counter < tokens[count].length(); counter++) {
//                    if (Character.isDigit(tokens[count].charAt(counter))) ;
//                    int day = Integer.parseInt(tokens[0]);
//                    int month = Integer.parseInt(tokens[1]);
//                    int yr = Integer.parseInt(tokens[2]);
//                    LocalDate dob= LocalDate.of(yr, month, day);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdate = LocalDate.parse(year, formatter);
        LocalDate currentDate = LocalDate.now();
        period = Period.between(birthdate, currentDate);
        return period.getYears();
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a your date of birth: ");
        String input = sc.nextLine();
        DateOfBirthToYear date = new DateOfBirthToYear();
        System.out.println(date.dateOfBirth2Token(input));
    }
}
