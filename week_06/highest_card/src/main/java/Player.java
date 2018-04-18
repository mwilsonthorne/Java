import java.util.ArrayList;


    public class Player{

        private Hand hand;
        private String name;

        public Player(String name, Hand hand) {
            this.name = name;
            this.hand = hand;

        }

       public String getName() {
            return this.name;
       }

        public Hand getHand() {
            return hand;
        }

        public void addCardToHand(Card card){
            this.hand.addCard(card);
        }

        public int getHandValue() {
            return this.hand.getHandValue();
        }
    }

