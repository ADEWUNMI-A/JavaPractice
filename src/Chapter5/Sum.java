package Chapter5;
/*The application in uses a for statement to sum the even integers from 2 to 20 and store
    the result in an int variable called total.*/

public class Sum {
    public static void main(String[] args) {
        int total = 0;

        for (int counter = 2; counter <= 21; counter +=2) {
            total += counter;
        }
            System.out.printf("The total of even numbers to 20 is: %d ", total);
    }
}
