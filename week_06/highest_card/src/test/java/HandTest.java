import org.junit.Before;

public class HandTest {

    Hand hand;
    Card card;
    Card card2;

    @Before
    public void before() {
        hand = new Hand();
        card = new Card(Suit.CLUBS, Rank.JACK);
    }

}
