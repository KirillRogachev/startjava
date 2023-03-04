package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        secretNum = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");

        while(true) {
            if(player1.getAttempt() < 10) {
                System.out.print(player1.getName() + ", ваш ход: ");
                player1.addNumber(scanner.nextInt());
                if(checkNumber(player1)) break;
            } else {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            if(player2.getAttempt() < 10) {
                System.out.print(player2.getName() + ", ваш ход: ");
                player2.addNumber(scanner.nextInt());
                if(checkNumber(player2)) break;
            } else {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private boolean checkNumber(Player player) {
        if(player.getNumber() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " +
                    (player.getAttempt()) + " попытки");
            return true;
        }
        if(player.getNumber() > secretNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] playerNumbers = player.getNumbers();
        System.out.print("\nЧисла, названные игроком " + player.getName() + ": ");
        for(int i = 0; i < playerNumbers.length; i++) {
            System.out.print(playerNumbers[i] + " ");
        }
    }
}