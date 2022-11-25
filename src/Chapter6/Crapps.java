package Chapter6;

import java.security.SecureRandom;

public class Crapps {
    private static final int WON1 = 7;
    private static final int WON2 = 11;
    private static final int LOST1 = 2;
    private static final int LOST2 = 3;
    private static final int LOST3 = 12;
    private enum Status {WON, LOST, CONTINUE};
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        Status gameStatus;


        int sumOfDice = rollDie();
        switch (sumOfDice) {
            case WON1, WON2 -> gameStatus = Status.WON;
            case LOST1, LOST2, LOST3 -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                int point = sumOfDice;
                System.out.printf("Your point is %d", point);
            }
        }
        while (gameStatus == Status.CONTINUE) {
            rollDie();

        }
        if (gameStatus == Status.WON) {
            System.out.println("The player wins");
        }
        else if (gameStatus == Status.LOST) {
            System.out.println("The player loses");
        }
        else System.out.printf("Your point is %d%n",Crapps.rollDie());
    }

        public static int rollDie() {
            int die1 = 1 + secureRandom.nextInt(6);
            int die2 = 1 + secureRandom.nextInt(6);

            int sum = die1 + die2;
            System.out.printf("%nThe sum of %d and %d is %d%n", die1, die2, sum);
            return sum;
        }

    }

