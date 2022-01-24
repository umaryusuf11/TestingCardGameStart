import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Player player = new Player(PlayerType.USER, "p1", 3);

    @Test
    void hasWon() {
        player.setWinner(true);
        assertTrue(player.hasWon());
    }

    @Test
    void getPlayerType() {
        assertEquals(PlayerType.USER, player.getPlayerType());
    }

    @Test
    void hasHand() {
        assertFalse(player.hasHand());
    }

    @Test
    void getHand() {
        assertNull(player.getHand());
    }

}
