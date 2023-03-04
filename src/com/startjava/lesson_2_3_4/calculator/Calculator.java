package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);
        if(!isPositiveNumbers(a, b)) {
            throw new ArithmeticException("Можно вводить только положительные числа");
        }
        return switch(sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / b;
            case '%' -> Math.floorMod(a, b);
            case '^' -> Math.pow(a, b);
            default -> {
                System.out.println("Операция " + sign +" не поддерживается");
                yield 0;
            }
        };
    }

    private static boolean isPositiveNumbers(int a, int b) {
        return (a > 0 && b > 0);
    }
}