import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {

    @Test
    void getDeck() {
        CardGame cardGame = new CardGame();
        assertNotNull(cardGame.getDeck());
    }

    @Test
    void getDeckExists() {
        CardGame cardGame = new CardGame(
                "D3,D2,D5,HA,H2,H3,H4,H5,H6,H7,H8,H9,H10,HJ,HQ,HK,S3,S2,S5,SA,S2,S3,S4,S5,S6,S7,S8,S9,S10,SJ,SQ,SK");
        assertNotNull(cardGame.getDeck());
    }

    @Test
    void dealHand() {
        CardGame cardGame = new CardGame();
        Hand hand = new Hand();
        hand = cardGame.dealHand(hand, 3);
        assertEquals(3, hand.size());
    }

    @Test
    void dealHandOverride() {
        CardGame cardGame = new CardGame(
                "D3,D2,D5,HA,H2,H3,H4,H5,H6,H7,H8,H9,H10,HJ,HQ,HK,S3,S2,S5,SA,S2,S3,S4,S5,S6,S7,S8,S9,S10,SJ,SQ,SK");
        Hand hand = new Hand();
        hand = cardGame.dealHand(hand, 3);
        assertEquals(3, hand.size());
    }

}
