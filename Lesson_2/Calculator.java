public class Calculator {
    
    private int a;
    private int b;
    private char sign;
    private double result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+' : 
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = (double) a / b;
                break;
            case '^' :
                result = 1;
                for(int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
        }
        System.out.println("Результат = " + result);
    }
}