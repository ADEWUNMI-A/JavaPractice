package Chapter8;
public class TicTacToeGame {
    String[] move = {"", "", "", "", "", "", "", "","", ""};
    public void displayTable() {
        System.out.printf("""
                    %1s   |  %1s  |  %1s
                 -------+-----+------
                    %1s   |  %1s  |  %1s 
                 -------+-----+------   
                    %1s   |  %1s  |  %1s%n%n%n""",
                move[1], move[2], move[3],
                move[4], move[5], move[6],
                move[7], move[8], move[9] );
    }
    public void makeMove(String ox, int position) {
        move[position] = ox;
        displayTable();
    }

    public boolean compareMoves(int position1, int position2, int position3) {
        boolean check = false;
        if (!move[position1].equals("")){
            if (move[position2].equals(move[position1]) && move[position3].equals(move[position2])){
                check = true;
            }
        }
        return check;
    }

    public boolean isWin() {
        boolean won = false;
        if (compareMoves(1, 2, 3)) {
            won = true;
        }
        if (compareMoves(4, 5, 6)) {
            won = true;
        }
        if (compareMoves(7, 8, 9)) {
            won = true;
        }
        if (compareMoves(1, 4, 7)) {
            won = true;
        }
        if (compareMoves(2, 5, 8)) {
            won = true;
        }
        if (compareMoves(3, 6, 9)) {
            won = true;
        }
        if (compareMoves(1, 5, 9)) {
            won = true;
        }
        if (compareMoves(3, 5, 7)) {
            won = true;
        }
        return won;
    }
}