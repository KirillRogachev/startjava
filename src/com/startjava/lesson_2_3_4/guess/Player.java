package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] numbers = new int[10];
    private int attempt;
    private int score;
    static final int MIN_NUMBER = 0;
    static final int MAX_NUMBER = 100;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if(number <= MIN_NUMBER || number > MAX_NUMBER) {
            throw new NumberFormatException("Число должно быть больше 0 и меньше либо равно 100. Повторите ввод: ");
        }
        numbers[attempt++] = number;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}