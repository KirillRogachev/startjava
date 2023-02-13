package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;
    private String userInput;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public double calculate() {
        String[] inputItems = userInput.split(" ");
        a = Integer.parseInt(inputItems[0]);
        sign = inputItems[1].charAt(0);
        b = Integer.parseInt(inputItems[2]);
        double result = 0;
        switch(sign) {
            case '+' : 
                result = Math.addExact(a, b);
                break;
            case '-' :
                result = Math.subtractExact(a, b);
                break;
            case '*' :
                result = Math.multiplyExact(a, b);
                break;
            case '/' :
                result = (double) a / b;
                break;
            case '%' :
                result = Math.floorMod(a, b);
                break;
            case '^' :
                result = Math.pow(a, b);
                break;
        }
        return result;
    }
}