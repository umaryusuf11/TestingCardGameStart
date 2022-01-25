import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Player player = new Player(PlayerType.USER, "p1", 3);

    @Test
    void hasWon() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        player.setWinner(true);
        assertTrue(player.hasWon());
    }

    @Test
    void hasNotWon() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        player.setWinner(false);
        assertFalse(player.hasWon());
    }

    @Test
    void getPlayerTypeUser() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        assertEquals(PlayerType.USER, player.getPlayerType());
    }

    @Test
    void getPlayerTypeComputer() {
        Player player = new Player(PlayerType.COMPUTER, "p1", 3);
        assertEquals(PlayerType.COMPUTER, player.getPlayerType());
    }

    @Test
    void getPlayerTypeDealer() {
        Player player = new Player(PlayerType.DEALER, "p1", 3);
        assertEquals(PlayerType.DEALER, player.getPlayerType());
    }

    @Test
    void hasHand() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        player.setHand(new Hand());
        assertTrue(player.hasHand());
    }

    @Test
    void notHasHand() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        assertFalse(player.hasHand());
    }

    @Test
    void getHand() {
        Player player = new Player(PlayerType.USER, "p1", 3);
        assertNull(player.getHand());
    }

}
