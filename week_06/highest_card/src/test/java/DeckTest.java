import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void Before(){
        deck = new Deck();

    }

//    @Test
//    public void deckStartsEmpty(){
//        assertEquals(0, deck.getCardCount());
//    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(53, deck.getCardCount());
    }

    @Test
    public void canRemoveCard(){
        deck.addCard(card);
        assertEquals(53, deck.getCardCount());
        deck.removeCard();
        assertEquals(52, deck.getCardCount());
    }


    @Test
    public void canPopulate(){

        deck.populateDeck();
        assertEquals(104, deck.getCardCount());

    }




}
