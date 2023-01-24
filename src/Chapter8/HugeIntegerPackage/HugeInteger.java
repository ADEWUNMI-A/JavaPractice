//(HugeInteger Class)
//Create a class HugeInteger which uses a 40-element array of digits to
//store integers as large as 40 digits each. Provide methods parse, toString, add and subtract.
// Method parse should receive a String, extract each digit using method charAt and place the integer
//equivalent of each digit into the integer array. For comparing HugeInteger objects,
// provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
//and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
//holds between the two HugeInteger objects and returns false if the relationship does not hold.
// Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
//remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false”
// 6with format specifier %b.]

package Chapter8.HugeIntegerPackage;

import java.math.BigInteger;

public class HugeInteger {
    private int[] numberList;
    private final int number;

    public HugeInteger(int number) {
        numberList = new int[40];
        this.number = number;
    }

    public void parse(String number) {
        numberList = new int[40];
        int j = number.length() - 1;
        for (int i = numberList.length - 1; i >= numberList.length - number.length(); i--) {
            numberList[i] = Integer.parseInt(String.valueOf(number.charAt(j--)));
        }
    }

    public BigInteger newNumber() {
        int eachNum = 0;
        for (int j : numberList) {
            eachNum = (eachNum * 10) + j;
        }
        return BigInteger.valueOf(eachNum);
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }

    public HugeInteger addNum(HugeInteger num1, HugeInteger num2) {
        String number1 = num1.toString();
        int numb1Int = Integer.parseInt(number1);
        String number2 = num2.toString();
        int num2Int = Integer.parseInt(number2);
        int sum = numb1Int + num2Int;
        return new HugeInteger(sum);
    }
    public HugeInteger subtractNum(HugeInteger num1, HugeInteger num2) {
        String number1 = num1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = num2.toString();
        int num2Int = Integer.parseInt(number2);
        int result = num1Int - num2Int;
        return new HugeInteger(Math.abs(result));
    }
    public int toInt() {
        return this.number;
    }
    public boolean isEqualTo(HugeInteger number1, HugeInteger number2) {
        return number1.toString().equals(number2.toString());
    }
    public boolean isNotEqualTo(HugeInteger number1, HugeInteger number2) {
        return !(number1.toString().equals(number2.toString()));
    }
    public boolean isGreaterThan(HugeInteger comparator1, HugeInteger comparator2) {
        String number1 = comparator1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = comparator2.toString();
        int num2Int = Integer.parseInt(number2);
        return num1Int > num2Int;
    }
    public boolean isLessThan(HugeInteger comparator1, HugeInteger comparator2) {
        String number1 = comparator1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = comparator2.toString();
        int num2Int = Integer.parseInt(number2);
        return num1Int < num2Int;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger comparator1, HugeInteger comparator2) {
        String number1 = comparator1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = comparator2.toString();
        int num2Int = Integer.parseInt(number2);
        return num1Int >= num2Int;
    }
    public boolean isLessThanOrEqualTo(HugeInteger comparator1, HugeInteger comparator2) {
        String number1 = comparator1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = comparator2.toString();
        int num2Int = Integer.parseInt(number2);
        return num1Int <= num2Int;
    }
    public boolean isZero(HugeInteger num) {
        String numba = num.toString();
        int num1Int = Integer.parseInt(numba);
        return num1Int == 0;
    }
    public HugeInteger multiply(HugeInteger num1, HugeInteger num2) {
        String number1 = num1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = num2.toString();
        int num2Int = Integer.parseInt(number2);
        int result = num1Int * num2Int;
        return new HugeInteger (result);
    }
    public HugeInteger remainder(HugeInteger num1, HugeInteger num2) {
        String number1 = num1.toString();
        int num1Int = Integer.parseInt(number1);
        String number2 = num2.toString();
        int num2Int = Integer.parseInt(number2);
        int result = num1Int % num2Int;
        return new HugeInteger(result);
    }
}
