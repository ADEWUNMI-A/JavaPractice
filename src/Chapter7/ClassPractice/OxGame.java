package Chapter7.ClassPractice;

import java.util.Arrays;

public class OxGame {
    public static void main(String[] args) {
        char [][] oxGames = new char[3][3];

        oxGames [0][0] = 'X';
        oxGames [0][1] = 'O';
        oxGames [0][2] = 'X';

        oxGames [1][0] = 'X';
        oxGames [1][1] = 'O';
        oxGames [1][2] = 'X';

        oxGames [2][0] = 'X';
        oxGames [2][1] = 'X';
        oxGames [2][2] = 'X';

        for (char[] oxGame : oxGames) {
            for (char ox : oxGame) {
                System.out.printf("%s%s", ox, "  ");
            }
            System.out.println();
        }

    }
}
