import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;
    Card card2;
    Card card3;

    @Before
    public void before(){
        card1 = new Card(Suit.HEARTS, Rank.ACE);
        card2 = new Card(Suit.SPADES, Rank.QUEEN);
        card3 = new Card(Suit.DIAMONDS, Rank.FIVE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card1.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.ACE, card1.getRank());
    }
}