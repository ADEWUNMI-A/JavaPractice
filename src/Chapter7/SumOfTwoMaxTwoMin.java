package Chapter7;

public class SumOfTwoMaxTwoMin {

    public static int sumOfTwoMax(int[] number){
        int arrayMax = number[0];
        int nextMax = number[0];

        for (int i : number) {
            if (i > arrayMax) {
                nextMax = arrayMax;
                arrayMax = i;
            }
            if (i > nextMax && i < arrayMax) {
                nextMax = i;
            }
        }
        System.out.println(arrayMax);
        System.out.println(nextMax);
        return arrayMax + nextMax;
    }

    public static void main(String[] args) {
        int[] number = {1,2, 3, 4, 5};
        System.out.println(sumOfTwoMax(number));
    }
}
