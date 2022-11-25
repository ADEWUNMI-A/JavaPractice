package Chapter6;

import java.math.BigDecimal;
import java.math.MathContext;
import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int count = 1; count <= 20; count++) {
            int side = secureRandom.nextInt(6);

            System.out.printf("%d  ", side);

            if (count % 4 == 0) {
                System.out.println();
            }
        }

    }
}
