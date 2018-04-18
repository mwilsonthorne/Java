import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int value;

public Hand() {
    this.cards = new ArrayList<Card>();
    value = 0;
}

public void addCard(Card card){
    this.cards.add(card);
    this.value += card.getValue();

}

public int getNumberOfCards() {
    return this.cards.size();
}

public int getHandValue() {
    return this.value;

}

















}
