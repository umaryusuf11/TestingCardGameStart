import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {

    CardGame cardGame = new CardGame();

    @Test
    void getDeck() {
        assertNotNull(cardGame.getDeck());
    }

    @Test
    void dealHand() {
        Hand hand = new Hand();
        hand = cardGame.dealHand(hand, 3);
        assertEquals(3, hand.size());
    }

}
