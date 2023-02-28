package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        while(!userAnswer.equals("no")) {
            if(userAnswer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                try {
                    System.out.printf("Результат = %f\n", Calculator.calculate(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Можно вводить только целые числа");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scanner.nextLine();
        }
    }
}