package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        while(!userAnswer.equals("no")) {
            if(userAnswer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                System.out.format("Результат = %f\n", Calculator.calculate(scanner.nextLine()));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scanner.nextLine();
        }
    }
}