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
        do {
            System.out.print(player1.getName() + ", ваш ход: ");
            player1.setNumber(scanner.nextInt());
            if(player1.getNumber() == secretNum) {
                System.out.println("Число угадано! Победил игрок " + player1.getName());
                break;
            }
            if(player1.getNumber() > secretNum) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }
            
            System.out.print(player2.getName() + ", ваш ход: ");
            player2.setNumber(scanner.nextInt());
            if(player2.getNumber() == secretNum) {
                System.out.println("Число угадано! Победил игрок " + player2.getName());
                break;
            }
            if(player2.getNumber() > secretNum) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }
        } while(true);
    }
}