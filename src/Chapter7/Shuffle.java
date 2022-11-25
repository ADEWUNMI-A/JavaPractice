//package Chapter7;
//
//import java.security.SecureRandom;
//import java.util.Arrays;
//
//public class Shuffle {
//static SecureRandom rand = new SecureRandom();
//
//    public static void shuffleNumber(int[] numbers) {
//
////        shuffling with java battery
////        Arrays.stream(numbers).parallel().forEach(number->System.out.printf("%n%s",number + " "));
//
//
////        manual shuffling
//       int [] newNumbers = new int[numbers.length];
//       for(int i = 0; i < numbers.length; i++) {
//
//           int temp = newNumbers[rand.nextInt()];
//           newNumbers[rand.nextInt()] = numbers[0];
//           numbers[0] = temp;
//       }
////       return newNumbers;
//    }
//
//    public static void main(String[] args) {
//        Shuffle.shuffleNumber();
//    }
//
//
//
//}
