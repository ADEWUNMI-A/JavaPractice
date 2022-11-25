package Chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {
    TicTacToeGame ticTacToeGame;
    @BeforeEach
    public void startAllTestWith() {
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void displayTableTest() {
        ticTacToeGame.displayTable();
    }

    @Test
    public void makeMoveTest() {
        ticTacToeGame.makeMove("O", 2);
    }

    @Test
    public void compareMovesTest(){
        ticTacToeGame.makeMove("O", 1);
        ticTacToeGame.makeMove("O", 2);
        ticTacToeGame.makeMove("O", 3);
        System.out.println(ticTacToeGame.compareMoves(1, 2, 3));
    }

    @Test
    public void isWin() {

    }

}