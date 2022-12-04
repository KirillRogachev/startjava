public class Calculator {
    public static void main (String[] args) {
        int a = 6;
        int b = 4;
        char sign = '^';
        int result = 0;
        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = a / b;
        } else if(sign == '^') {
            result = a;
            for(int i = 1; i < b; i++) {
                result *= a;
            }
        } else if(sign == '%') {
            result = a % b;
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}