package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);
        if(checkNegativeNumbers(a, b)) {
            throw new ArithmeticException();
        }
        return switch(sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / b;
            case '%' -> Math.floorMod(a, b);
            case '^' -> Math.pow(a, b);
            default -> {
                System.out.println("Такая операция не поддерживается");
                yield 0;
            }
        };
    }

    private static boolean checkNegativeNumbers(int a, int b) {
        if(a <= 0 || b <= 0) {
            return true;
        }
        return false;
    }
}