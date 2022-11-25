package Chapter6;

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for(int count = 1; count <= 60_000_00; count++) {
            int side = 1 + secureRandom.nextInt(6);

            switch (side) {
                case 1 -> ++frequency1;
                case 2 -> ++frequency2;
                case 3 -> ++frequency3;
                case 4 -> ++frequency4;
                case 5 -> ++frequency5;
                case 6 -> ++frequency6;
            }
        }

        System.out.printf("1%10d%n2%10d%n3%10d%n4%10d%n5%10d%n6%10d%n",
                frequency1,
                frequency2,
                frequency3,
                frequency4,
                frequency5,
                frequency6);

    }
}
