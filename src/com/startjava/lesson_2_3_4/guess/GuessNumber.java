package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPT_LIMIT = 10;
    private int secretNum;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void launch() {
        castLots();
        System.out.print("\nУ каждого игрока по " + ATTEMPT_LIMIT + " попыток");
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= ROUNDS_LIMIT; i++) {
            System.out.println("\n\nРаунд " + i);
            secretNum = (int) (Math.random() * 100 + 1);
            boolean isSecretNumFound = false;
            while(!isSecretNumFound) {
                for(Player player : players) {
                    System.out.print(player.getName() + ", ваш ход: ");
                    addNumber(player, scanner);
                    if(isGuessed(player)) {
                        isSecretNumFound = true;
                        break;
                    }
                    if(player.getAttempt() == ATTEMPT_LIMIT) {
                        System.out.println("У игрока " + player.getName() + " закончились попытки");
                    }
                }
                if(players[players.length - 1].getAttempt() == ATTEMPT_LIMIT) break;
            }
            printPlayersNumbers();
            for(Player player : players) {
                player.clearAttempts();
            }
        }
        determineWinner();
    }

    private void castLots() {
        System.out.println("Бросаем жребий");
        for(int i = players.length - 1; i >= 1; i--) {
            int j = (int) (Math.random() * (i + 1));
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
        System.out.print("Порядок угадывания числа: ");
        for(int i = 0; i < players.length; i++) {
            System.out.print(players[i].getName()+ "  ");
        }
    }

    private void addNumber(Player player, Scanner scanner) {
        while(true) {
            try {
                player.addNumber(scanner.nextInt());
                break;
            } catch (NumberFormatException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    private boolean isGuessed(Player player) {
        int number = player.getNumber();
        if(number == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + secretNum + " с " +
                    (player.getAttempt()) + " попытки");
            player.incrementScore();
            return true;
        }
        System.out.println("Число " + number + (number > secretNum ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private void printPlayersNumbers() {
        for(Player player : players) {
            int[] numbers = player.getNumbers();
            System.out.print("\nЧисла, названные игроком " + player.getName() + ": ");
            for(int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

    private void determineWinner() {
        System.out.println("\n\nИтог игры");
        int winnerIndex = 0;
        boolean isGameDraw = true;
        for(int i = 1; i < players.length; i++) {
            if(players[i].getScore() > players[winnerIndex].getScore()) {
                winnerIndex = i;
            }
            if(players[i].getScore() != players[i - 1].getScore()) {
                isGameDraw = false;
            }
        }
        if(isGameDraw) {
            System.out.println("Ничья");
        } else {
            System.out.println("Победил игрок: " + players[winnerIndex].getName());
        }
        for(Player player : players) {
            player.clearScore();
        }
    }
}