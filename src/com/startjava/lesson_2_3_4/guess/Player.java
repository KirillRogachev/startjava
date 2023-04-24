package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int ATTEMPT_LIMIT = 10;
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private String name;
    private int[] numbers = new int[ATTEMPT_LIMIT];
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
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

    public void addNumber(int number) {
        if(number < START_RANGE || number > END_RANGE) {
            throw new NumberFormatException("Число должно быть больше 0 и меньше либо равно 100. Повторите ввод: ");
        }
        numbers[attempt++] = number;
    }

    public void incrementScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}