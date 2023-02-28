package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] numbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int playerNumber) {
        numbers[attempt++] = playerNumber;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        return numbers;
    }
    public void clearNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}