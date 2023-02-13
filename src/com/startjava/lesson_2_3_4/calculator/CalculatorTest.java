package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        while(!userAnswer.equals("no")) {
            if(userAnswer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                calculator.setUserInput(scanner.nextLine());
                System.out.println("Результат = " + format.format(calculator.calculate()));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scanner.nextLine();
        }
    }
}