package carddemo;
public class CardDealer {
    public static void main (String args[]) {
        Card card1 = new Card("clubs", 1);
        System.out.println(card1.getSuit());
        card1.setSuit("diamonds");
        System.out.println(card1.getSuit());
        System.out.println(card1.getValue());
        System.out.println("Added this change at the end");
        
    }
}