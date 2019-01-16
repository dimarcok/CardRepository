package carddemo;
public class Card {
    private String suit; // hearts, diamonds, spades, clubs
    private int value; // 1-13 (A = 1, J = 11, Q = 12, K = 13)
    
    public Card (String suit, int value) {
        if (suit.equals("hearts") || suit.equals("diamonds") || 
                suit.equals("spades") || suit.equals("clubs")){
            this.suit = suit;
        } else {
            System.out.println("Suit is not valid");
            System.out.println("Please choose hearts, diamonds, spades, or clubs");
        }
        if (value > 0 && value <= 13) {
             this.value = value;
        } else {
            System.out.println("Number must be between 1-13");
        } 
    }
    
    void setSuit (String suit) {
        if (suit.equals("hearts") || suit.equals("diamonds") || 
                suit.equals("spades") || suit.equals("clubs")){
            this.suit = suit;
        } else {
            System.out.println("Suit is not valid");
            System.out.println("Please choose hearts, diamonds, spades, or clubs");
        }
    }
    
    String getSuit () {
        return suit;
    }
    
    void setValue (int value) {
        if (value > 0 && value <= 13) {
             this.value = value;
        } else {
            System.out.println("Number must be between 1-13");
        } 
    }
    int getValue () {
        return value;
    }
}