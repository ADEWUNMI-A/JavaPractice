package Chapter8.ArcheryGraphics;

public class ArcheryGame {

    private Players[] players;

    public ArcheryGame(int numberOfArchers){
        players = new Players[numberOfArchers];

    }

    public Players[] getPlayers() {
        return players;
    }

}
