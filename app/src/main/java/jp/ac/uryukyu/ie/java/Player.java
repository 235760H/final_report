package jp.ac.uryukyu.ie.java;

public class Player {
    private int hand;//手札
    private String name;

    public Player(String name){
        this.name = name;
    }

    //handの値を取得するためのgetterメソッド
    public int getHand(){
        return hand;
    }

    //nameを取得するためのgetterメソッド
    public String getName(){
        return name;
    }

    //ドローして手札に加えるメソッド
    public void Draw(Trump decks){
        Trump trump = new Trump();
        
        //シャッフルされた山札から1枚目だけを手札に加える。
        hand = trump.shuffleDeck();
    }
}
