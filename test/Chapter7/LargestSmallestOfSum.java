package Chapter7;

public class LargestSmallestOfSum {

    public int minimumOf(int[] number) {
        int minimum = number[0];
        for(int index = 0; index <= number.length - 1; index++) {
            if (minimum > number[index]) {
                minimum = number[index];
            }
        }
        return minimum;
    }


    public int maximumOf(int[] numbers) {
        int maximum = numbers[0];
        for(int index = 0; index < numbers.length ; index++) {
            if (maximum < numbers[index]) {
                maximum = numbers[index];
            }
        }
        return maximum;
    }

    public int sumOf(int[] numbers){
        int sum = 0;
        for(int index = 0; index <= numbers.length - 1; index++) {
             sum += numbers[index];
        }
        return sum;
    }


    public int largestSum(int[] numbers) {
       return sumOf(numbers) - minimumOf(numbers);
    }

    public int minimumSum(int[] numbers) {
        return sumOf(numbers) - maximumOf(numbers);
    }
}
