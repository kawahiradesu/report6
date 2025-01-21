package jp.ac.uryukyu.ie.e245717;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Player player = new Player();

        // 初期の2枚ドロー
        for (int i = 0; i < 2; i++) {
            player.drawCard(deck.draw());
            dealer.drawCard(deck.draw());
        }

        System.out.println("あなたの手札: " + player.getHand());
        System.out.println("ディーラーの手札: " + dealer.getHand().get(0));

        // プレイヤーのターン
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("あなたの点数: " + player.getTotalScore());
            System.out.print("カードを引く? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                player.drawCard(deck.draw());
                System.out.println("あなたの手札: " + player.getHand());
                if (player.getTotalScore() > 21) {
                    System.out.println("Bust! You lose.");
                    return;
                }
            } else {
                break;
            }
        }

        // ディーラーのターン
        dealer.play(deck);

        System.out.println("ディーラーの手札: " + dealer.getHand());
        System.out.println("ディーラーの点数: " + dealer.getTotalScore());

        // 勝敗判定
        if (dealer.getTotalScore() > 21 || player.getTotalScore() > dealer.getTotalScore()) {
            System.out.println("You win!");
        } else if (player.getTotalScore() == dealer.getTotalScore()) {
            System.out.println("引き分け!");
        } else {
            System.out.println("Dealer wins!");
        }

        scanner.close();
    }
}
