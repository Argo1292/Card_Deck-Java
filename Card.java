public class Card{
    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    // Getters and Setters for suit
    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String getValue(){
        return suit;
    }

    public void setValue(String suit){
        this.suit = suit;
    }

    public String toString(){
        return "\n" + value + "of" + suit;
    }
}