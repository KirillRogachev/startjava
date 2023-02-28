package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
                player1.setNumber(scanner.nextInt());
                if(player1.getNumber() == secretNum) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + secretNum + " с " +
                            (player1.getAttempt()) + " попытки");
                    break;
                }
                if(player1.getNumber() > secretNum) {
                    System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            if(player2.getAttempt() < 10) {
                System.out.print(player2.getName() + ", ваш ход: ");
                player2.setNumber(scanner.nextInt());
                if(player2.getNumber() == secretNum) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + secretNum + " с " +
                            (player2.getAttempt()) + " попытки");
                    break;
                }
                if(player2.getNumber() > secretNum) {
                    System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                break;
            }
        }

        int[] player1Numbers = Arrays.copyOf(player1.getNumbers(), player1.getAttempt());
        int[] player2Numbers = Arrays.copyOf(player2.getNumbers(), player2.getAttempt());

        System.out.print("Числа, названные игроком " + player1.getName() + ": ");
        for(int i = 0; i < player1Numbers.length; i++) {
            System.out.print(player1Numbers[i] + " ");
        }
        System.out.print("\nЧисла, названные игроком " + player2.getName() + ": ");
        for(int i = 0; i < player2Numbers.length; i++) {
            System.out.print(player2Numbers[i] + " ");
        }
    }
}