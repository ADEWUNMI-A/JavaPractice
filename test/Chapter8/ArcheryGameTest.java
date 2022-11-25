package Chapter8;
import Chapter8.ArcheryGraphics.ArcheryGame;
import Chapter8.ArcheryGraphics.Players;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    private ArcheryGame game;

    @BeforeEach
    public void startAllTestWith() {
        game = new ArcheryGame(1);
    }

    @Test
    public void testThatArcheryGameExist() {
        assertNotNull(game);
    }


//    @Test
//    public void testThatPlayersCanExistInArcheryGame() {
//        Players[] players = game.getPlayers();
//        assertNotNull(players);
//        assertTrue(players.length > 0);
//    }
//
//    @Test
//    public void testThatGameExist(){
//        Players[] players = game.getPlayers();
//        Players players = game.getPlayers();
//        assertNotNull(players);
//    }
}