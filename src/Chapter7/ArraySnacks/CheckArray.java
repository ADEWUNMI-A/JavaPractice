package Chapter7.ArraySnacks;

public class CheckArray {

    public static String containIn(int[] numbers, int number) {
        int contain = 0;
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index] == number);
        }
//        return false;
        return null;
    }

    public static void main(String[] args) {
        int[] numberList = {1, 2, 3, 4, 5,};
        int number = 2;
        System.out.println(containIn(numberList,number));
    }

}
