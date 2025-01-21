package jp.ac.uryukyu.ie.e245717;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand = new ArrayList<>();
    private int totalScore = 0;

    public void drawCard(Card card) {
        hand.add(card);
        totalScore += card.getValue();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void play(Deck deck) {
        while (totalScore < 18) {
            Card card = deck.draw();
            drawCard(card);
            System.out.println("Dealer drew: " + card);
        }
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
