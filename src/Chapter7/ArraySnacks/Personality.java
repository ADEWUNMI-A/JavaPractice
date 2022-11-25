package Chapter7.ArraySnacks;

import java.util.Scanner;

public class Personality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is your name: %n");
        String name = sc.nextLine().toUpperCase();

        String[] As = new String[8];
        As[0] = "A.active, initiate";
        As[1] = "A.organized, orderly";
        As[2] = "A.candid, straightforward , frank";
        As[3] = "A.logical, thinking , questioning ";
        As[4] = "A.facts, things , 'what is'";
        As[5] = "A.tough-minded, just";
        As[6] = "A.firm, tend to criticize , hold the line";
        As[7] = "A.preparation, plan ahead";

        String[] Bs = new String[8];
        Bs[0] = "B.reflective, deliberate";
        Bs[1] = "B.flexible, adaptive";
        Bs[2] = "B.tactful, kind, encouraging";
        Bs[3] = "B.empathetic, feeling, accommodating";
        Bs[4] = "B.ideas, dreams, 'what could be', philosophical";
        Bs[5] = "B.tender-hearted, merciful";
        Bs[6] = "B.gentle, tend to appreciate, conciliate";
        Bs[7] = "B.go with the flow, kind, encouraging";

        String[] userInput = new String[As.length];
        int i;
        int aTotal = 0;
        int bTotal = 0;
        for (i = 0; i < As.length; i++) {

            System.out.printf("%s                   %s %n", As[i], Bs[i]);
            userInput[i] = sc.nextLine().toUpperCase();
            boolean correctAnswer = (!userInput[i].equals("A") && (!userInput[i].equals("B")));
            if (correctAnswer) {
                throw new IllegalArgumentException("Wrong input");
            }
            if (userInput[i].equals("A")) {
                userInput[i] = As[i];
                aTotal++;
            } else if (userInput[i].equals("B")) {
                userInput[i] = Bs[i];
                bTotal++;
            }
        }

        System.out.printf("Hello %s You selected:%n", name);

        for (int j = 0; j < userInput.length; j++) {
            System.out.println(userInput[j]);
            System.out.println();
        }

        System.out.println("Number of A selected: "+ aTotal);
        System.out.println("Number of B selected: "+ bTotal);
    }
}

