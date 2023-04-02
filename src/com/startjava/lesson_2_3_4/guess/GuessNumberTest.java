package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PLAYERS_QUANTITY = 3;
        Player[] players = new Player[PLAYERS_QUANTITY];
        for(int i = 0; i < PLAYERS_QUANTITY; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
        String playerAnswer = "yes";
        while(!playerAnswer.equals("no")) {
            if(playerAnswer.equals("yes")) {
                game.launch();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.nextLine();
        }
    }
}