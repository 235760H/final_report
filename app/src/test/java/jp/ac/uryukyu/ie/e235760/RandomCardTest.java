package jp.ac.uryukyu.ie.e235760;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import jp.ac.uryukyu.ie.java.Player;
import jp.ac.uryukyu.ie.java.Trump;

public class RandomCardTest {
    @Test
    void DrawTest(){
        //プレイヤーを生成
        Player player = new Player("player");
        //山札を生成
        Trump decks = new Trump();
        //シャッフル
        decks.shuffleDeck();
        //山札から1枚取り出す
        player.Draw(decks);
        //ドローできているなら0にはならないはず
        assertNotEquals(0, player.getHand());
    }
}
