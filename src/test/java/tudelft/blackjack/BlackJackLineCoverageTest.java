package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void rightPlayerWins() {
        int result = new BlackJack().play(8, 20);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void bothPlayersSameValid() {
        int result = new BlackJack().play(18, 18);
        Assertions.assertEquals(18, result);
    }

    @Test
    public void onePlayerBusts() {
        int result = new BlackJack().play(22, 19);
        Assertions.assertEquals(19, result);
    }
}