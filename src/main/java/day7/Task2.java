package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player[] players = new Player[7];
        for (int i = 0; i < 7; i++) {
            players[i] = new Player(rand.nextInt(100 - 90 + 1));
        }

        Player.info();
        System.out.println(Player.getCountPlayers());

        while (true) {
            if (players[0].getStamina() == 0) {
                players[0].run();
                break;
            }
            players[0].run();
        }
        Player.info();
        System.out.println(Player.getCountPlayers());
    }
}
