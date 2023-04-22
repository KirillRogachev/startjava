package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private int secretNum;
    private Player[] players;
    static final int ROUNDS_LIMIT = 3;
    static final int ATTEMPT_LIMIT = 10;

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
                    if(player.getAttempt() < ATTEMPT_LIMIT) {
                        System.out.print(player.getName() + ", ваш ход: ");
                        addNumber(player);
                        if(checkNumber(player)) {
                            isSecretNumFound = true;
                            break;
                        }
                    } else {
                        System.out.println("У игрока " + player.getName() + " закончились попытки");
                    }
                }
            }
            printNumbers(players);
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

    private void addNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                player.addNumber(scanner.nextInt());
                break;
            } catch (NumberFormatException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    private boolean checkNumber(Player player) {
        if(player.getNumber() == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + secretNum + " с " +
                    (player.getAttempt()) + " попытки");
            player.incrementScore();
            return true;
        }
        System.out.print("Число " + player.getNumber());
        System.out.print(player.getNumber() > secretNum ? " больше" : " меньше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private void printNumbers(Player[] players) {
        for(Player player: players) {
            int[] playerNumbers = player.getNumbers();
            System.out.print("\nЧисла, названные игроком " + player.getName() + ": ");
            for(int number : playerNumbers) {
                System.out.print(number + " ");
            }
        }
    }

    private void determineWinner() {
        System.out.println("\n\nИтог игры");
        if(players[0].getScore() > 1) {
            System.out.println("Победил игрок: " + players[0].getName());
        } else if(players[1].getScore() > 1) {
            System.out.println("Победил игрок: " + players[1].getName());
        } else if(players[2].getScore() > 1) {
            System.out.println("Победил игрок: " + players[2].getName());
        } else {
            System.out.println("Ничья");
        }
        for(Player player : players) {
            player.clearScore();
        }
    }
}