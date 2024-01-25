package jp.ac.uryukyu.ie.java;

public class Player {
    private int hand;//手札
    private String name;

    public Player(String name){
        this.name = name;
    }

    public int getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public void Draw(Trump decks){
        Trump trump = new Trump();
        
        //シャッフルされた山札から1枚目だけを手札に加える。
        hand = trump.shuffleDeck();
    }
}
