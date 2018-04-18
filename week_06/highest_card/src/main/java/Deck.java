import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
        populateDeck();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void addCard(Card newCard) {
        this.cards.add(newCard);
    }

    public Card removeCard(){
        return this.cards.remove(0);
    }


    public void populateDeck(){

        //create 4 aces and add them


        for (Suit aSuit : Suit.values()) {
            System.out.println("This will print out one of each card");

            for (Rank aRank: Rank.values()){
                System.out.println("This will print out some cards");
                Card newCard = new Card(aSuit, aRank);
                addCard(newCard);

                System.out.println("A NEW CARD IS: "+ newCard.getRank() + " of " + newCard.getSuit() + " and card count is: " + getCardCount());

            }


        }






    }

    public Card getCard(){
        return cards.remove(0);
    }





}
