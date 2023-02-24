package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] expressionParts = expression.split(" ");

            int a = Integer.parseInt(expressionParts[0]);
            char sign = expressionParts[1].charAt(0);
            int b = Integer.parseInt(expressionParts[2]);
            if(numbersNegative(a, b)) {
                return 0;
            }
            return switch(sign) {
                case '+' -> Math.addExact(a, b);
                case '-' -> Math.subtractExact(a, b);
                case '*' -> Math.multiplyExact(a, b);
                case '/' -> (double) a / b;
                case '%' -> Math.floorMod(a, b);
                case '^' -> Math.pow(a, b);
                default -> 0;
            };
    }

    private static boolean numbersNegative(int a, int b) {
        if(a <= 0 || b <= 0) {
            System.out.println("Можно вводить только положительные числа");
            return true;
        } else {
            return false;
        }
    }
}