package jp.ac.uryukyu.ie.java;

import java.util.ArrayList;
import java.util.Collections;

public class Trump {
    private int number;

    //52枚のカードを格納するリストdeckを生成
    ArrayList<Integer> deck = new ArrayList<>(52);


    public int shuffleDeck(){
        for(int i = 1;i <= 52; i++){
            deck.add(i);//deckに追加
        }

        Collections.shuffle(deck);
        //割ったときのあまりを使い、52枚のカードを1から13までの4セットのカードにする。
        number = deck.get(0) % 13;
        if (number == 0){
            number = 13;
        }
        //numberに数字か入っているかの確認用コード
        //System.out.println("あなたが引いたのは" + number);

        //山札が52枚あるか、シャッフルされているかの確認用コード
        /*for (int i = 0;i<deck.size();i++){
            System.out.println(deck.get(i));
        }*/
        return number;
    }
}
