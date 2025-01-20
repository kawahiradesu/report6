package jp.ac.uryukyu.ie.e245717;

public class Test {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.draw();
        System.out.println("Drawn card: " + card.getRank() + " with value " + card.getValue());
    }
}
