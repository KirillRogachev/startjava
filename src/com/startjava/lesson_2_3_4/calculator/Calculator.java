package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String userInput) {
            String[] inputItems = userInput.split(" ");
            try {
            checkNumbers(Double.parseDouble(inputItems[0]), Double.parseDouble(inputItems[2]));
            int a = Integer.parseInt(inputItems[0]);
            char sign = inputItems[1].charAt(0);
            int b = Integer.parseInt(inputItems[2]);
            return switch(sign) {
                case '+' -> Math.addExact(a, b);
                case '-' -> Math.subtractExact(a, b);
                case '*' -> Math.multiplyExact(a, b);
                case '/' -> (double) a / b;
                case '%' -> Math.floorMod(a, b);
                case '^' -> Math.pow(a, b);
                default -> 0;
            };
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите корректные значения");
            return 0;
        }
    }
    public static void checkNumbers(double a, double b) {
        if((a % 1 != 0) || (b % 1 != 0) || (a <= 0) || (b <= 0)) {
            System.out.println("Можно вводить только целые положительные числа");
        }
    }
}