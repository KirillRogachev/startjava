package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private int secretNum;
    private Player[] players;
    static final int ROUNDS_QUANTITY = 3;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void launch() {
        drawLots();
        System.out.print("\nУ каждого игрока по 10 попыток");
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= ROUNDS_QUANTITY; i++) {
            System.out.println("\n\nРаунд " + i);
            secretNum = (int) (Math.random() * 100 + 1);
            nextRound:
            while(true) {
                for(int j = 0; j < players.length; j++) {
                    if (players[j].getAttempt() < 10) {
                        System.out.print(players[j].getName() + ", ваш ход: ");
                        while(true) {
                            try {
                                players[j].addNumber(scanner.nextInt());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.print(e.getMessage());
                            }
                        }
                        if (checkNumber(players[j])) {
                            break nextRound;
                        }
                    } else {
                        System.out.println("У игрока " + players[j].getName() + " закончились попытки");
                    }
                }
            }
            for(Player player : players) {
                printNumbers(player);
                player.clearAttempts();
            }
        }

        System.out.println("\n\nИтог игры");
        if(players[0].getWinsCount() > 1) {
            System.out.println("Победил игрок: " + players[0].getName());
        } else if(players[1].getWinsCount() > 1) {
            System.out.println("Победил игрок: " + players[1].getName());
        } else if(players[2].getWinsCount() > 1) {
            System.out.println("Победил игрок: " + players[2].getName());
        } else {
            System.out.println("Ничья");
        }
        for(Player player : players) {
            player.clearWinsCount();
        }
    }

    private void drawLots() {
        System.out.println("Бросаем жребий");
        for (int i = players.length - 1; i >= 1; i--) {
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

    private boolean checkNumber(Player player) {
        if(player.getNumber() == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + secretNum + " с " +
                    (player.getAttempt()) + " попытки");
            player.addWinsCount();
            return true;
        }
        System.out.print("Число " + player.getNumber());
        System.out.print(player.getNumber() > secretNum ? " больше" : " меньше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private void printNumbers(Player player) {
        int[] playerNumbers = player.getNumbers();
        System.out.print("\nЧисла, названные игроком " + player.getName() + ": ");
        for(int number : playerNumbers) {
            System.out.print(number + " ");
        }
    }
}