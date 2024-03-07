import java.util.*;

class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();


    public void createDeck(){
        String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] suit = {"Spades","Diamonds","Clubs","Hearts"};

        for(String s:suit){
            for(String v:values){
                cards.add(new Card(s,v));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public void printDeck(){
        for(Card card:cards){
            System.out.println(card);
        }
    }

    public void dealCard(){
        shuffleDeck();
        for(int i = 1; i <= 5; i ++){
            System.out.println(cards.get(i));
        }
    }

    public boolean sameSuit(int x,int y){
        if((cards.get(x).getSuit()).equals(cards.get(y).getSuit())){
            return true;
        }
        else{
            return false;
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < cards.size()) {
            System.out.println(cards.get(index));
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }


    public void compareCard(String value) {
        for (Card card : cards) {
            if (card.getValue().equalsIgnoreCase(value)) {
                System.out.println(card);
            }
        }
    }

    public void findCard(String value, String suit) {
        for (Card card : cards) {
            if (card.getValue().equalsIgnoreCase(value) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

}