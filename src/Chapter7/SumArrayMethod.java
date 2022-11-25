package Chapter7;

public class SumArrayMethod {
//    static int total = 0;

//       using Array
//    public int sumOfArray(int[] numbers) {


//    using ellipsis
    public static int  sumOfArray(int... numbers) {
        int  total = 0;
        for(int count = 0; count < numbers.length; count++) {
            total += numbers[count];
        }
        return total;
    }

    public static double averageOfArray(double...number) {
        double total = 0;
        double average = 0;
        for (int count = 0; count < number.length; count++) {
            total += number[count];
            average = total / number.length;
        }
        return average;
    }

    public static void main(String[] args) {

//        int [] numbers  = {2,4,7,8,19,46,21};

        System.out.printf("The total is %d\n",sumOfArray(2,4,7,8,19,46,21));

        System.out.printf("The average is %.2f", averageOfArray(10,10,10,10,10,5,5));

    }
}
