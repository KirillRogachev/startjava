import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        do {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scanner.next();
                if(userAnswer.equals("no") || userAnswer.equals("yes")) {
                    break;
                }
                System.out.println("Введен недопустимый ответ");
            } while(true);
        } while(userAnswer.equals("yes"));
    }
}