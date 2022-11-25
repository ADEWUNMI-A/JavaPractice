package Chapter7;

public class MinMaxSum {

    public static int sum(int[] number){
        int arraySum = 0;
        for (int index = 0; index <= number.length -1; index++){
            arraySum += number[index];
        }
        return arraySum;
    }

    public static int min(int[] number) {
        int arrayMin = number[0];
        for (int index = 0; index <= number.length - 1; index++) {
            if (arrayMin > number[index]) {
                arrayMin = number[index] ;
            }
        }
        return arrayMin;
    }

    public static int max(int[] number){
        int arrayMax = number[0];
        for(int index = 0; index <= number.length - 1; index++) {
            if(number[index] > arrayMax) {
                arrayMax = number[index];
            }
        }
        return arrayMax;
    }

//
//    public static void main(String[] args) {
//        int[] number = {5,2,3,4,6};
//        System.out.println(MinMaxSum.sum(number));
//        System.out.println(MinMaxSum.min(number));
//        System.out.println(MinMaxSum.max(number));
//    }
}
