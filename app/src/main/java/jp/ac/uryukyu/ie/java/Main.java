package jp.ac.uryukyu.ie.java;

public class Main {
    public static void main(String[] args){
        //ゲームマスターを生成
        GameMaster gamemaster = new GameMaster();
        //山札を作成
        Trump decks = new Trump();
        //シャッフルする
        decks.shuffleDeck();

        //プレイヤーを生成
        Player player = new Player("player");
        //ディーラーを生成
        Player dealer = new Player("dealer");
        //プレイヤーがドロー
        player.Draw(decks);
        //ディーラーがドロー
        dealer.Draw(decks);

        //ディーラーのカードを先に提示する
        System.out.println(dealer.getName() + "のカードは" + dealer.getHand() + "です。");

        //ゲームマスターがhighかlowかを聞いて、その選択によって勝ちか負けかを決める
        gamemaster.scanner(player, dealer);

        //自分の手札を出力
        System.out.println("あなたのカードは" + player.getHand() + "でした。");
    }
}
