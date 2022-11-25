package Chapter7.ClassPractice;

public class SumArray2 {

    public static int sumOfArray(int[] array) {
//        int total = 0;
//        for(int index = 0; index < array.length; index++) {
//           total += array[index];
//        }
//        return total;

//        int total = 0;
//        int index = 0;
//        while (index < array.length) {
//            total += array[index];
//            index++;
//        }
//        return total;


        int total = 0;
        int index = 0;
        do {
            total += array[index];
            index++;
        }
        while (index < array.length);
        return total;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6,7};
        System.out.println(sumOfArray(numbers));
    }

}

