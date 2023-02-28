package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while(!playerAnswer.equals("no")) {
            if(playerAnswer.equals("yes")) {
                game.launch();
                player1.clearNumbers();
                player2.clearNumbers();
                player1.setAttempt(0);
                player2.setAttempt(0);
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.nextLine();
        }
    }
}