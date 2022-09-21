package tdd;

public class Arithmetic {
    public int sum(int number1, int number2) {
        int total = number1 + number2;
        return total;
    }

    public int difference(int number1, int number2) {
        int result = Math.abs(number1 - number2);
        return result;
    }

    public double square(int number) {
        double sqr = Math.pow(number,2);
        return sqr;
    }

    public double differenceSquare(int number1, int number2) {
        double diffSqr = Math.abs(Math.pow(number1,2) - Math.pow(number2,2));
        return diffSqr;
    }

    public double sumSquare(int number1, int number2) {
        double sum = Math.pow(number1,number2);
        return sum;
    }

}
