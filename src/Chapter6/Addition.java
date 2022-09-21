package Chapter6;

public class Addition {

    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public double addNumbers(int number1, double number2) {
        return number1 + number2;
    }

    public double addNumbers(double number1, double number2) {
        return number1 + number2;
    }

    public double addNumbers(double number1, int number2) {
        return number1 + number2;

    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.addNumbers(2,7));
        System.out.println(addition.addNumbers(2.0,8));
        System.out.println(addition.addNumbers(2,6.0));
        System.out.println(addition.addNumbers(2.7,4.3));
    }
}
