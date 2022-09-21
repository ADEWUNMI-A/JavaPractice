package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class IphoneTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Iphone iphone = new Iphone();

        System.out.print("Enter the color: ");
        String color = input.nextLine();
        iphone.setColor(color);

        System.out.print("Enter the price: ");
        double price = input.nextDouble();
        Iphone.setPrice(price);

        System.out.printf("%n%nThe color is %s",iphone.getColor());
        System.out.printf("%nThe price is %.2f", iphone.getPrice());
    }
}