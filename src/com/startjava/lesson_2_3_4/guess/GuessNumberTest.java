package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int playersQuantity = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(playersQuantity));
        String playerAnswer = "yes";
        while(!playerAnswer.equals("no")) {
            if(playerAnswer.equals("yes")) {
                game.launch();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.nextLine();
        }
    }

    private static Player[] createPlayers(int playersQuantity) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[playersQuantity];
        for(int i = 0; i < playersQuantity; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}