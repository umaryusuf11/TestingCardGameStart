import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class BlackJackTest {

    @Test
    void getScore() {
        BlackJack blackJack = new BlackJack();
        Hand hand = new Hand("C5,D3,S7");
        assertEquals(15, blackJack.getScore(hand));
    }

    @Test
    void getScoreAceHigh() {
        BlackJack blackJack = new BlackJack();
        Hand hand = new Hand("DA,C2");
        assertEquals(13, blackJack.getScore(hand));
    }

    @Test
    void getScoreAceLow() {
        BlackJack blackJack = new BlackJack();
        Hand hand = new Hand("DA,S7,H9");
        assertEquals(17, blackJack.getScore(hand));
    }

    @Test
    void getScoreFive() {
        BlackJack blackJack = new BlackJack();
        Hand hand = new Hand("C5,D3,S4,H5,D3");
        assertEquals(20, blackJack.getScore(hand));
    }

    @Test
    void determineWinner() {
        BlackJack blackJack = new BlackJack();
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player(PlayerType.USER, "p1", 3);
        Player player2 = new Player(PlayerType.USER, "p2", 3);

        player1.setHand(new Hand("C7,D4,S6"));
        player2.setHand(new Hand("C5,D3,S7"));

        players.add(player1);
        players.add(player2);

        assertEquals(player1, blackJack.determineWinner(players));

    }

}
