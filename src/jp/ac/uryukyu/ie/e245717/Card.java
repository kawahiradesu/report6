package jp.ac.uryukyu.ie.e245717;



public class Card {
    private String rank;
    private int value;

    public Card(String rank, int vallue){
        this.rank = rank;
        this.value = value;
    }

    //ゲッター
    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public void chosevalue(int value){
        this.value = value;
    }
}
