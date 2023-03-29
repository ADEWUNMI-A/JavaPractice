package Chapter7;
public class TargetIndex {
    public static String tIndex(int target, int... numbers) {
        int i;
        int j = 0;
        for (i = 1, j = 0; i < numbers.length; j++,i++) {
               int result = numbers[i] + numbers[j];
            if (result == target) {
                return i+" "+j;
            }
        }
        return "Target not found";
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 10};
        int target = 9;
        System.out.println(tIndex(target, numbers));
    }
}
