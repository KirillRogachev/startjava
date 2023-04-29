package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int COUNT_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(COUNT_PLAYERS));
        String playerAnswer = "yes";
        while(!playerAnswer.equals("no")) {
            if(playerAnswer.equals("yes")) {
                game.launch();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.nextLine();
        }
    }

    private static Player[] createPlayers(int countPlayers) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[countPlayers];
        for(int i = 0; i < countPlayers; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}