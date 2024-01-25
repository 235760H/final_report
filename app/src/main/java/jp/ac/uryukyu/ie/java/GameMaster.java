package jp.ac.uryukyu.ie.java;

import java.util.Scanner;

public class GameMaster {
    /*public void judge(Player player1,  Player player2){
        Trump trump = new Trump();
        if(player1.getHand() > player2.getHand()){
            System.out.println(player1.getName() + "player1の勝ちです。");
        }else{
            System.out.println(player2.getName() + "player2の勝ちです。");
        }
    }*/

    public boolean scanner(Player player1,  Player player2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("highかlowを選んでください。 high:h low:l");
        String input_text = scanner.nextLine();
        System.out.println(input_text + "が入力されました。");
        scanner.close();
        if (input_text.equals("h")) {
            if(player1.getHand() > player2.getHand()){
                System.out.println("あなたの勝ちです。");
            }else if(player1.getHand() == player2.getHand()){
                System.out.println("引き分けです。");
            }else{
                System.out.println(player2.getName() + "の勝ちです。");
            }
        }else if (input_text.equals("l")) {
            if (player1.getHand() < player2.getHand()) {
                System.out.println("あなたの勝ちです。");
            }else if(player1.getHand() == player2.getHand()){
                System.out.println("引き分けです。");
            }else{
                System.out.println(player2.getName() + "の勝ちです。");
            }
        }else{
            System.out.println("highかlowを選んでください。");
        }
        return true;
    }
}

